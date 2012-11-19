package com.mkgb.uzytkownik.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkgb.uzytkownik.dao.UzytkownikDao;
import com.mkgb.uzytkownik.model.Uzytkownik;

public class UzytkownikDaoImpl extends HibernateDaoSupport implements UzytkownikDao, Serializable{

	public void addUzytkownik(Uzytkownik uzytkownik) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(uzytkownik);
	}

	public List<Uzytkownik> findAllUzytkownicy() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Uzytkownicy");
	}

}
