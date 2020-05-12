package com.unla.Grupo18.services;

import java.util.List;

import com.unla.Grupo18.entities.Cliente;
import com.unla.Grupo18.models.ClienteModel;


public interface IClienteService {
	
   public List<Cliente> getAll();
	
	public ClienteModel findByPersonaId(int id);
	
	public ClienteModel findByClienteNombre(String name);
	
	public ClienteModel insertOrUpdate(ClienteModel clienteModel);
	
	public boolean remove(int id);

	
	//public List<PersonaModel> findByDegreeName(String degreeName);

}
