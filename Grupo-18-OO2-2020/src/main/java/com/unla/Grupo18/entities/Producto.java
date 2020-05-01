package com.unla.Grupo18.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="producto")

public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
	
	@Column(name="cantidadActual")
	private int cantidadActual;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="precioUnitario")
	private float precioUnitario;
	
	@Column(name="fechaAlta")
	@CreationTimestamp
	private LocalDate fechaAlta;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idSucursal", nullable=true)
	private Sucursal sucursal;
	
	@OneToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idProducto", nullable=true)
	private Producto producto;

	public Producto() {
	}

	public Producto(int idProducto, int cantidadActual, String descripcion, float precioUnitario, LocalDate fechaAlta,
			Sucursal sucursal, Producto producto) {
		super();
		this.idProducto = idProducto;
		this.cantidadActual = cantidadActual;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.fechaAlta = fechaAlta;
		this.sucursal = sucursal;
		this.producto = producto;
	}

	public Producto(int cantidadActual, String descripcion, float precioUnitario, Sucursal sucursal,
			Producto producto) {
		super();
		this.cantidadActual = cantidadActual;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.sucursal = sucursal;
		this.producto = producto;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
}
