package com.unla.Grupo18.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Empleado extends Persona {
	
	private int horasPorJornada;
	
	private float sueldoBasico;

	public Empleado() {
	}

	public Empleado(int horasPorJornada, float sueldoBasico) {
		super();
		this.horasPorJornada = horasPorJornada;
		this.sueldoBasico = sueldoBasico;
	}

	public int getHorasPorJornada() {
		return horasPorJornada;
	}

	public void setHorasPorJornada(int horasPorJornada) {
		this.horasPorJornada = horasPorJornada;
	}

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	
	
	
	

}
