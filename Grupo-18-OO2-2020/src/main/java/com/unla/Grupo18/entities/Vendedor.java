package com.unla.Grupo18.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Vendedor extends Empleado {
	
	private float plus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idSucursal", nullable=true)
	private Sucursal sucursal;
	
	

	public Vendedor(float plus, Sucursal sucursal) {
		super();
		this.plus = plus;
		this.sucursal = sucursal;
	}

	public float getPlus() {
		return plus;
	}

	public void setPlus(float plus) {
		this.plus = plus;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	
	

}
