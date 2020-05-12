package com.unla.Grupo18.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.Grupo18.converters.TipoEmpleadoConverter;
import com.unla.Grupo18.entities.TipoEmpleado;
import com.unla.Grupo18.models.TipoEmpleadoModel;
import com.unla.Grupo18.repositories.ITipoEmpleadoRepository;
import com.unla.Grupo18.services.ITipoEmpleadoService;



@Service("tipoEmpleadoService")
public class TipoEmpleadoService implements ITipoEmpleadoService {

	@Autowired
	@Qualifier("tipoEmpleadoRepository")
	private ITipoEmpleadoRepository tipoEmpleadoRepository;
	
	@Autowired
	@Qualifier("tipoEmpleadoConverter")
	private TipoEmpleadoConverter tipoEmpleadoConverter;

	@Override
	public List<TipoEmpleado> getAll() {
		return tipoEmpleadoRepository.findAll();
	}

	@Override
	public TipoEmpleadoModel findByTeId(int id) {
		return tipoEmpleadoConverter.entityToModel(tipoEmpleadoRepository.findByTeId(id));
	}

	@Override
	public TipoEmpleadoModel findByTeDescripcion(String name) {
		return tipoEmpleadoConverter.entityToModel(tipoEmpleadoRepository.findByTeDescripcion(name));
	}
	




}
