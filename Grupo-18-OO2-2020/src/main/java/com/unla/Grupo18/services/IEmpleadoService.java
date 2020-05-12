package com.unla.Grupo18.services;

import java.util.List;

import com.unla.Grupo18.entities.Empleado;
import com.unla.Grupo18.models.EmpleadoModel;


public interface IEmpleadoService {
	
   public List<Empleado> getAll();
	
	public EmpleadoModel findByPersonaId(int id);
	
	public EmpleadoModel findByEmpleadoNombre(String name);
	
	public EmpleadoModel insertOrUpdate(EmpleadoModel empleadoModel);
	
	public boolean remove(int id);

	
	//public List<PersonaModel> findByDegreeName(String degreeName);

}
