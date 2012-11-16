package com.mkgb.kierunek.model;

public class Kierunek {
	private long id;
	private String nazwa;
	private int liczbaSemestrow;
	private Boolean aktywny;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getLiczbaSemestrow() {
		return liczbaSemestrow;
	}
	public void setLiczbaSemestrow(int liczbaSemestrow) {
		this.liczbaSemestrow = liczbaSemestrow;
	}
	public Boolean getAktywny() {
		return aktywny;
	}
	public void setAktywny(Boolean aktywny) {
		this.aktywny = aktywny;
	}
}
