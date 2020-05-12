package com.unla.Grupo18.converters;

import org.springframework.stereotype.Component;

import com.unla.Grupo18.entities.Empleado;
import com.unla.Grupo18.models.EmpleadoModel;


@Component("empleadoConverter")
public class EmpleadoConverter {
	
	public EmpleadoModel entityToModel(Empleado empleado) {
		return new EmpleadoModel(
				   empleado.getPersonaId(),
				   empleado.getPersonaApellido(),
				   empleado.getPersonaNombre(),
				   empleado.getPersonaDireccion(),
				   empleado.getPersonaEmail(),
				   empleado.getPersonaTelefono(),
				   empleado.getPersonaFechaNacimiento(),
				   empleado.getPersonaTipo(), 
				   empleado.getEmpleadoFechaIngreso(), 
				   empleado.getEmpleadoSueldoBasico());
	}

	public Empleado modelToEntity(EmpleadoModel empleadoModel) {
		return new Empleado(
				empleadoModel.getPersonaId(),
				empleadoModel.getPersonaApellido(),
				empleadoModel.getPersonaNombre(),
				empleadoModel.getPersonaDireccion(),
				empleadoModel.getPersonaEmail(),
				empleadoModel.getPersonaTelefono(),
				empleadoModel.getPersonaFechaNacimiento(),
				empleadoModel.getPersonaTipo(),
				empleadoModel.getEmpleadoFechaIngreso(),
				empleadoModel.getEmpleadoSueldoBasico());
	}
	

}
