package com.unla.Grupo18.entities;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;



@Entity
@Table(name="productos")
public class Producto  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="productos_id")
	private int productosId;

	@Column(name="producto_codigo")
	private String productoCodigo;

	@Column(name="productos_descripcion")
	private String productosDescripcion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="productos_fecha_alta")
	private Date productosFechaAlta;

	@Column(name="productos_marca")
	private String productosMarca;

	@Column(name="productos_precio_unitario")
	private BigDecimal productosPrecioUnitario;

	public Producto() {
	}

	public int getProductosId() {
		return this.productosId;
	}

	public void setProductosId(int productosId) {
		this.productosId = productosId;
	}

	public String getProductoCodigo() {
		return this.productoCodigo;
	}

	public void setProductoCodigo(String productoCodigo) {
		this.productoCodigo = productoCodigo;
	}

	public String getProductosDescripcion() {
		return this.productosDescripcion;
	}

	public void setProductosDescripcion(String productosDescripcion) {
		this.productosDescripcion = productosDescripcion;
	}

	public Date getProductosFechaAlta() {
		return this.productosFechaAlta;
	}

	public void setProductosFechaAlta(Date productosFechaAlta) {
		this.productosFechaAlta = productosFechaAlta;
	}

	public String getProductosMarca() {
		return this.productosMarca;
	}

	public void setProductosMarca(String productosMarca) {
		this.productosMarca = productosMarca;
	}

	public BigDecimal getProductosPrecioUnitario() {
		return this.productosPrecioUnitario;
	}

	public void setProductosPrecioUnitario(BigDecimal productosPrecioUnitario) {
		this.productosPrecioUnitario = productosPrecioUnitario;
	}

}