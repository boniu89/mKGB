package com.mkgb.zapis.bo;

import java.util.List;

import com.mkgb.uzytkownik.model.Uzytkownik;
import com.mkgb.zapis.model.Zapis;

public interface ZapisBo {
	void addZapis(Zapis zapis);
	List<Zapis> findAllZapisyforUzytkownik(Uzytkownik uzytkownik); 
	List<Zapis> findAllZapisy();
}
