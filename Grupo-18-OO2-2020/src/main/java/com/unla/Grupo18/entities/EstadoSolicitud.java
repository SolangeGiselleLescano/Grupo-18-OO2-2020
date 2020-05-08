package com.unla.Grupo18.entities;

import javax.persistence.*;


@Entity
@Table(name="estados_solicitudes")
public class EstadoSolicitud  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="es_id")
	private int esId;

	@Column(name="es_descripcion")
	private String esDescripcion;

	public EstadoSolicitud() {
	}

	public int getEsId() {
		return this.esId;
	}

	public void setEsId(int esId) {
		this.esId = esId;
	}

	public String getEsDescripcion() {
		return this.esDescripcion;
	}

	public void setEsDescripcion(String esDescripcion) {
		this.esDescripcion = esDescripcion;
	}

}