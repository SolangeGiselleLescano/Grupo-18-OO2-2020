package com.unla.Grupo18.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.Grupo18.converters.SucursalConverter;
import com.unla.Grupo18.entities.Sucursal;
import com.unla.Grupo18.models.SucursalModel;
import com.unla.Grupo18.repositories.ISucursalRepository;
import com.unla.Grupo18.services.ISucursalService;





@Service("sucursalService")
public class SucrusalService implements ISucursalService {
	
	@Autowired
	@Qualifier("sucursalRepository")
	private ISucursalRepository sucursalRepository;
	
	@Autowired
	@Qualifier("sucursalConverter")
	private SucursalConverter sucursalConverter;

	@Override
	public List<Sucursal> getAll() {
		return sucursalRepository.findAll();
	}

	@Override
	public SucursalModel findBysucursalesId(int idSucursal) {
		return sucursalConverter.entityToModel(sucursalRepository.findBysucursalesId(idSucursal));
		
		
	}

	@Override
	public SucursalModel insertOrUpdate(SucursalModel sucursalModel) {
		Sucursal sucursal = sucursalRepository.save(sucursalConverter.modelToEntity(sucursalModel));
		return sucursalConverter.entityToModel(sucursal);
		
	}

	@Override
	public boolean remove(int idSucursal) {
		try {
			sucursalRepository.deleteById(idSucursal);
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}
	
	
	
	

}
