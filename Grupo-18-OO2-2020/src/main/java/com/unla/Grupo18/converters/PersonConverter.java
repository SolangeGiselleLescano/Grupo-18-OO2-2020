package com.unla.Grupo18.converters;

import org.springframework.stereotype.Component;

import com.unla.Grupo18.entities.Persona;
import com.unla.Grupo18.models.PersonaModel;


@Component("personConverter")
public class PersonConverter {
	
	public PersonaModel entityToModel(Persona person) {
		return new PersonaModel( 
				 person.getPersonaId(),
				 person.getPersonaApellido(),
				 person.getPersonaNombre(),
				 person.getPersonaDireccion(),
				 person.getPersonaEmail(),
				 person.getPersonaTelefono(),
				 person.getPersonaFechaNacimiento(),
				 person.getPersonaTipo());
	}

	public Persona modelToEntity(PersonaModel personModel) {
		return new Persona(
				personModel.getPersonaId(),
				personModel.getPersonaApellido(),
				personModel.getPersonaNombre(),
				personModel.getPersonaDireccion(),
				personModel.getPersonaEmail(),
				personModel.getPersonaTelefono(),
				personModel.getPersonaFechaNacimiento(),
				personModel.getPersonaTipo());
	}
	

}
