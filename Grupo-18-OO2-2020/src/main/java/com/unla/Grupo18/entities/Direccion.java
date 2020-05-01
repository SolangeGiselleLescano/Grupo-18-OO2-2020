package com.unla.Grupo18.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="direccion")

public class Direccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDireccion;
	
	@Column(name="ciudad")
	private String ciudad;
	
	@Column(name="calle")
	private String calle;
	
	@Column(name="altura")
	private int altura;
	
	@Column(name="latitud")
	private double latitud;
	
	@Column(name="longitud")
	private double longitud;
	
	@OneToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idSucursal", nullable=true)
	private Sucursal sucursal;
	
	

	public Direccion() {
	}

	public Direccion(int idDireccion, String ciudad, String calle, int altura, double latitud, double longitud,
			Sucursal sucursal) {
		super();
		this.idDireccion = idDireccion;
		this.ciudad = ciudad;
		this.calle = calle;
		this.altura = altura;
		this.latitud = latitud;
		this.longitud = longitud;
		this.sucursal = sucursal;
	}

	public Direccion(String ciudad, String calle, int altura, double latitud, double longitud, Sucursal sucursal) {
		super();
		this.ciudad = ciudad;
		this.calle = calle;
		this.altura = altura;
		this.latitud = latitud;
		this.longitud = longitud;
		this.sucursal = sucursal;
	}

	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	
	
	
	
	
	
}
