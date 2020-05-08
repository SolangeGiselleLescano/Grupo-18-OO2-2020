package com.unla.Grupo18.entities;
import javax.persistence.*;


@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name="personas")
public class Persona  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personaId;
	
	@Column(name="personas_dni")
	private int personasDni;

	@Column(name="personas_apellido")
	private String personasApellido;

	@Column(name="personas_direccion")
	private String personasDireccion;

	@Column(name="personas_email")
	private String personasEmail;

	@Column(name="personas_nombre")
	private String personasNombre;

	@Column(name="personas_telefono")
	private String personasTelefono;

	@Column(name="personas_tipo")
	private int personasTipo;

	public Persona() {
	}

	
	
	
	public Persona(int personaId, int personasDni, String personasApellido) {
		super();
		this.personaId = personaId;
		this.personasDni = personasDni;
		this.personasApellido = personasApellido;
	}




	public Persona(int personaId, int personasDni, String personasApellido,String personasNombre, String personasDireccion,
			String personasEmail,  String personasTelefono, int personasTipo) {
		super();
		this.personaId = personaId;
		this.personasDni = personasDni;
		this.personasApellido = personasApellido;
		this.personasDireccion = personasDireccion;
		this.personasEmail = personasEmail;
		this.personasNombre = personasNombre;
		this.personasTelefono = personasTelefono;
		this.personasTipo = personasTipo;
	}




	public int getPersonasDni() {
		return this.personasDni;
	}
	
	

	public int getPersona_id() {
		return personaId;
	}



	public void setPersona_id(int personaId) {
		this.personaId = personaId;
	}



	public void setPersonasDni(int personasDni) {
		this.personasDni = personasDni;
	}

	public String getPersonasApellido() {
		return this.personasApellido;
	}

	public void setPersonasApellido(String personasApellido) {
		this.personasApellido = personasApellido;
	}

	public String getPersonasDireccion() {
		return this.personasDireccion;
	}

	public void setPersonasDireccion(String personasDireccion) {
		this.personasDireccion = personasDireccion;
	}

	public String getPersonasEmail() {
		return this.personasEmail;
	}

	public void setPersonasEmail(String personasEmail) {
		this.personasEmail = personasEmail;
	}

	public String getPersonasNombre() {
		return this.personasNombre;
	}

	public void setPersonasNombre(String personasNombre) {
		this.personasNombre = personasNombre;
	}

	public String getPersonasTelefono() {
		return this.personasTelefono;
	}

	public void setPersonasTelefono(String personasTelefono) {
		this.personasTelefono = personasTelefono;
	}

	public int getPersonasTipo() {
		return this.personasTipo;
	}

	public void setPersonasTipo(int personasTipo) {
		this.personasTipo = personasTipo;
	}

}