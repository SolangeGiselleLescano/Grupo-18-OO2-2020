package com.unla.Grupo18.models;

import java.math.BigDecimal;

public class SucursalModel {

	private int idSucursal;

	private String telefono;
	
	private String direccion;
	
	private String mail;
	
	private BigDecimal latitud;
	
	private BigDecimal longitud;

	
	public SucursalModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SucursalModel(int idSucursal, String telefono) {
		super();
		this.idSucursal = idSucursal;
		
		this.telefono = telefono;
		
	}
	
	

	public SucursalModel(int idSucursal,  String direccion, String mail, BigDecimal latitud,
			BigDecimal longitud, String telefono) {
		super();
		this.idSucursal = idSucursal;
		this.telefono = telefono;
		this.direccion = direccion;
		this.mail = mail;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	
	
	public SucursalModel(String direccion, String mail, BigDecimal latitud, BigDecimal longitud,String telefono) {
		super();
		this.telefono = telefono;
		this.direccion = direccion;
		this.mail = mail;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public BigDecimal getLatitud() {
		return latitud;
	}

	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

	public BigDecimal getLongitud() {
		return longitud;
	}

	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}

	
	
	
	
}
