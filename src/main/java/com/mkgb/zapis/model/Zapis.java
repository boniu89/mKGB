package com.mkgb.zapis.model;

import java.util.Date;
import java.util.Set;

import com.mkgb.oferta.model.Oferta;
import com.mkgb.rata.model.Rata;
import com.mkgb.uzytkownik.model.Sluchacz;

public class Zapis {
	private long id;
	private Date dataZapisu;
	private Date dataRezygnacji;
	private String stan;
	private String kontoBankowe;
	private Boolean aktywny;
	
	private Sluchacz sluchacz;
	private Sluchacz sluchaczPolecajacy;
	private Oferta oferta;
	private Set<Rata> raty;

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
	
	public Sluchacz getSluchaczPolecajacy() {
		return sluchaczPolecajacy;
	}

	public void setSluchaczPolecajacy(Sluchacz sluchaczPolecajacy) {
		this.sluchaczPolecajacy = sluchaczPolecajacy;
	}

	public Oferta getOferta() {
		return oferta;
	}

	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}

	public Set<Rata> getRaty() {
		return raty;
	}

	public void setRaty(Set<Rata> raty) {
		this.raty = raty;
	}
}
