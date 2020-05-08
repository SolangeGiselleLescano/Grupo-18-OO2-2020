package com.unla.Grupo18.entities;

import javax.persistence.*;
import java.util.Date;
import com.unla.Grupo18.entities.*;

@Entity
@Table(name="lote_productos")
public class LoteProducto  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="lp_rowid")
	private int lpRowid;

	@Column(name="lp_cantidad")
	private int lpCantidad;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lp_fecha_ingreso")
	private Date lpFechaIngreso;

	@ManyToOne
	@JoinColumn(name="lp_productos_id")
	private Producto producto;

	@ManyToOne
	@JoinColumn(name="lp_stock_sucursal_id")
	private StockSucursal stockSucursal;

	public LoteProducto() {
	}

	public int getLpRowid() {
		return this.lpRowid;
	}

	public void setLpRowid(int lpRowid) {
		this.lpRowid = lpRowid;
	}

	public int getLpCantidad() {
		return this.lpCantidad;
	}

	public void setLpCantidad(int lpCantidad) {
		this.lpCantidad = lpCantidad;
	}

	public Date getLpFechaIngreso() {
		return this.lpFechaIngreso;
	}

	public void setLpFechaIngreso(Date lpFechaIngreso) {
		this.lpFechaIngreso = lpFechaIngreso;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public StockSucursal getStockSucursal() {
		return this.stockSucursal;
	}

	public void setStockSucursal(StockSucursal stockSucursal) {
		this.stockSucursal = stockSucursal;
	}

}