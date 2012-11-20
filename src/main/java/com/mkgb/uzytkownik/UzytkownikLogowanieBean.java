package com.mkgb.uzytkownik;

import java.io.Serializable;

import com.mkgb.uzytkownik.model.Uzytkownik;


public class UzytkownikLogowanieBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/*Deklaracja zmiennych*/
    private Uzytkownik user;
    private Boolean loginCorrect;
    private String login;
    private String password;
    
    /*Konstruktor*/
    public UzytkownikLogowanieBean() {
        this.loginCorrect = false;
        this.login = "";
        this.password = "";
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
    
    /*Metody*/
    public String login()
    {
        setLoginCorrect(true);
        return "login";
    }
    
}
