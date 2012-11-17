package com.mkgb.wiadomosc.model;

import com.mkgb.uzytkownik.model.Pracownik;

public class Wiadomosc {
	private long id;
	private String tresc;
	private Boolean aktywna;
	
	private Pracownik pracownik;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTresc() {
		return tresc;
	}

	public void setTresc(String tresc) {
		this.tresc = tresc;
	}

	public Boolean getAktywna() {
		return aktywna;
	}

	public void setAktywna(Boolean aktywna) {
		this.aktywna = aktywna;
	}

	public Pracownik getPracownik() {
		return pracownik;
	}

	public void setPracownik(Pracownik pracownik) {
		this.pracownik = pracownik;
	}
}
