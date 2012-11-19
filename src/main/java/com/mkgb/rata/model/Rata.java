package com.mkgb.rata.model;

import java.math.BigDecimal;
import java.util.Date;

import com.mkgb.zapis.model.Zapis;

public class Rata {
	private long id;
	private int numerRaty;
	private BigDecimal kwota;
	private Date dataPlatnosci;
	private Boolean aktywna;
	
	private Zapis zapis;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumerRaty() {
		return numerRaty;
	}

	public void setNumerRaty(int numerRaty) {
		this.numerRaty = numerRaty;
	}

	public BigDecimal getKwota() {
		return kwota;
	}

	public void setKwota(BigDecimal kwota) {
		this.kwota = kwota;
	}

	public Date getDataPlatnosci() {
		return dataPlatnosci;
	}

	public void setDataPlatnosci(Date dataPlatnosci) {
		this.dataPlatnosci = dataPlatnosci;
	}

	public Boolean getAktywna() {
		return aktywna;
	}

	public void setAktywna(Boolean aktywna) {
		this.aktywna = aktywna;
	}

	public Zapis getZapis() {
		return zapis;
	}

	public void setZapis(Zapis zapis) {
		this.zapis = zapis;
	}
}
