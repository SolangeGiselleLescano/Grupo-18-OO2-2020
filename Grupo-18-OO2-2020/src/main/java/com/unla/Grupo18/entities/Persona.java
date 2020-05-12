package com.unla.Grupo18.entities;
import javax.persistence.*;


@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name="personas")
public class Persona  {

	@Id
	private int personaId;
	
	@Column(name="personas_apellido")
	private String personaApellido;

	@Column(name="personas_direccion")
	private String personaDireccion;

	@Column(name="personas_email")
	private String personaEmail;

	@Column(name="personas_nombre")
	private String personaNombre;

	@Column(name="personas_telefono")
	private String personaTelefono;

	@Column(name="personas_fechaNacimiento")
	private String personaFechaNacimiento;
	
	@Column(name="personas_tipo")
	private int personaTipo;
	
	

	public Persona() {
	}

	
	public Persona(int personaId, String personaApellido, String personaNombre,String personaDireccion, String personaEmail,
			 String personaTelefono, String personaFechaNacimiento, int personaTipo) {
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