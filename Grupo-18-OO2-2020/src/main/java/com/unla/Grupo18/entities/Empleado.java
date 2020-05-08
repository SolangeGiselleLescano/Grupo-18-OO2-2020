package com.unla.Grupo18.entities;

import javax.persistence.*;



@Entity

public class Empleado  extends Persona {


	
	private String empleadosFechaIngreso;

	
	private double empleadosSueldoBasico;


	@ManyToOne
	@JoinColumn(name="empleados_franjas_horarias_id")
	private FranjaHoraria franjaHoraria;



	@ManyToOne
	@JoinColumn(name="empleados_tipo_empleado")
	private TipoEmpleado tipoEmpleado;

	


	

	public String getEmpleadosFechaIngreso() {
		return this.empleadosFechaIngreso;
	}

	public void setEmpleadosFechaIngreso(String empleadosFechaIngreso) {
		this.empleadosFechaIngreso = empleadosFechaIngreso;
	}

	public double getEmpleadosSueldoBasico() {
		return this.empleadosSueldoBasico;
	}

	public void setEmpleadosSueldoBasico(double empleadosSueldoBasico) {
		this.empleadosSueldoBasico = empleadosSueldoBasico;
	}

	public FranjaHoraria getFranjaHoraria() {
		return this.franjaHoraria;
	}

	public void setFranjaHoraria(FranjaHoraria franjaHoraria) {
		this.franjaHoraria = franjaHoraria;
	}

	
	public TipoEmpleado getTipoEmpleado() {
		return this.tipoEmpleado;
	}

	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

}