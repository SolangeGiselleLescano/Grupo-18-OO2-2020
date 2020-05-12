package com.unla.Grupo18.models;


public class PersonaModel {
	
	private int personaId;
	
	private int personaDni;

	
	private String personaApellido;

	
	private String personaDireccion;

	
	private String personaEmail;

	
	private String personaNombre;

	
	private String personaTelefono;

	
	private String personaFechaNacimiento;
	
	private int personaTipo;


	public PersonaModel() {
	}


	public PersonaModel(int personaId, String personaApellido, String personaDireccion,
			String personaEmail, String personaNombre, String personaTelefono, String personaFechaNacimiento,
			int personaTipo) {
		super();
		this.personaId = personaId;
		this.personaApellido = personaApellido;
		this.personaDireccion = personaDireccion;
		this.personaEmail = personaEmail;
		this.personaNombre = personaNombre;
		this.personaTelefono = personaTelefono;
		this.personaFechaNacimiento = personaFechaNacimiento;
		this.personaTipo = personaTipo;
	}


	public int getPersonaId() {
		return personaId;
	}


	public void setPersonaId(int personaId) {
		this.personaId = personaId;
	}


	public int getPersonaDni() {
		return personaDni;
	}


	public void setPersonaDni(int personaDni) {
		this.personaDni = personaDni;
	}


	public String getPersonaApellido() {
		return personaApellido;
	}


	public void setPersonaApellido(String personaApellido) {
		this.personaApellido = personaApellido;
	}


	public String getPersonaDireccion() {
		return personaDireccion;
	}


	public void setPersonaDireccion(String personaDireccion) {
		this.personaDireccion = personaDireccion;
	}


	public String getPersonaEmail() {
		return personaEmail;
	}


	public void setPersonaEmail(String personaEmail) {
		this.personaEmail = personaEmail;
	}


	public String getPersonaNombre() {
		return personaNombre;
	}


	public void setPersonaNombre(String personaNombre) {
		this.personaNombre = personaNombre;
	}


	public String getPersonaTelefono() {
		return personaTelefono;
	}


	public void setPersonaTelefono(String personaTelefono) {
		this.personaTelefono = personaTelefono;
	}


	public int getPersonaTipo() {
		return personaTipo;
	}


	public void setPersonaTipo(int personaTipo) {
		this.personaTipo = personaTipo;
	}


	public String getPersonaFechaNacimiento() {
		return personaFechaNacimiento;
	}


	public void setPersonaFechaNacimiento(String personaFechaNacimiento) {
		this.personaFechaNacimiento = personaFechaNacimiento;
	}

	
	

}
