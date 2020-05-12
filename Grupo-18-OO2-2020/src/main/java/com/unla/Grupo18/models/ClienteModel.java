package com.unla.Grupo18.models;

import java.time.LocalDate;
import java.util.Date;

import com.unla.Grupo18.entities.Cliente;


public class ClienteModel extends PersonaModel {
	
	private Date clienteFechaUltimaCompra;

	public ClienteModel() {
	
	}

	

	public ClienteModel(int personaId, String personaApellido,String personaNombre, String personaDireccion, String personaEmail,
			 String personaTelefono, String personaFechaNacimiento, int personaTipo) {
		super(personaId, personaApellido,personaNombre, personaDireccion, personaEmail,  personaTelefono,
				personaFechaNacimiento, personaTipo);
		
	}



	public Date getClienteFechaUltimaCompra() {
		return clienteFechaUltimaCompra;
	}

	public void setClienteFechaUltimaCompra(Date clienteFechaUltimaCompra) {
		this.clienteFechaUltimaCompra = clienteFechaUltimaCompra;
	}
	
	
	public Cliente getCliente() {
		return null;
		
	}
	

}
