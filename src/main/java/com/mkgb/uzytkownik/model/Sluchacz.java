package com.mkgb.uzytkownik.model;

import java.util.Set;

import com.mkgb.zapis.model.Zapis;

public class Sluchacz extends Uzytkownik{
	
	private String imieOpiekunaM;
	private String imieOpiekunaK;
	
	private Set<Zapis> zapisy;
	private Set<Zapis> zapisyPolecone;
	
	public String getImieOpiekunaM() {
		return imieOpiekunaM;
	}
	public void setImieOpiekunaM(String imieOpiekunaM) {
		this.imieOpiekunaM = imieOpiekunaM;
	}
	public String getImieOpiekunaK() {
		return imieOpiekunaK;
	}
	public void setImieOpiekunaK(String imieOpiekunaK) {
		this.imieOpiekunaK = imieOpiekunaK;
	}
	public Set<Zapis> getZapisy() {
		return zapisy;
	}
	public void setZapisy(Set<Zapis> zapisy) {
		this.zapisy = zapisy;
	}
	public Set<Zapis> getZapisyPolecone() {
		return zapisyPolecone;
	}
	public void setZapisyPolecone(Set<Zapis> zapisyPolecone) {
		this.zapisyPolecone = zapisyPolecone;
	}
}
