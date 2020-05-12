package com.unla.Grupo18.entities;

import java.util.Date;

import javax.persistence.*;



@Entity
@PrimaryKeyJoinColumn(name="empleados_dni")
public class Empleado extends Persona {

	@Column(name="empleados_fecha_ingreso")
	private String empleadoFechaIngreso;
	
	@Column(name="empleados_sueldo_basico", scale = 2) // escala 2 por el decimal
	private double empleadoSueldoBasico;
	
	
   public Empleado( int personaId, String personaApellido,String personaNombre, String personaDireccion,
      		String personaEmail,  String personaTelefono, String personaFechaNacimiento,int personaTipo, String empleadoFechaIngreso, double empleadoSueldoBasico) 
   {
      super( personaId, personaApellido,personaNombre, personaDireccion, personaEmail, personaTelefono,personaFechaNacimiento, personaTipo );
      this.empleadoFechaIngreso = empleadoFechaIngreso;
	  this.empleadoSueldoBasico = empleadoSueldoBasico;
   }

   public Empleado( )  {
      super( );
   }


	@ManyToOne
	@JoinColumn(name="empleados_franjas_horarias_id")
	private FranjaHoraria franjaHoraria;



	@ManyToOne
	@JoinColumn(name="empleados_tipo_empleado")
	private TipoEmpleado tipoEmpleado;


	public String getEmpleadoFechaIngreso() {
		return this.empleadoFechaIngreso;
	}

	public void setEmpleadoFechaIngreso(String empleadoFechaIngreso) {
		this.empleadoFechaIngreso = empleadoFechaIngreso;
	}

	public double getEmpleadoSueldoBasico() {
		return this.empleadoSueldoBasico;
	}

	public void setEmpleadoSueldoBasico(double empleadoSueldoBasico) {
		this.empleadoSueldoBasico = empleadoSueldoBasico;
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