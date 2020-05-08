package com.unla.Grupo18.entities;

import javax.persistence.*;
import java.util.Date;


@Entity

public class Cliente extends Persona  {


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cliente_fecha_ultima_compra")
	private Date clienteFechaUltimaCompra;

	public Cliente() {
	}


	public Date getClienteFechaUltimaCompra() {
		return this.clienteFechaUltimaCompra;
	}

	public void setClienteFechaUltimaCompra(Date clienteFechaUltimaCompra) {
		this.clienteFechaUltimaCompra = clienteFechaUltimaCompra;
	}

}