package com.unla.Grupo18.models;

public class TipoEmpleadoModel {

   private int teId;

   private String teDescripcion;

   public TipoEmpleadoModel(int teId,String teDescripcion) {
	   this.teId = teId;
	   this.teDescripcion = teDescripcion;
   }
   
   public TipoEmpleadoModel() {

   }

   public int getTeId() {
	 return this.teId;
   }

	public void setTeId(int teId) {
	  this.teId = teId;
	}

   public String getTeDescripcion() {
	 return this.teDescripcion;
   }

	public void setTeDescripcion(String teDescripcion) {
		this.teDescripcion = teDescripcion;
	}

	
	
}