package com.unla.Grupo18.models;

import java.time.LocalDate;

public class LoteModel {
	
	private int idLote;
	private int cantidadProducto;
	private int cantidadActual;
	private LocalDate fechaDeIngreso;
	
	
	public LoteModel() {
	}


	public LoteModel(int idLote, int cantidadProducto, int cantidadActual, LocalDate fechaDeIngreso) {
		super();
		this.idLote = idLote;
		this.cantidadProducto = cantidadProducto;
		this.cantidadActual = cantidadActual;
		this.fechaDeIngreso = fechaDeIngreso;
	}


	public int getId_Lote() {
		return idLote;
	}


	public void setId_Lote(int id_Lote) {
		this.idLote = id_Lote;
	}


	public int getCantidadProducto() {
		return cantidadProducto;
	}


	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}


	public int getCantidadActual() {
		return cantidadActual;
	}


	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}


	public LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}


	public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	
	
	
	
	

}
