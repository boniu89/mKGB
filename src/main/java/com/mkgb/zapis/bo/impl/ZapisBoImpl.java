package com.mkgb.zapis.bo.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mkgb.uzytkownik.model.Uzytkownik;
import com.mkgb.zapis.bo.ZapisBo;
import com.mkgb.zapis.dao.ZapisDao;
import com.mkgb.zapis.model.Zapis;

@Transactional(readOnly = true)
public class ZapisBoImpl implements ZapisBo, Serializable {


	private static final long serialVersionUID = 1L;
	
	private ZapisDao zapisDao; 
	
	@Transactional(readOnly = false)
	public ZapisDao getZapisDao() {
		return zapisDao;
	}

	@Transactional(readOnly = false)
	public void setZapisDao(ZapisDao zapisDao) {
		this.zapisDao = zapisDao;
	}

	@Override
	@Transactional(readOnly = false)
	public void addZapis(Zapis zapis) {
		zapisDao.addZapis(zapis);
		
	}

	@Override
	@Transactional(readOnly = false)
	public List<Zapis> findAllZapisyforUzytkownik(Uzytkownik uzytkownik) {
		return zapisDao.findAllZapisyforUzytkownik(uzytkownik);
	}

	@Override
	@Transactional(readOnly = false)
	public List<Zapis> findAllZapisy() {
		return zapisDao.findAllZapisy();
	}

}
