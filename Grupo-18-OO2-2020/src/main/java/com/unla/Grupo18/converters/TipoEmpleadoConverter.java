package com.unla.Grupo18.converters;

import org.springframework.stereotype.Component;

import com.unla.Grupo18.entities.TipoEmpleado;
import com.unla.Grupo18.models.TipoEmpleadoModel;

@Component("tipoEmpleadoConverter")
public class TipoEmpleadoConverter {
	
	public TipoEmpleadoModel entityToModel(TipoEmpleado tipoEmpleado) {
		return new TipoEmpleadoModel(
				tipoEmpleado.getTeId(),
				tipoEmpleado.getTeDescripcion()
        );
	}

	public TipoEmpleado modelToEntity(TipoEmpleadoModel tipoEmpleadoModel) {
		return new TipoEmpleado(
				tipoEmpleadoModel.getTeId(),
				tipoEmpleadoModel.getTeDescripcion()
				);
	}
	

}
