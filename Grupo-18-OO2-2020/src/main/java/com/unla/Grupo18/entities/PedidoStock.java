package com.unla.Grupo18.entities;

import javax.persistence.*;



@Entity
@Table(name="pedidos_stock")
public class PedidoStock  {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ps_rowid")
	private int psRowid;

	@Column(name="ps_orden_compra_id")
	private int psOrdenCompraId;

	@Column(name="ps_sucursal_destino_id")
	private int psSucursalDestinoId;

	@Column(name="ps_sucursal_solicitante_id")
	private int psSucursalSolicitanteId;


	@ManyToOne
	@JoinColumn(name="ps_estado_solicitud_id")
	private EstadoSolicitud estadoSolicitud;

	public PedidoStock() {
	}

	public int getPsRowid() {
		return this.psRowid;
	}

	public void setPsRowid(int psRowid) {
		this.psRowid = psRowid;
	}

	public int getPsOrdenCompraId() {
		return this.psOrdenCompraId;
	}

	public void setPsOrdenCompraId(int psOrdenCompraId) {
		this.psOrdenCompraId = psOrdenCompraId;
	}

	public int getPsSucursalDestinoId() {
		return this.psSucursalDestinoId;
	}

	public void setPsSucursalDestinoId(int psSucursalDestinoId) {
		this.psSucursalDestinoId = psSucursalDestinoId;
	}

	public int getPsSucursalSolicitanteId() {
		return this.psSucursalSolicitanteId;
	}

	public void setPsSucursalSolicitanteId(int psSucursalSolicitanteId) {
		this.psSucursalSolicitanteId = psSucursalSolicitanteId;
	}

	public EstadoSolicitud getEstadoSolicitud() {
		return this.estadoSolicitud;
	}

	public void setEstadoSolicitud(EstadoSolicitud estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

}