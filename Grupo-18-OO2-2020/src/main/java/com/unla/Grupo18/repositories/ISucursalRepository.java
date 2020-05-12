package com.unla.Grupo18.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.Grupo18.entities.Sucursal;
import com.unla.Grupo18.models.SucursalModel;

@Repository("sucursalRepository")
public interface ISucursalRepository extends JpaRepository<Sucursal, Serializable>{
	
	public Sucursal findBysucursalesId(int idSucursal);
	
	//public double distnaciaSucursales(SucursalModel sucursal,SucursalModel sucursal2);
	
	
	
	

}
