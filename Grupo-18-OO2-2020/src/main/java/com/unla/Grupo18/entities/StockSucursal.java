package com.unla.Grupo18.entities;

import javax.persistence.*;



@Entity
@Table(name="stock_sucursal")
public class StockSucursal  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ss_rowid")
	private int ssRowid;

	@Column(name="ss_lote")
	private int ssLote;

	@ManyToOne
	@JoinColumn(name="ss_sucursal_id")
	private Sucursal sucursal;

	public StockSucursal() {
	}

	public int getSsRowid() {
		return this.ssRowid;
	}

	public void setSsRowid(int ssRowid) {
		this.ssRowid = ssRowid;
	}

	public int getSsLote() {
		return this.ssLote;
	}

	public void setSsLote(int ssLote) {
		this.ssLote = ssLote;
	}

	public Sucursal getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

}