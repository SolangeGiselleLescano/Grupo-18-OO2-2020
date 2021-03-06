package com.unla.Grupo18.entities;

import javax.persistence.*;




@Entity
@Table(name="sucursales")
public class Sucursal  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sucursales_id")
	private int sucursalesId;

	@Column(name="sucursales_direccion")
	private String sucursalesDireccion;

	@Column(name="sucursales_email")
	private String sucursalesEmail;

	@Column(name="sucursales_empleado_id")
	private int sucursalesEmpleadoId;

	@Column(name="sucursales_latitud")
	private double sucursalesLatitud;

	@Column(name="sucursales_longitud")
	private double sucursalesLongitud;

	@Column(name="sucursales_telefono")
	private String sucursalesTelefono;

	public Sucursal() {
	}
	
	

	public Sucursal(String sucursalesTelefono) {
		super();
		this.sucursalesTelefono = sucursalesTelefono;
	}

	

	public Sucursal(int sucursalesId, String sucursalesTelefono) {
		super();
		this.sucursalesId = sucursalesId;
		this.sucursalesTelefono = sucursalesTelefono;
	}



	public Sucursal(int sucursalesId, String sucursalesDireccion, String sucursalesEmail, 
			double sucursalesLatitud, double sucursalesLongitud, String sucursalesTelefono) {
		super();
		this.sucursalesId = sucursalesId;
		this.sucursalesDireccion = sucursalesDireccion;
		this.sucursalesEmail = sucursalesEmail;
		this.sucursalesLatitud = sucursalesLatitud;
		this.sucursalesLongitud = sucursalesLongitud;
		this.sucursalesTelefono = sucursalesTelefono;
	}



	public Sucursal(String sucursalesDireccion, String sucursalesEmail,
			double sucursalesLatitud, double sucursalesLongitud, String sucursalesTelefono) {
		super();
		this.sucursalesDireccion = sucursalesDireccion;
		this.sucursalesEmail = sucursalesEmail;
		//this.sucursalesEmpleadoId = sucursalesEmpleadoId;
		this.sucursalesLatitud = sucursalesLatitud;
		this.sucursalesLongitud = sucursalesLongitud;
		this.sucursalesTelefono = sucursalesTelefono;
	}



	public int getSucursalesId() {
		return this.sucursalesId;
	}

	public void setSucursalesId(int sucursalesId) {
		this.sucursalesId = sucursalesId;
	}

	public String getSucursalesDireccion() {
		return this.sucursalesDireccion;
	}

	public void setSucursalesDireccion(String sucursalesDireccion) {
		this.sucursalesDireccion = sucursalesDireccion;
	}

	public String getSucursalesEmail() {
		return this.sucursalesEmail;
	}

	public void setSucursalesEmail(String sucursalesEmail) {
		this.sucursalesEmail = sucursalesEmail;
	}

	public int getSucursalesEmpleadoId() {
		return this.sucursalesEmpleadoId;
	}

	public void setSucursalesEmpleadoId(int sucursalesEmpleadoId) {
		this.sucursalesEmpleadoId = sucursalesEmpleadoId;
	}

	public double getSucursalesLatitud() {
		return this.sucursalesLatitud;
	}

	public void setSucursalesLatitud(double sucursalesLatitud) {
		this.sucursalesLatitud = sucursalesLatitud;
	}

	public double getSucursalesLongitud() {
		return this.sucursalesLongitud;
	}

	public void setSucursalesLongitud(double sucursalesLongitud) {
		this.sucursalesLongitud = sucursalesLongitud;
	}

	public String getSucursalesTelefono() {
		return this.sucursalesTelefono;
	}

	public void setSucursalesTelefono(String sucursalesTelefono) {
		this.sucursalesTelefono = sucursalesTelefono;
	}

}