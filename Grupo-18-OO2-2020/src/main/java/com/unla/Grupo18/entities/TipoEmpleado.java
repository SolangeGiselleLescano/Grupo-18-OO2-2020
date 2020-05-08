package com.unla.Grupo18.entities;

import javax.persistence.*;



@Entity
@Table(name="tipos_empleados")
public class TipoEmpleado  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="te_id")
	private int teId;

	@Column(name="te_descripcion")
	private String teDescripcion;

	public TipoEmpleado() {
	}

	public int getTeId() {
		return this.teId;
	}

	public void setTeId(int teId) {
		this.teId = teId;
	}

	public String getTeDescripcion() {
		return this.teDescripcion;
	}

	public void setTeDescripcion(String teDescripcion) {
		this.teDescripcion = teDescripcion;
	}

}