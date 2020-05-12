package com.unla.Grupo18.models;

import java.util.Date;


import com.unla.Grupo18.entities.Empleado;

public class EmpleadoModel extends PersonaModel {
	
	
	private String empleadoFechaIngreso;
	
	private double empleadoSueldoBasico;
	
	
	
	public EmpleadoModel(int personaId,  String personaApellido,String personaNombre, String personaDireccion,
			String personaEmail,  String personaTelefono,String personaFechaNacimiento, int personaTipo,String empleadoFechaIngreso, double empleadoSueldoBasico) {
		super(personaId,  personaApellido, personaNombre,  personaDireccion,
				 personaEmail,   personaTelefono, personaFechaNacimiento, personaTipo);
		this.empleadoFechaIngreso = empleadoFechaIngreso;
		this.empleadoSueldoBasico = empleadoSueldoBasico;
	}
	
	
	
	
	public EmpleadoModel() {
	
	}

	public String getEmpleadoFechaIngreso() {
		return empleadoFechaIngreso;
	}

	public void setEmpleadoFechaIngreso(String empleadoFechaIngreso) {
		this.empleadoFechaIngreso = empleadoFechaIngreso;
	}

	public double getEmpleadoSueldoBasico() {
		return empleadoSueldoBasico;
	}

	public void setEmpleadoSueldoBasico(double empleadoSueldoBasico) {
		this.empleadoSueldoBasico = empleadoSueldoBasico;
	}
	
	
	public Empleado getEmpleado() {
		return null;
		
	}
	
	
}