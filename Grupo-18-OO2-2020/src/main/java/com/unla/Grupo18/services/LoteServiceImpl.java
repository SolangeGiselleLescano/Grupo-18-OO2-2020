package com.unla.Grupo18.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.Grupo18.entities.Lote;
import com.unla.Grupo18.repositories.ILoteRepository;
import com.unla.Grupo18.repositories.IProductoRepository;

@Service
public class LoteServiceImpl implements ILoteService{
	
	private ILoteRepository iLoteRepository;
	
	 @Autowired
	    public void setLoteRepository(ILoteRepository iLoteRepository) {
	        this.iLoteRepository = iLoteRepository;
	    }

	@Override
	public List<Lote> getAll() {
		return iLoteRepository.findAll();
	}

	@Override
	public Lote findByIdLote(int idLote) {
		return iLoteRepository.findByIdLote(idLote);
	}

	@Override
	public void insertOrUpdate(Lote lote) {
			    
		lote.setCantidadActual(lote.getCantidadActual());
		lote.setCantidadProducto(lote.getCantidadProducto());
		//lote.setProducto(lote.getProducto());
		//lote.setSucursal(lote.getSucursal());
		iLoteRepository.save(lote);
	   
		
	}

	@Override
	public void remove(int idLote) {
		iLoteRepository.deleteById(idLote);
		
	}

	
	
	

}
