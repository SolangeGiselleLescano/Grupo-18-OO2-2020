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
@Table(name="lote")
public class Lote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLote;
		
	@Column(name="cantidadProducto")
	private int cantidadProducto;
	

	@Column(name="cantidadActual")
	private int cantidadActual;
	
	@Column(name="fechaDeIngreso")
	@CreationTimestamp
	private LocalDate fechaDeIngreso;
	
	@OneToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idProducto", nullable=true)
	private Producto producto;
	
	@OneToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idSucursal", nullable=true)
	private Sucursal sucursal;

	public Lote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lote(int idLote, int cantidadProducto, int cantidadActual, LocalDate fechaDeIngreso,
			Producto producto, Sucursal sucursal) {
		super();
		this.idLote = idLote;
		this.cantidadProducto = cantidadProducto;
		this.cantidadActual = cantidadActual;
		this.fechaDeIngreso = fechaDeIngreso;
		this.producto = producto;
		this.sucursal = sucursal;
	}

	public Lote(int cantidadProducto, int cantidadActual, LocalDate  fechaDeIngreso, Producto producto, Sucursal sucursal) {
		super();
		this.cantidadProducto = cantidadProducto;
		this.cantidadActual = cantidadActual;
		this.fechaDeIngreso = fechaDeIngreso;
		this.producto = producto;
		this.sucursal = sucursal;
	}

	public int getIdLote() {
		return idLote;
	}

	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public LocalDate  getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(LocalDate  fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	
	

}
