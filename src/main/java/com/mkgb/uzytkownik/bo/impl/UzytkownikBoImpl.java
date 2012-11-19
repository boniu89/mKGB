package com.mkgb.uzytkownik.bo.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mkgb.uzytkownik.bo.UzytkownikBo;
import com.mkgb.uzytkownik.dao.UzytkownikDao;
import com.mkgb.uzytkownik.model.Uzytkownik;

@Transactional(readOnly = true)
public class UzytkownikBoImpl implements UzytkownikBo, Serializable {

	private static final long serialVersionUID = 1L;
	
	private UzytkownikDao uzytkownikDao;
	
	@Transactional(readOnly = false)
	public void setUzytkownikDao(UzytkownikDao uzytkownikDao) {
		this.uzytkownikDao = uzytkownikDao;
	}
	
	@Transactional(readOnly = false)
	public void addUzytkownik(Uzytkownik uzytkownik) {
		uzytkownikDao.addUzytkownik(uzytkownik);
	}

	@Transactional(readOnly = false)
	public List<Uzytkownik> findAllUzytkownicy() {
		return uzytkownikDao.findAllUzytkownicy();
	}

}
