package com.unla.Grupo18.converters;

import org.springframework.stereotype.Component;

import com.unla.Grupo18.entities.Cliente;
import com.unla.Grupo18.models.ClienteModel;


@Component("clienteConverter")
public class ClienteConverter {
	
	public ClienteModel entityToModel(Cliente cliente) {
		return new ClienteModel(
				   cliente.getPersonaId(),
				   cliente.getPersonaApellido(),
				   cliente.getPersonaNombre(),
				   cliente.getPersonaDireccion(),
				   cliente.getPersonaEmail(),
				   cliente.getPersonaTelefono(),
				   cliente.getPersonaFechaNacimiento(),
				   cliente.getPersonaTipo()
				   );
	}

	public Cliente modelToEntity(ClienteModel clienteModel) {
		return new Cliente(
				clienteModel.getPersonaId(),
				clienteModel.getPersonaApellido(),
				clienteModel.getPersonaNombre(),
				clienteModel.getPersonaDireccion(),
				clienteModel.getPersonaEmail(),
				clienteModel.getPersonaTelefono(),
				clienteModel.getPersonaFechaNacimiento(),
				clienteModel.getPersonaTipo()
				);
	}
	

}
