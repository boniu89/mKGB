package com.mkgb.uzytkownik.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import com.mkgb.uzytkownik.dao.UzytkownikDao;
import com.mkgb.uzytkownik.model.Uzytkownik;

public class UzytkownikDaoImpl implements UzytkownikDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addUzytkownik(Uzytkownik uzytkownik) {
		sessionFactory.getCurrentSession().save(uzytkownik);
	}

	@SuppressWarnings("unchecked")
	public List<Uzytkownik> findAllUzytkownicy() {
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(Uzytkownik.class);
		List<Uzytkownik> list = crit.list();
		return list;
	}

}
