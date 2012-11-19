package com.mkgb.uzytkownik.model;

import java.util.Set;

import com.mkgb.filia.model.Filia;
import com.mkgb.wiadomosc.model.Wiadomosc;

public class Pracownik extends Uzytkownik{
	private String nip;
	
	private Filia filia;
	private Set<Wiadomosc> wiadomosci;

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public Filia getFilia() {
		return filia;
	}

	public void setFilia(Filia filia) {
		this.filia = filia;
	}

	public Set<Wiadomosc> getWiadomosci() {
		return wiadomosci;
	}

	public void setWiadomosci(Set<Wiadomosc> wiadomosci) {
		this.wiadomosci = wiadomosci;
	}	
}
