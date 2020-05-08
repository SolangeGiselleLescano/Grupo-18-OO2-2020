package com.unla.Grupo18.converters;

import org.springframework.stereotype.Component;

import com.unla.Grupo18.entities.Persona;
import com.unla.Grupo18.models.PersonaModel;


@Component("personConverter")
public class PersonConverter {
	
	public PersonaModel entityToModel(Persona person) {
		return new PersonaModel(person.getPersona_id(), person.getPersonasDni(),person.getPersonasApellido(),person.getPersonasNombre(),person.getPersonasDireccion(),person.getPersonasEmail(),person.getPersonasTelefono(),person.getPersonasTipo());
	}

	public Persona modelToEntity(PersonaModel personModel) {
		return new Persona(personModel.getPersonasId(), personModel.getPersonasDni(),personModel.getPersonasApellido(), personModel.getPersonasNombre(),personModel.getPersonasDireccion(),personModel.getPersonasEmail(),personModel.getPersonasTelefono(),personModel.getPersonasTipo());
	}
	

}
