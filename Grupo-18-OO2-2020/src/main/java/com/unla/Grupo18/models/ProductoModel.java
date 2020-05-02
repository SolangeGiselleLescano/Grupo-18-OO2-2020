package com.unla.Grupo18.models;

import java.time.LocalDate;

public class ProductoModel {
	
	private int id_Producto;
	
	private String descripcion;
	private LocalDate fechaAlta;
	private float precioUnitario;
	
	public ProductoModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductoModel(int id_Producto, String descripcion, LocalDate fechaAlta,
			float precioUnitario) {
		super();
		this.id_Producto = id_Producto;
		
		this.descripcion = descripcion;
		this.fechaAlta = fechaAlta;
		this.precioUnitario = precioUnitario;
	}

	public int getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(int id_Producto) {
		this.id_Producto = id_Producto;
	}

	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	

}
