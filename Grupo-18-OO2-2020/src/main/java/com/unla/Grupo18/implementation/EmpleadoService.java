package com.unla.Grupo18.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.Grupo18.converters.EmpleadoConverter;
import com.unla.Grupo18.entities.Empleado;
import com.unla.Grupo18.models.EmpleadoModel;
import com.unla.Grupo18.repositories.IEmpleadoRepository;
import com.unla.Grupo18.services.IEmpleadoService;

@Service("empleadoService")
public class EmpleadoService implements IEmpleadoService {

	@Autowired
	@Qualifier("empleadoRepository")
	private IEmpleadoRepository empleadoRepository;
	
	@Autowired
	@Qualifier("empleadoConverter")
	private EmpleadoConverter empleadoConverter;
	
	@Override
	public List<Empleado> getAll() {
		return empleadoRepository.findAll();
	}

	@Override
	public EmpleadoModel insertOrUpdate(EmpleadoModel empleadoModel) {
		Empleado empleado = empleadoRepository.save(empleadoConverter.modelToEntity(empleadoModel));
		return empleadoConverter.entityToModel(empleado);
	}

	@Override
	public boolean remove(int id) {
		try {
			empleadoRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public EmpleadoModel findByPersonaId(int id) {
		return empleadoConverter.entityToModel(empleadoRepository.findByPersonaId(id));
	}

	@Override
	public EmpleadoModel findByEmpleadoNombre(String name) {
		return empleadoConverter.entityToModel(empleadoRepository.findByPersonaNombre(name));
	}

	/*
	@Override
	public List<PersonModel> findByDegreeName(String degreeName) {
		List<PersonModel> models = new ArrayList<PersonModel>();
		for (Person person : personRepository.findByDegreeName(degreeName)) {
			models.add(personConverter.entityToModel(person));
		}
		return models;
	}*/


}
