package com.unla.Grupo18.services;

import java.util.List;

import com.unla.Grupo18.entities.Empleado;
import com.unla.Grupo18.entities.TipoEmpleado;
import com.unla.Grupo18.models.EmpleadoModel;
import com.unla.Grupo18.models.TipoEmpleadoModel;


public interface ITipoEmpleadoService {
	
	    public List<TipoEmpleado> getAll();
		
		public TipoEmpleadoModel findByTeId(int id);
		
		public TipoEmpleadoModel findByTeDescripcion(String name);


}
