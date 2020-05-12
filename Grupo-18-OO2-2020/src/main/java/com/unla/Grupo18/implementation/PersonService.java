package com.unla.Grupo18.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.Grupo18.converters.PersonConverter;
import com.unla.Grupo18.entities.Persona;
import com.unla.Grupo18.models.PersonaModel;
import com.unla.Grupo18.repositories.IPersonRepository;
import com.unla.Grupo18.services.IPersonService;




@Service("personService")
public class PersonService implements IPersonService {

	@Autowired
	@Qualifier("personRepository")
	private IPersonRepository personRepository;
	
	@Autowired
	@Qualifier("personConverter")
	private PersonConverter personConverter;
	
	@Override
	public List<Persona> getAll() {
		return personRepository.findAll();
	}

	@Override
	public PersonaModel insertOrUpdate(PersonaModel personModel) {
		Persona person = personRepository.save(personConverter.modelToEntity(personModel));
		return personConverter.entityToModel(person);
	}

	@Override
	public boolean remove(int id) {
		try {
			personRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public PersonaModel findBypersonaId(int id) {
		return personConverter.entityToModel(personRepository.findByPersonaId(id));
	}

	@Override
	public PersonaModel findBypersonasNombre(String name) {
		return personConverter.entityToModel(personRepository.findByPersonaNombre(name));
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
