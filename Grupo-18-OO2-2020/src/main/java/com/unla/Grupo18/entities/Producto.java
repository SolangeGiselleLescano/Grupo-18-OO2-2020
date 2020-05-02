package com.unla.Grupo18.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
	
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="precioUnitario")
	private float precioUnitario;
	
	@Column(name="fechaAlta")
	@CreationTimestamp
	private LocalDate fechaAlta;
	
	
		
	@OneToMany(fetch=FetchType.LAZY, mappedBy="producto")
	private Set<Lote> lotes = new HashSet<Lote>();
	
	

	public Producto() {
	}

	

	public Producto(String descripcion, float precioUnitario) {
		super();
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
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

	

	
	
	
}
