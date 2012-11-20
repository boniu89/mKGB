package com.mkgb.zapis.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.mkgb.uzytkownik.model.Uzytkownik;
import com.mkgb.zapis.dao.ZapisDao;
import com.mkgb.zapis.model.Zapis;

public class ZapisDaoImpl implements ZapisDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addZapis(Zapis zapis) {
		sessionFactory.getCurrentSession().save(zapis);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Zapis> findAllZapisyforUzytkownik(Uzytkownik uzytkownik) {
		
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(Zapis.class);
		crit.add(Restrictions.eq("sluchacz", uzytkownik));
		List<Zapis> lista = crit.list();
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Zapis> findAllZapisy() {
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(Zapis.class);
		List<Zapis> list = crit.list();
		return list;
	}
	
}
