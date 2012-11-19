package com.mkgb.uzytkownik.model;

public abstract class Uzytkownik {
	
	private long id;
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
	private Boolean aktywny;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public Boolean getAktywny() {
		return aktywny;
	}
	public void setAktywny(Boolean aktywny) {
		this.aktywny = aktywny;
	}
}
