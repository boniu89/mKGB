package com.mkgb.kierunek.model;

import java.util.Set;

import com.mkgb.oferta.model.Oferta;

public class Kierunek {
	private long id;
	private String nazwa;
	private int liczbaSemestrow;
	private Boolean aktywny;
	
	private Set<Oferta> oferty;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getLiczbaSemestrow() {
		return liczbaSemestrow;
	}
	public void setLiczbaSemestrow(int liczbaSemestrow) {
		this.liczbaSemestrow = liczbaSemestrow;
	}
	public Boolean getAktywny() {
		return aktywny;
	}
	public void setAktywny(Boolean aktywny) {
		this.aktywny = aktywny;
	}
	public Set<Oferta> getOferty() {
		return oferty;
	}
	public void setOferty(Set<Oferta> oferty) {
		this.oferty = oferty;
	}
}
