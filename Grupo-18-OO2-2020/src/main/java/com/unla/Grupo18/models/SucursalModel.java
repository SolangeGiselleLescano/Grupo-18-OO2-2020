package com.unla.Grupo18.models;



public class SucursalModel {

	private int idSucursal;

	private String telefono;
	
	private String direccion;
	
	private String mail;
	
	private double latitud;
	
	private double longitud;

	
	public SucursalModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SucursalModel(int idSucursal, String telefono) {
		super();
		this.idSucursal = idSucursal;
		
		this.telefono = telefono;
		
	}
	
	

	public SucursalModel(int idSucursal,  String direccion, String mail, double latitud,
			double longitud, String telefono) {
		super();
		this.idSucursal = idSucursal;
		this.telefono = telefono;
		this.direccion = direccion;
		this.mail = mail;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	
	
	public SucursalModel(String direccion, String mail, double latitud, double longitud,String telefono) {
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

	
	
	
	
}
