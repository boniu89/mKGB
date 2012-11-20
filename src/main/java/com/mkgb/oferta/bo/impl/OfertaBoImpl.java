package com.mkgb.oferta.bo.impl;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;

import com.mkgb.oferta.bo.OfertaBo;
import com.mkgb.oferta.dao.OfertaDao;
import com.mkgb.oferta.model.Oferta;

@Transactional(readOnly = true)
public class OfertaBoImpl implements OfertaBo, Serializable {


	private static final long serialVersionUID = 1L;
	
	private OfertaDao ofertaDao;
	
	@Transactional(readOnly = false)
	public OfertaDao getOfertaDao() {
		return ofertaDao;
	}
	
	@Transactional(readOnly = false)
	public void setOfertaDao(OfertaDao ofertaDao) {
		this.ofertaDao = ofertaDao;
	}
	
	@Override
	@Transactional(readOnly = false)
	public Oferta getOfertaById(long id) {
		// TODO Auto-generated method stub
		return ofertaDao.getOfertaById(id);
	}

}
