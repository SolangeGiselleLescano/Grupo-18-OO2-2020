package com.unla.Grupo18.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.Grupo18.entities.Empleado;
import com.unla.Grupo18.herlpers.ViewRouteHelper;
import com.unla.Grupo18.models.EmpleadoModel;
import com.unla.Grupo18.services.IEmpleadoService;
import com.unla.Grupo18.services.ITipoEmpleadoService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
	
	@Autowired
	@Qualifier("empleadoService")
	private IEmpleadoService empleadoService;
	
	@Autowired
	@Qualifier("tipoEmpleadoService")
	private ITipoEmpleadoService tipoEmpleadoService;
			
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.EMPLEADO_INDEX);
		mAV.addObject("empleados", empleadoService.getAll());
		mAV.addObject("tipoEmpleados", tipoEmpleadoService.getAll());
		return mAV;
	}
	
	@GetMapping("/new")
	public ModelAndView create() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.EMPLEADO_NEW);
		mAV.addObject("empleado", new EmpleadoModel());
		mAV.addObject("tipoEmpleados", tipoEmpleadoService.getAll());
		return mAV;
	}
	
	@GetMapping("/create")
	public RedirectView create(@ModelAttribute("empleado") EmpleadoModel empleadoModel) {
		empleadoService.insertOrUpdate(empleadoModel);
		return new RedirectView(ViewRouteHelper.EMPLEADO_ROOT);
	}
	
	@GetMapping("/id/{id}")
	public ModelAndView getByName(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.EMPLEADO_UPDATE);
		EmpleadoModel emp = empleadoService.findByPersonaId(id);
		mAV.addObject("empleado", empleadoService.findByPersonaId(id));
		mAV.addObject("tipoEmpleado", tipoEmpleadoService.findByTeId(empleadoService.findByPersonaId(id).getPersonaTipo()));
		mAV.addObject("tipoEmpleados", tipoEmpleadoService.getAll());
		return mAV;
	}
	
	@GetMapping("/by_name/{name}")
	public ModelAndView getByName(@PathVariable("name") String name) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.EMPLEADO_UPDATE);
		mAV.addObject("empleado", empleadoService.findByEmpleadoNombre(name));
		return mAV;
	}
	
	/*
	@GetMapping("/by_degree/{degree_name}")
	public ModelAndView getByDegreeName(@PathVariable("degree_name") String degreeName) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.empleado_INDEX);
		mAV.addObject("empleados", empleadoService.findByDegreeName(degreeName));
		return mAV;
	}*/
	
	@PostMapping("/update/{empleado}")
	public RedirectView update(@ModelAttribute("empleado") EmpleadoModel empleadoModel) {
		empleadoService.insertOrUpdate(empleadoModel);
		return new RedirectView(ViewRouteHelper.EMPLEADO_ROOT);
	}
	
	@GetMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id) {
		empleadoService.remove(id);
		return new RedirectView(ViewRouteHelper.EMPLEADO_ROOT);
	}

}
