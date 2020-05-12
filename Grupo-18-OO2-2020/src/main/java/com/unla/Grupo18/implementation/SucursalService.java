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
public class SucursalService implements ISucursalService {
	
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

	@Override
	public double distnaciaSucursales(SucursalModel sucursal, SucursalModel sucursal2) {
		
		
		double radioTierra = 6371; //en kilómetros
		double dLat = Math.toRadians(sucursal.getLatitud() - sucursal2.getLatitud());
		double dLng = Math.toRadians(sucursal.getLongitud()- sucursal2.getLongitud());
		double sindLat = Math.sin(dLat / 2);
		double sindLng = Math.sin(dLng / 2);
		double va1 = Math.pow(sindLat, 2)
		+ Math.pow(sindLng, 2) * Math.cos(Math.toRadians(sucursal.getLatitud())) * Math.cos(Math.toRadians(sucursal2.getLatitud()));
		double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));
		return radioTierra * va2;
		
	}

	@Override
	public double distancias(SucursalModel sucursal) {
		List<Sucursal> sucursales = sucursalRepository.findAll();
		SucursalModel sucursal2;
		SucursalModel sucpivote = new SucursalModel();
		double distancia = 0;
		for(int indice = 0;indice< sucursales.size();indice++)
		{
			
			sucursal2 = sucursalConverter.entityToModel(sucursales.get(indice));
			
			if(sucursal2.getIdSucursal() != sucursal.getIdSucursal()){
				
				
				double radioTierra = 6371; //en kilómetros
				double dLat = Math.toRadians(sucursal.getLatitud() - sucursal2.getLatitud());
				double dLng = Math.toRadians(sucursal.getLongitud()- sucursal2.getLongitud());
				double sindLat = Math.sin(dLat / 2);
				double sindLng = Math.sin(dLng / 2);
				double va1 = Math.pow(sindLat, 2)
						+ Math.pow(sindLng, 2) * Math.cos(Math.toRadians(sucursal.getLatitud())) * Math.cos(Math.toRadians(sucursal2.getLatitud()));
				double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));

				double distanciaPivote = radioTierra * va2;

				if (indice == 1) {
					
					distancia = distanciaPivote;
					
					
				} 
				if (distanciaPivote < distancia) {
					sucpivote = sucursal2;
					distancia = distanciaPivote;
					
				}									
			}		
		}

		return distancia;

	}

}
