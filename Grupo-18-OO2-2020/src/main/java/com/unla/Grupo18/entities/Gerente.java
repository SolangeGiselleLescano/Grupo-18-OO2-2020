package com.unla.Grupo18.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Gerente extends Empleado{
	
	@OneToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idSucursal", nullable=true)
	private Sucursal sucursal;

	public Gerente() {
		
	}

	public Gerente(Sucursal sucursal) {
		super();
		this.sucursal = sucursal;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	
	
	
	

}
