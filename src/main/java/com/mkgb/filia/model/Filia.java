package com.mkgb.filia.model;

public class Filia {
	private long id;
	private String skrot;
	private String nazwa;
	private String adres;
	private String telefon;
	private String aktywna;
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
	public String getAktywna() {
		return aktywna;
	}
	public void setAktywna(String aktywna) {
		this.aktywna = aktywna;
	}
}
