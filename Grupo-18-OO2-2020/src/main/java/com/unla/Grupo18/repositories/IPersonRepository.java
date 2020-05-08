package com.unla.Grupo18.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unla.Grupo18.entities.Persona;



@Repository("personRepository")
public interface  IPersonRepository  extends JpaRepository<Persona, Serializable>{

public  Persona findBypersonaId(int id);
	
	public  Persona findBypersonasNombre(String nombre);
	
	// Todas las personas que tengan un título con ese nombre (parámetro name)
	//@Query("SELECT p FROM Person p JOIN FETCH p.degrees d WHERE d.name = (:name)")
	//public abstract List<Persona> findByType(int tipoPersona);
	
}
