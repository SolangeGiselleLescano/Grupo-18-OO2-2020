package com.unla.Grupo18.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="orden_compra")
public class OrdenCompra  {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="oc_id")
	private int ocId;

	@Column(name="oc_descripcion")
	private String ocDescripcion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="oc_fecha_creacion")
	private Date ocFechaCreacion;

	@Column(name="oc_observacion")
	private String ocObservacion;


	@ManyToOne
	@JoinColumn(name="oc_cliente_id")
	private Cliente cliente;


	@ManyToOne
	@JoinColumn(name="oc_empleado_id")
	private Empleado empleado;


	@ManyToOne
	@JoinColumn(name="oc_estados_solicitudes_id")
	private EstadoSolicitud estadoSolicitud;


	@ManyToOne
	@JoinColumn(name="oc_sucursal_id")
	private Sucursal sucursal;

	public OrdenCompra() {
	}

	public int getOcId() {
		return this.ocId;
	}

	public void setOcId(int ocId) {
		this.ocId = ocId;
	}

	public String getOcDescripcion() {
		return this.ocDescripcion;
	}

	public void setOcDescripcion(String ocDescripcion) {
		this.ocDescripcion = ocDescripcion;
	}

	public Date getOcFechaCreacion() {
		return this.ocFechaCreacion;
	}

	public void setOcFechaCreacion(Date ocFechaCreacion) {
		this.ocFechaCreacion = ocFechaCreacion;
	}

	public String getOcObservacion() {
		return this.ocObservacion;
	}

	public void setOcObservacion(String ocObservacion) {
		this.ocObservacion = ocObservacion;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public EstadoSolicitud getEstadoSolicitud() {
		return this.estadoSolicitud;
	}

	public void setEstadoSolicitud(EstadoSolicitud estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public Sucursal getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

}