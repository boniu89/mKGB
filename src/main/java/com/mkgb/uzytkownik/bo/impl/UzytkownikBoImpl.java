package com.mkgb.uzytkownik.bo.impl;

import java.io.Serializable;
import java.util.List;

import com.mkgb.uzytkownik.bo.UzytkownikBo;
import com.mkgb.uzytkownik.dao.UzytkownikDao;
import com.mkgb.uzytkownik.model.Uzytkownik;

public class UzytkownikBoImpl implements UzytkownikBo, Serializable {

	private UzytkownikDao uzytkownikDao;
	
	public void setUzytkownikDao(UzytkownikDao uzytkownikDao) {
		this.uzytkownikDao = uzytkownikDao;
	}
	
	public void addUzytkownik(Uzytkownik uzytkownik) {
		// TODO Auto-generated method stub
		uzytkownikDao.addUzytkownik(uzytkownik);
	}

	public List<Uzytkownik> findAllUzytkownicy() {
		// TODO Auto-generated method stub
		return uzytkownikDao.findAllUzytkownicy();
	}

}
