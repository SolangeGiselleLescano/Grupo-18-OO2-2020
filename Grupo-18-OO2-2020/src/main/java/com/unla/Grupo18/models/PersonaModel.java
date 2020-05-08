package com.unla.Grupo18.models;


public class PersonaModel {
	
	private int personasId;
	
	private int personasDni;

	
	private String personasApellido;

	
	private String personasDireccion;

	
	private String personasEmail;

	
	private String personasNombre;

	
	private String personasTelefono;

	
	private int personasTipo;

	
	

	public PersonaModel() {
	}

	
	

	public PersonaModel(int personasId, int personasDni, String personasApellido) {
		super();
		this.personasId = personasId;
		this.personasDni = personasDni;
		this.personasApellido = personasApellido;
	}




	public PersonaModel(int personasId, int personasDni, String personasApellido,String personasNombre, String personasDireccion,
			String personasEmail,  String personasTelefono, int personasTipo) {
		super();
		this.personasId = personasId;
		this.personasDni = personasDni;
		this.personasApellido = personasApellido;
		this.personasDireccion = personasDireccion;
		this.personasEmail = personasEmail;
		this.personasNombre = personasNombre;
		this.personasTelefono = personasTelefono;
		this.personasTipo = personasTipo;
	}


	public int getPersonasId() {
		return personasId;
	}


	public void setPersonasId(int personasId) {
		this.personasId = personasId;
	}


	public int getPersonasDni() {
		return personasDni;
	}


	public void setPersonasDni(int personasDni) {
		this.personasDni = personasDni;
	}


	public String getPersonasApellido() {
		return personasApellido;
	}


	public void setPersonasApellido(String personasApellido) {
		this.personasApellido = personasApellido;
	}


	public String getPersonasDireccion() {
		return personasDireccion;
	}


	public void setPersonasDireccion(String personasDireccion) {
		this.personasDireccion = personasDireccion;
	}


	public String getPersonasEmail() {
		return personasEmail;
	}


	public void setPersonasEmail(String personasEmail) {
		this.personasEmail = personasEmail;
	}


	public String getPersonasNombre() {
		return personasNombre;
	}


	public void setPersonasNombre(String personasNombre) {
		this.personasNombre = personasNombre;
	}


	public String getPersonasTelefono() {
		return personasTelefono;
	}


	public void setPersonasTelefono(String personasTelefono) {
		this.personasTelefono = personasTelefono;
	}


	public int getPersonasTipo() {
		return personasTipo;
	}


	public void setPersonasTipo(int personasTipo) {
		this.personasTipo = personasTipo;
	}

	
	

}
