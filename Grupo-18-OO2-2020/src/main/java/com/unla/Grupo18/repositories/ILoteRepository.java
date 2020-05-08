package com.unla.Grupo18.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.unla.Grupo18.entities.LoteProducto;



@Repository("loteRepository")
public interface ILoteRepository extends JpaRepository<LoteProducto, Serializable>{
	
	//public LoteProducto findByIdLoteProducto(int idLote);
	
	public LoteProducto findBylpRowid(int idLote);
	


}
