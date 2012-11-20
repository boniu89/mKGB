package com.mkgb.zapis;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.mkgb.oferta.bo.OfertaBo;
import com.mkgb.uzytkownik.bo.UzytkownikBo;
import com.mkgb.zapis.bo.ZapisBo;
import com.mkgb.zapis.model.Zapis;

public class ZapisRejestracjaBean implements Serializable {

	private ZapisBo zapisBo;
	private OfertaBo ofertaBo;
	private UzytkownikBo uzytkownikBo;
	
	private long ofertaId;
	private long sluchaczId;
	private long polecajacyId;
	private Date dataZapisu;
	private Date dataRezygnacji;
	private String stan;
	private String kontoBankowe;
	private Boolean aktywny;
	
	public ZapisBo getZapisBo() {
		return zapisBo;
	}
	
	public List<Zapis> getZapisList() {
		return zapisBo.findAllZapisy();
	}
	
	public String addZapis()
	{
		Zapis zapis = new Zapis();
		zapis.setDataZapisu(new Date());
		zapis.setStan("Nowy");
		zapis.setAktywny(true);
		zapis.setKontoBankowe("123456789");
		if(getZapisList() != null)
			zapis.setId(getZapisList().size()+1);
		else
			zapis.setId(1);
		zapis.setOferta(ofertaBo.getOfertaById(ofertaId));
		zapis.setSluchacz(uzytkownikBo.getSluchaczById(sluchaczId));
		zapis.setSluchaczPolecajacy(uzytkownikBo.getSluchaczById(polecajacyId));
		zapisBo.addZapis(zapis);
		clearForm();
		
		return "";
	}
	
	private void clearForm() {
		setDataZapisu(null);
		setStan("");
		setKontoBankowe("");
	}
	
	
	public long getOfertaId() {
		return ofertaId;
	}

	public void setOfertaId(long ofertaId) {
		this.ofertaId = ofertaId;
	}

	public long getSluchaczId() {
		return sluchaczId;
	}

	public void setSluchaczId(long sluchaczId) {
		this.sluchaczId = sluchaczId;
	}

	public long getPolecajacyId() {
		return polecajacyId;
	}

	public void setPolecajacyId(long polecajacyId) {
		this.polecajacyId = polecajacyId;
	}

	public void setZapisBo(ZapisBo zapisBo) {
		this.zapisBo = zapisBo;
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

	public OfertaBo getOfertaBo() {
		return ofertaBo;
	}

	public void setOfertaBo(OfertaBo ofertaBo) {
		this.ofertaBo = ofertaBo;
	}

	public UzytkownikBo getUzytkownikBo() {
		return uzytkownikBo;
	}

	public void setUzytkownikBo(UzytkownikBo uzytkownikBo) {
		this.uzytkownikBo = uzytkownikBo;
	}

}
