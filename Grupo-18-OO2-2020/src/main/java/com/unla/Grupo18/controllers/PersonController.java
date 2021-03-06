package com.unla.Grupo18.controllers;

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

import com.unla.Grupo18.herlpers.ViewRouteHelper;
import com.unla.Grupo18.models.PersonaModel;
import com.unla.Grupo18.services.IPersonService;


@Controller
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	@Qualifier("personService")
	private IPersonService personService;
	
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PERSON_INDEX);
		mAV.addObject("persons", personService.getAll());
		return mAV;
	}
	
	@GetMapping("/new")
	public ModelAndView create() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PERSON_NEW);
		mAV.addObject("persona", new PersonaModel());
		return mAV;
	}
	
	@PostMapping("/create")
	public RedirectView create(@ModelAttribute("person") PersonaModel personModel) {
		personService.insertOrUpdate(personModel);
		return new RedirectView(ViewRouteHelper.PERSON_ROOT);
	}
	
	@GetMapping("/{id}")
	public ModelAndView get(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PERSON_UPDATE);
	mAV.addObject("person", personService.findBypersonaId(id));
		return mAV;
	}
	
	@GetMapping("/by_name/{name}")
	public ModelAndView getByName(@PathVariable("name") String name) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PERSON_UPDATE);
		mAV.addObject("person", personService.findBypersonasNombre(name));
		return mAV;
	}
	
	/*
	@GetMapping("/by_degree/{degree_name}")
	public ModelAndView getByDegreeName(@PathVariable("degree_name") String degreeName) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PERSON_INDEX);
		mAV.addObject("persons", personService.findByDegreeName(degreeName));
		return mAV;
	}*/
	
	@PostMapping("/update")
	public RedirectView update(@ModelAttribute("person") PersonaModel personModel) {
		personService.insertOrUpdate(personModel);
		return new RedirectView(ViewRouteHelper.PERSON_ROOT);
	}
	
	@PostMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id) {
		personService.remove(id);
		return new RedirectView(ViewRouteHelper.PERSON_ROOT);
	}

}
