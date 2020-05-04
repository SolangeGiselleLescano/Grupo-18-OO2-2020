package com.unla.Grupo18.services;

import java.util.List;

import com.unla.Grupo18.entities.Lote;
import com.unla.Grupo18.entities.Producto;

public interface ILoteService {

	
    public List<Lote> getAll();
	
	public Lote findByIdLote(int idLote);
	
	//public Lote  findByDescripcion(String descripcion);
	
	public void insertOrUpdate(Lote lote);
	
	void remove(int idLote);
}
