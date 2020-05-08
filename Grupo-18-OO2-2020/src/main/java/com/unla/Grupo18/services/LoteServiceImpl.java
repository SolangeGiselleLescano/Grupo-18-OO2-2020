package com.unla.Grupo18.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.unla.Grupo18.entities.LoteProducto;
import com.unla.Grupo18.repositories.ILoteRepository;


@Service
public class LoteServiceImpl implements ILoteService{
	
	private ILoteRepository iLoteRepository;
	
	 @Autowired
	    public void setLoteRepository(ILoteRepository iLoteRepository) {
	        this.iLoteRepository = iLoteRepository;
	    }

	@Override
	public List<LoteProducto> getAll() {
		return iLoteRepository.findAll();
	}

	@Override
	public LoteProducto findByIdLote(int idLote) {
		return iLoteRepository.findBylpRowid(idLote);
	}

	@Override
	public void insertOrUpdate(LoteProducto lote) {
		
		
	lote.setLpCantidad(lote.getLpCantidad());
	
		//lote.setCantidadActual(lote.getLpRowid());
		
		//lote.setProducto(lote.getProducto());
		//lote.setSucursal(lote.getSucursal());
		iLoteRepository.save(lote);
	   
		
	}

	@Override
	public void remove(int idLote) {
		iLoteRepository.deleteById(idLote);
		
	}

	
	
	

}
