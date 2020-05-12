package com.unla.Grupo18.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.Grupo18.entities.TipoEmpleado;



@Repository("tipoEmpleadoRepository")
public interface  ITipoEmpleadoRepository extends JpaRepository<TipoEmpleado, Serializable>{

public  TipoEmpleado findByTeId(int id);
	
public  TipoEmpleado findByTeDescripcion(String name);
	
}
