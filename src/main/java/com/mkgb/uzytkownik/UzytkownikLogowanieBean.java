package com.mkgb.uzytkownik;

import com.mkgb.uzytkownik.model.Sluchacz;
import java.io.Serializable;

import com.mkgb.uzytkownik.model.Uzytkownik;


public class UzytkownikLogowanieBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/*Deklaracja zmiennych*/
    private Sluchacz user;
    private Boolean loginCorrect;
    private String login;
    private String password;
    
    /*Konstruktor*/
    public UzytkownikLogowanieBean() {
        this.loginCorrect = false;
        this.login = "";
        this.password = "";
        this.user = new Sluchacz();
    }
    
    /*Getters and setters*/
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getLoginCorrect() {
        return loginCorrect;
    }

    public void setLoginCorrect(Boolean loginCorrect) {
        this.loginCorrect = loginCorrect;
    }

    public Sluchacz getUser() {
        return user;
    }

    public void setUser(Sluchacz user) {
        this.user = user;
    }
    
    /*Metody*/
    public String login()
    {
                /*Date do testów*/
        user.setId(1);
        user.setImie("Beata");
        user.setDrugieImie("");
        user.setNazwisko("Kobyliñska");
        user.setImieMatki("Danuta");
        user.setImieOjca("Zbigniew");
        user.setPesel("89040209080");
        user.setTelefon("725908787");
        user.setEmail(login);
        user.setAdresKorespondencyjny("adres");
        user.setAdresZamieszkania("adres");
        user.setHaslo(password);
        /*-------------*/
        setLoginCorrect(true);
        return "login";
    }
    
}
