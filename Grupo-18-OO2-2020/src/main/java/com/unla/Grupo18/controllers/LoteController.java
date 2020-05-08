package com.unla.Grupo18.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.Grupo18.entities.LoteProducto;
import com.unla.Grupo18.entities.Producto;
import com.unla.Grupo18.herlpers.ViewRouteHelper;
import com.unla.Grupo18.services.ILoteService;;

@Controller
@RequestMapping("/lote")
public class LoteController {
	
	@Autowired
	private ILoteService loteService;
	
	@GetMapping("")
	public ModelAndView index() {

		ModelAndView mAV = new ModelAndView(ViewRouteHelper.LOTE_INDEX);
		mAV.addObject("lotes", loteService.getAll());
		return mAV;
	}
	
	@GetMapping("/new")
	public ModelAndView create() {
		
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.LOTE_NEW);
		mAV.addObject("lote", new LoteProducto());		
		return mAV;
	}
	
	@GetMapping("/create")
	public RedirectView create(@ModelAttribute("lote") LoteProducto lote) {
		loteService.insertOrUpdate(lote);
		return new RedirectView(ViewRouteHelper.LOTE_ROOT); 
	}
	
	@GetMapping("/{id}")
	public ModelAndView get(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.LOTE_INFO);
		mAV.addObject("lote", loteService.findByIdLote(id));
		return mAV;
	}
	
	
	
	@GetMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.LOTE_UPDATE);
		mAV.addObject("lote", loteService.findByIdLote(id));
		return mAV;
		
	}
	
	
	@GetMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id) {
		loteService.remove(id);
		return new RedirectView(ViewRouteHelper.LOTE_ROOT);
	}
	
	
}
