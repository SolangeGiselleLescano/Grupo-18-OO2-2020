package com.unla.Grupo18.services;

import java.util.List;

import com.unla.Grupo18.entities.Producto;
import com.unla.Grupo18.models.ProductoModel;



public interface IProductoService {
	
public List<Producto> getAll();
	
	public ProductoModel findById(int id);
	
	public ProductoModel findByName(String name);
	
	public ProductoModel insertOrUpdate(ProductoModel productoModel);
	
	public boolean remove(int id);
	
	

}
