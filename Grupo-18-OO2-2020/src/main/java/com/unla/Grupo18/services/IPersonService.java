package com.unla.Grupo18.services;

import java.util.List;

import com.unla.Grupo18.entities.Persona;
import com.unla.Grupo18.models.PersonaModel;


public interface IPersonService {
	
   public List<Persona> getAll();
	
	public PersonaModel findBypersonaId(int id);
	
	public PersonaModel findBypersonasNombre(String name);
	
	public PersonaModel insertOrUpdate(PersonaModel personModel);
	
	public boolean remove(int id);
	
	//public List<PersonaModel> findByDegreeName(String degreeName);

}
