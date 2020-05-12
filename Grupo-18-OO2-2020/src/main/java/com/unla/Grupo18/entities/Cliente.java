package com.unla.Grupo18.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@PrimaryKeyJoinColumn(name="clientes_dni")
public class Cliente extends Persona  {


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cliente_fecha_ultima_compra")
	private Date clienteFechaUltimaCompra;
	
	@ManyToOne
	@JoinColumn(name="empleados_tipo_empleado")
	private TipoEmpleado tipoEmpleado;

	public Cliente() {
	}

	

	public Cliente(int personaId, String personaApellido, String personaNombre,String personaDireccion, String personaEmail,
			 String personaTelefono, String personaFechaNacimiento, int personaTipo) {
		super(personaId, personaApellido,  personaNombre,personaDireccion, personaEmail, personaTelefono,
				personaFechaNacimiento, personaTipo);
		// TODO Auto-generated constructor stub
	}



	public Date getClienteFechaUltimaCompra() {
		return this.clienteFechaUltimaCompra;
	}

	public void setClienteFechaUltimaCompra(Date clienteFechaUltimaCompra) {
		this.clienteFechaUltimaCompra = clienteFechaUltimaCompra;
	}



	public TipoEmpleado getTipoEmpleado() {
		return tipoEmpleado;
	}



	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	
	
}