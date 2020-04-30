package com.example.TPCGrupo18.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedido;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@OneToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idVendedor", nullable=true)
	private Vendedor vendedor;
	
	@OneToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idProducto", nullable=true)
	private Producto producto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idVenta", nullable=true)
	private Venta venta;

	public Venta getVenta() {
		return venta;
	}



	public void setVenta(Venta venta) {
		this.venta = venta;
	}



	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Pedido(int idPedido, int cantidad, Vendedor vendedor, Producto producto) {
		super();
		this.idPedido = idPedido;
		this.cantidad = cantidad;
		this.vendedor = vendedor;
		this.producto = producto;
	}


	

	public Pedido(int cantidad, Vendedor vendedor, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.vendedor = vendedor;
		this.producto = producto;
	}



	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
	
	

}
