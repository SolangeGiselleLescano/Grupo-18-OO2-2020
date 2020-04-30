package com.example.TPCGrupo18.entitys;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVenta;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="fecha")
	@CreationTimestamp
	private LocalDate fecha;
	
	@Column(name="hora")
	@CreationTimestamp
	private LocalTime hora;
	
	
	@Column(name="precioTotal")
	private float precioTotal;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idCliente", nullable=true)
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idVendedor", nullable=true)
	private Vendedor vendedor;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	// normalmente nullable es igual a false, en este caso se deja como true porque el ejemplo es simple
	@JoinColumn(name="idSucursal", nullable=true)
	private Sucursal sucursal;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="venta")
	private Set<Pedido> pedidos = new HashSet<Pedido>();
	
	

	public Venta() {
	}



	public Venta(int numero, LocalDate fecha, LocalTime hora, float precioTotal, Cliente cliente, Vendedor vendedor,
			Sucursal sucursal) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.hora = hora;
		this.precioTotal = precioTotal;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.sucursal = sucursal;
		//this.pedidos = pedidos;
	}



	public Venta(int idVenta, int numero, LocalDate fecha, LocalTime hora, float precioTotal, Cliente cliente,
			Vendedor vendedor, Sucursal sucursal) {
		super();
		this.idVenta = idVenta;
		this.numero = numero;
		this.fecha = fecha;
		this.hora = hora;
		this.precioTotal = precioTotal;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.sucursal = sucursal;
		//this.pedidos = pedidos;
	}



	public int getIdVenta() {
		return idVenta;
	}



	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}



	public LocalTime getHora() {
		return hora;
	}



	public void setHora(LocalTime hora) {
		this.hora = hora;
	}



	public float getPrecioTotal() {
		return precioTotal;
	}



	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Vendedor getVendedor() {
		return vendedor;
	}



	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}



	public Sucursal getSucursal() {
		return sucursal;
	}



	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}



	public Set<Pedido> getPedidos() {
		return pedidos;
	}



	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}



	
	
	
	
	

}
