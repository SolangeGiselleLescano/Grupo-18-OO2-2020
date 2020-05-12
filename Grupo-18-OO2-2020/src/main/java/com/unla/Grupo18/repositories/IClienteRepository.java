package com.unla.Grupo18.repositories;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.unla.Grupo18.entities.Cliente;



@Repository("clienteRepository")
public interface  IClienteRepository  extends JpaRepository<Cliente, Serializable>{

public  Cliente findByPersonaId(int id);
	
	public  Cliente findByPersonaNombre(String nombre);
	
	// Todas las personas que tengan un título con ese nombre (parámetro name)
	//@Query("SELECT p FROM Person p JOIN FETCH p.degrees d WHERE d.name = (:name)")
	//public abstract List<Persona> findByType(int tipoPersona);
	
}
