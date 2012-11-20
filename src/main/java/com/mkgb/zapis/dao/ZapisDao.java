package com.mkgb.zapis.dao;

import java.util.List;

import com.mkgb.uzytkownik.model.Uzytkownik;
import com.mkgb.zapis.model.Zapis;

public interface ZapisDao {
	void addZapis(Zapis zapis);
	List<Zapis> findAllZapisyforUzytkownik(Uzytkownik uzytkownik);
	List<Zapis> findAllZapisy();
}
