package com.mkgb.oferta.model;

import java.math.BigDecimal;
import java.util.Set;

import com.mkgb.filia.model.Filia;
import com.mkgb.kierunek.model.Kierunek;
import com.mkgb.zapis.model.Zapis;

public class Oferta {
	private long id;
	private int rok;
	private String nabor;
	private BigDecimal cena;
	private Boolean aktywna;
	
	private Kierunek kierunek;
	private Filia filia;
	private Set<Zapis> zapisy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getRok() {
		return rok;
	}

	public void setRok(int rok) {
		this.rok = rok;
	}

	public String getNabor() {
		return nabor;
	}

	public void setNabor(String nabor) {
		this.nabor = nabor;
	}

	public BigDecimal getCena() {
		return cena;
	}

	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}

	public Boolean getAktywna() {
		return aktywna;
	}

	public void setAktywna(Boolean aktywna) {
		this.aktywna = aktywna;
	}

	public Kierunek getKierunek() {
		return kierunek;
	}

	public void setKierunek(Kierunek kierunek) {
		this.kierunek = kierunek;
	}

	public Filia getFilia() {
		return filia;
	}

	public void setFilia(Filia filia) {
		this.filia = filia;
	}

	public Set<Zapis> getZapisy() {
		return zapisy;
	}

	public void setZapisy(Set<Zapis> zapisy) {
		this.zapisy = zapisy;
	}
}
