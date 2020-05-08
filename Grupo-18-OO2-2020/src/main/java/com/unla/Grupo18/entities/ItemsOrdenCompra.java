package com.unla.Grupo18.entities;

import javax.persistence.*;


@Entity
@Table(name="items_orden_compra")

public class ItemsOrdenCompra  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ioc_rowid")
	private int iocRowid;

	@Column(name="ioc_cantidad")
	private int iocCantidad;

	@Column(name="ior_compra_id")
	private int iorCompraId;

	@ManyToOne
	@JoinColumn(name="items_orden_compra_producto_id")
	private Producto producto;

	public ItemsOrdenCompra() {
	}

	public int getIocRowid() {
		return this.iocRowid;
	}

	public void setIocRowid(int iocRowid) {
		this.iocRowid = iocRowid;
	}

	public int getIocCantidad() {
		return this.iocCantidad;
	}

	public void setIocCantidad(int iocCantidad) {
		this.iocCantidad = iocCantidad;
	}

	public int getIorCompraId() {
		return this.iorCompraId;
	}

	public void setIorCompraId(int iorCompraId) {
		this.iorCompraId = iorCompraId;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}