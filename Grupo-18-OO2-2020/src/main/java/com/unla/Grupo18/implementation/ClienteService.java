package com.unla.Grupo18.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.Grupo18.converters.ClienteConverter;
import com.unla.Grupo18.entities.Cliente;
import com.unla.Grupo18.models.ClienteModel;
import com.unla.Grupo18.repositories.IClienteRepository;
import com.unla.Grupo18.services.IClienteService;

@Service("clienteService")
public class ClienteService implements IClienteService {

	@Autowired
	@Qualifier("clienteRepository")
	private IClienteRepository clienteRepository;
	
	@Autowired
	@Qualifier("clienteConverter")
	private ClienteConverter clienteConverter;
	
	@Override
	public List<Cliente> getAll() {
		return clienteRepository.findAll();
	}

	@Override
	public ClienteModel insertOrUpdate(ClienteModel clienteModel) {
		Cliente cliente = clienteRepository.save(clienteConverter.modelToEntity(clienteModel));
		return clienteConverter.entityToModel(cliente);
	}

	@Override
	public boolean remove(int id) {
		try {
			clienteRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public ClienteModel findByPersonaId(int id) {
		return clienteConverter.entityToModel(clienteRepository.findByPersonaId(id));
	}

	@Override
	public ClienteModel findByClienteNombre(String name) {
		return clienteConverter.entityToModel(clienteRepository.findByPersonaNombre(name));
	}

	/*
	@Override
	public List<PersonModel> findByDegreeName(String degreeName) {
		List<PersonModel> models = new ArrayList<PersonModel>();
		for (Person person : personRepository.findByDegreeName(degreeName)) {
			models.add(personConverter.entityToModel(person));
		}
		return models;
	}*/


}
