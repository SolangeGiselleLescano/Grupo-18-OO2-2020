package com.example.TPCGrupo18.entitys;

import javax.persistence.Entity;

@Entity
public class Cliente extends Persona {
	
	
	private String mail;
	
	

	public Cliente() {
	}



	public Cliente(String mail) {
		super();
		this.mail = mail;
	}



	public String getMail() {
		return mail;
	}



	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	

}
