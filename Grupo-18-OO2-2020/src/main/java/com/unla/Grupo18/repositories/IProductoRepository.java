package com.unla.Grupo18.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unla.Grupo18.entities.Producto;


@Repository("productoRepository")
public interface IProductoRepository extends JpaRepository<Producto, Serializable> {
	
	public Producto findByproductosId(int idProducto);
	
	public Producto findByproductosDescripcion(String descripcion);
	

}