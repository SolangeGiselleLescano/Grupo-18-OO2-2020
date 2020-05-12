package com.unla.Grupo18.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unla.Grupo18.entities.Empleado;



@Repository("empleadoRepository")
public interface  IEmpleadoRepository  extends JpaRepository<Empleado, Serializable>{

public  Empleado findByPersonaId(int id);
	
	public  Empleado findByPersonaNombre(String nombre);
	
	// Todas las personas que tengan un título con ese nombre (parámetro name)
	//@Query("SELECT p FROM Person p JOIN FETCH p.degrees d WHERE d.name = (:name)")
	//public abstract List<Persona> findByType(int tipoPersona);
	
}
