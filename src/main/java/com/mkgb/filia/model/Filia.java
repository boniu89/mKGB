package com.mkgb.filia.model;

import java.util.Set;

import com.mkgb.oferta.model.Oferta;
import com.mkgb.uzytkownik.model.Pracownik;

public class Filia {
	private long id;
	private String skrot;
	private String nazwa;
	private String adres;
	private String telefon;
	private Boolean aktywna;
	
	private Set<Oferta> oferty;
	private Set<Pracownik> pracownicy;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSkrot() {
		return skrot;
	}
	public void setSkrot(String skrot) {
		this.skrot = skrot;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public Boolean getAktywna() {
		return aktywna;
	}
	public void setAktywna(Boolean aktywna) {
		this.aktywna = aktywna;
	}
	public Set<Oferta> getOferty() {
		return oferty;
	}
	public void setOferty(Set<Oferta> oferty) {
		this.oferty = oferty;
	}
	public Set<Pracownik> getPracownicy() {
		return pracownicy;
	}
	public void setPracownicy(Set<Pracownik> pracownicy) {
		this.pracownicy = pracownicy;
	}
}
