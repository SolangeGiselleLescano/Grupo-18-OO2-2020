package com.unla.Grupo18.entities;

import javax.persistence.*;


@Entity
@Table(name="franjas_horarias")
public class FranjaHoraria  {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="fh_id")
	private int fhId;

	@Column(name="fh_desde")
	private String fhDesde;

	@Column(name="fh_hasta")
	private String fhHasta;

	public FranjaHoraria() {
	}

	public int getFhId() {
		return this.fhId;
	}

	public void setFhId(int fhId) {
		this.fhId = fhId;
	}

	public String getFhDesde() {
		return this.fhDesde;
	}

	public void setFhDesde(String fhDesde) {
		this.fhDesde = fhDesde;
	}

	public String getFhHasta() {
		return this.fhHasta;
	}

	public void setFhHasta(String fhHasta) {
		this.fhHasta = fhHasta;
	}

}