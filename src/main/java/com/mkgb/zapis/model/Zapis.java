package com.mkgb.zapis.model;

import java.util.Date;

import com.mkgb.sluchacz.model.Sluchacz;

public class Zapis {
	private long id;
	private Date dataZapisu;
	private Date dataRezygnacji;
	private String stan;
	private String kontoBankowe;
	private Boolean aktywny;
	
	private Sluchacz sluchacz;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataZapisu() {
		return dataZapisu;
	}

	public void setDataZapisu(Date dataZapisu) {
		this.dataZapisu = dataZapisu;
	}

	public Date getDataRezygnacji() {
		return dataRezygnacji;
	}

	public void setDataRezygnacji(Date dataRezygnacji) {
		this.dataRezygnacji = dataRezygnacji;
	}

	public String getStan() {
		return stan;
	}

	public void setStan(String stan) {
		this.stan = stan;
	}

	public String getKontoBankowe() {
		return kontoBankowe;
	}

	public void setKontoBankowe(String kontoBankowe) {
		this.kontoBankowe = kontoBankowe;
	}

	public Boolean getAktywny() {
		return aktywny;
	}

	public void setAktywny(Boolean aktywny) {
		this.aktywny = aktywny;
	}

	public Sluchacz getSluchacz() {
		return sluchacz;
	}

	public void setSluchacz(Sluchacz sluchacz) {
		this.sluchacz = sluchacz;
	}
}
