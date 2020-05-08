package com.unla.Grupo18.converters;

import org.springframework.stereotype.Component;

import com.unla.Grupo18.entities.Sucursal;
import com.unla.Grupo18.models.SucursalModel;


@Component("sucursalConverter")
public class SucursalConverter {
	
	public SucursalModel entityToModel(Sucursal sucursal) {
		return new SucursalModel(sucursal.getSucursalesId(), sucursal.getSucursalesDireccion(),sucursal.getSucursalesEmail(),sucursal.getSucursalesLatitud(),sucursal.getSucursalesLongitud(),sucursal.getSucursalesTelefono());
	}

	
	public Sucursal modelToEntity(SucursalModel sucursalModel) {
		return new Sucursal (sucursalModel.getIdSucursal(),sucursalModel.getDireccion(),sucursalModel.getMail(),sucursalModel.getLatitud(), sucursalModel.getLongitud(),sucursalModel.getTelefono());
		
	}
}
