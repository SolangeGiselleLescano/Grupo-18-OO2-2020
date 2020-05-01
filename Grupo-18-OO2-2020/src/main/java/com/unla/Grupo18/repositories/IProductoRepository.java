package com.unla.Grupo18.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unla.Grupo18.entities.Producto;


@Repository("personRepository")
public interface IProductoRepository extends JpaRepository<Producto, Serializable> {
	
	public abstract Producto findById(int id);
	
	public abstract Producto findByName(String name);
	

}