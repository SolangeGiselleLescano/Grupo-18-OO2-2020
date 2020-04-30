package com.example.TPCGrupo18.entitys;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="sucursal")
public class Sucursal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSucursal;
	
	@Column(name="telefono")
	private String telefono;

	@OneToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idDireccion", nullable=true)
	private Direccion direccion;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="sucursal")
	private Set<Vendedor> vendedores = new HashSet<Vendedor>();
	
	public Sucursal() {

	}

	public Sucursal(int idSucursal, String telefono,Direccion direccion) {
		super();
		this.idSucursal = idSucursal;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public Sucursal(String telefono,Direccion direccion) {
		super();
		this.telefono = telefono;
		this.direccion = direccion;;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
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

	public Set<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(Set<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	
	
	
	
}
