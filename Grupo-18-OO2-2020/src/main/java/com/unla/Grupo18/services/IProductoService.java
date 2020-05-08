package com.unla.Grupo18.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unla.Grupo18.entities.Producto;
import com.unla.Grupo18.models.ProductoModel;


public interface IProductoService {
	
    public List<Producto> getAll();
	
	public Producto findByproductosId(int idProducto);
	
	public Producto findByproductosDescripcion(String descripcion);
	
	public void insertOrUpdate(Producto producto);
	
	void remove(int idProducto);

	


}
