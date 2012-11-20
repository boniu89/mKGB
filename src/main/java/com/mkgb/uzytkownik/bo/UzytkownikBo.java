package com.mkgb.uzytkownik.bo;

import java.util.List;

import com.mkgb.uzytkownik.model.Sluchacz;
import com.mkgb.uzytkownik.model.Uzytkownik;

public interface UzytkownikBo {
	void addUzytkownik(Uzytkownik uzytkownik);
	List<Uzytkownik> findAllUzytkownicy();
	public Uzytkownik getUzytkownikById(long id);
	public Sluchacz getSluchaczById(long id);
}
