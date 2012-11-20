package com.mkgb.oferta.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.mkgb.oferta.dao.OfertaDao;
import com.mkgb.oferta.model.Oferta;

public class OfertaDaoImpl implements OfertaDao, Serializable {


	private static final long serialVersionUID = 1L;
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Oferta getOfertaById(long id) {
		// TODO Auto-generated method stub
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(Oferta.class);
		crit.add(Restrictions.eq("id", id));
		List<Oferta> list = crit.list();
		if(list.size() == 1)
			return list.get(0);
		else
			return null;
	}

}
