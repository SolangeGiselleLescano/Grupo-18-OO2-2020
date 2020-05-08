package com.unla.Grupo18.services;

import java.util.List;

import com.unla.Grupo18.entities.Sucursal;
import com.unla.Grupo18.models.SucursalModel;

public interface ISucursalService {
	
	
	public List<Sucursal> getAll();
	
	public SucursalModel findBysucursalesId(int idSucursal);
	
	
	public SucursalModel insertOrUpdate(SucursalModel sucursal);
	
	public  boolean  remove (int idSucursal);

}
