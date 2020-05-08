package com.unla.Grupo18.services;

import java.util.List;


import com.unla.Grupo18.entities.LoteProducto;
import com.unla.Grupo18.entities.Producto;

public interface ILoteService {

	
    public List<LoteProducto> getAll();
	
	public LoteProducto findByIdLote(int idLote);
	
	//public Lote  findByDescripcion(String descripcion);
	
	public void insertOrUpdate(LoteProducto lote);
	
	void remove(int idLote);
}
