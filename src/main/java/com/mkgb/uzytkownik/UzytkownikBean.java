package com.mkgb.uzytkownik;

import java.io.Serializable;
import java.util.List;

import com.mkgb.uzytkownik.bo.UzytkownikBo;
import com.mkgb.uzytkownik.model.Sluchacz;
import com.mkgb.uzytkownik.model.Uzytkownik;

public class UzytkownikBean implements Serializable {
	
	private UzytkownikBo uzytkownikBo;
	
	private String imie;
	private String drugieImie;
	private String nazwisko;
	private String pesel;
	private String adresZamieszkania;
	private String adresKorespondencyjny;
	private String imieMatki;
	private String imieOjca;
	private String email;
	private String telefon;
	private String haslo;
	private String imieOpiekunaK;
	private String imieOpiekunaM;
	
	public void setUzytkownikBo(UzytkownikBo uzytkownikBo) { 
		this.uzytkownikBo = uzytkownikBo;
	}
	
	public List<Uzytkownik> getUzytkownikList() {
		return uzytkownikBo.findAllUzytkownicy();
	}
	
	public String addUzytkownik() {
		
		/*Sluchacz sluchacz = new Sluchacz();
		sluchacz.setImie(imie);
		sluchacz.setDrugieImie(drugieImie);
		sluchacz.setNazwisko(nazwisko);
		sluchacz.setPesel(pesel);
		sluchacz.setAdresZamieszkania(adresZamieszkania);
		sluchacz.setAdresKorespondencyjny(adresKorespondencyjny);
		sluchacz.setImieMatki(imieMatki);
		sluchacz.setImieOjca(imieOjca);
		sluchacz.setEmail(email);
		sluchacz.setTelefon(telefon);
		sluchacz.setHaslo(haslo);
		sluchacz.setAktywny(true);
		sluchacz.setImieOpiekunaK(imieOpiekunaK);
		sluchacz.setImieOpiekunaM(imieOpiekunaM);
		sluchacz.setId(getUzytkownikList().size() + 1);
		*/
		
		Sluchacz sluchacz = new Sluchacz();
		sluchacz.setImie("Adrian");
		sluchacz.setDrugieImie("Miko³aj");
		sluchacz.setNazwisko("Maciej");
		sluchacz.setPesel("99999999999");
		sluchacz.setAdresZamieszkania("ul. 10/10");
		sluchacz.setAdresKorespondencyjny("ul. 10/10");
		sluchacz.setImieMatki("A");
		sluchacz.setImieOjca("B");
		sluchacz.setEmail("adrian.maciej@gmail.com");
		sluchacz.setTelefon("987654321");
		sluchacz.setHaslo("haslo");
		sluchacz.setAktywny(true);
		sluchacz.setImieOpiekunaK("A");
		sluchacz.setImieOpiekunaM("B");
		sluchacz.setId(1);
		clearForm();
		return "";
	}
	
	private void clearForm() {
		setImie("");
		setDrugieImie("");
		setNazwisko("");
		setPesel("");
		setAdresKorespondencyjny("");
		setAdresZamieszkania("");
		setImieMatki("");
		setImieOjca("");
		setEmail("");
		setTelefon("");
		setHaslo("");
		setImieOpiekunaK("");
		setImieOpiekunaM("");
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getDrugieImie() {
		return drugieImie;
	}

	public void setDrugieImie(String drugieImie) {
		this.drugieImie = drugieImie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getAdresZamieszkania() {
		return adresZamieszkania;
	}

	public void setAdresZamieszkania(String adresZamieszkania) {
		this.adresZamieszkania = adresZamieszkania;
	}

	public String getAdresKorespondencyjny() {
		return adresKorespondencyjny;
	}

	public void setAdresKorespondencyjny(String adresKorespondencyjny) {
		this.adresKorespondencyjny = adresKorespondencyjny;
	}

	public String getImieMatki() {
		return imieMatki;
	}

	public void setImieMatki(String imieMatki) {
		this.imieMatki = imieMatki;
	}

	public String getImieOjca() {
		return imieOjca;
	}

	public void setImieOjca(String imieOjca) {
		this.imieOjca = imieOjca;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getHaslo() {
		return haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

	public String getImieOpiekunaK() {
		return imieOpiekunaK;
	}

	public void setImieOpiekunaK(String imieOpiekunaK) {
		this.imieOpiekunaK = imieOpiekunaK;
	}

	public String getImieOpiekunaM() {
		return imieOpiekunaM;
	}

	public void setImieOpiekunaM(String imieOpiekunaM) {
		this.imieOpiekunaM = imieOpiekunaM;
	}

	public UzytkownikBo getUzytkownikBo() {
		return uzytkownikBo;
	}
}
