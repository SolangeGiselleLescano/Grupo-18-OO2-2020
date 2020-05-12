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

import com.unla.Grupo18.entities.Cliente;
import com.unla.Grupo18.herlpers.ViewRouteHelper;
import com.unla.Grupo18.models.ClienteModel;
import com.unla.Grupo18.services.IClienteService;
import com.unla.Grupo18.services.ITipoEmpleadoService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	@Qualifier("clienteService")
	private IClienteService clienteService;
	
	@Autowired
	@Qualifier("tipoEmpleadoService")
	private ITipoEmpleadoService tipoEmpleadoService;
			
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.CLIENTE_INDEX);
		mAV.addObject("clientes", clienteService.getAll());
		mAV.addObject("tipoEmpleados", tipoEmpleadoService.getAll());
		return mAV;
	}
	
	@GetMapping("/new")
	public ModelAndView create() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.CLIENTE_NEW);
		mAV.addObject("cliente", new ClienteModel());
		mAV.addObject("tipoClientes", tipoEmpleadoService.getAll());
		return mAV;
	}
	
	@GetMapping("/create")
	public RedirectView create(@ModelAttribute("cliente") ClienteModel clienteModel) {
		clienteService.insertOrUpdate(clienteModel);
		return new RedirectView(ViewRouteHelper.CLIENTE_ROOT);
	}
	
	
	
	@GetMapping("/by_name/{name}")
	public ModelAndView getByName(@PathVariable("name") String name) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.CLIENTE_UPDATE);
		mAV.addObject("cliente", clienteService.findByClienteNombre(name));
		return mAV;
	}
	
	@GetMapping("/id/{id}")
	public ModelAndView getByName(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.CLIENTE_UPDATE);
		ClienteModel emp = clienteService.findByPersonaId(id);
		mAV.addObject("cliente", clienteService.findByPersonaId(id));
		//mAV.addObject("tipoEmpleado", tipoEmpleadoService.findByTeId(clienteService.findByPersonaId(id).getPersonaTipo()));
		//mAV.addObject("tipoEmpleados", tipoEmpleadoService.getAll());
		return mAV;
	}
	/*
	@GetMapping("/by_degree/{degree_name}")
	public ModelAndView getByDegreeName(@PathVariable("degree_name") String degreeName) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.cliente_INDEX);
		mAV.addObject("clientes", clienteService.findByDegreeName(degreeName));
		return mAV;
	}*/
	
	@PostMapping("/update/{cliente}")
	public RedirectView update(@ModelAttribute("cliente") ClienteModel clienteModel) {
		clienteService.insertOrUpdate(clienteModel);
		return new RedirectView(ViewRouteHelper.CLIENTE_ROOT);
	}
	
	@GetMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id) {
		clienteService.remove(id);
		return new RedirectView(ViewRouteHelper.CLIENTE_ROOT);
	}

}
