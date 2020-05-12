package com.unla.Grupo18.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.Grupo18.converters.SucursalConverter;
import com.unla.Grupo18.entities.Sucursal;
import com.unla.Grupo18.herlpers.ViewRouteHelper;
import com.unla.Grupo18.models.SucursalModel;
import com.unla.Grupo18.services.ISucursalService;

@Controller
@RequestMapping("/sucursal")
public class SucursalController {
	
	@Autowired
	
	private ISucursalService sucursalService;
	
	@GetMapping("")
	public ModelAndView index() {

		ModelAndView mAV = new ModelAndView(ViewRouteHelper.SUCURSAL_INDEX);
		mAV.addObject("sucursales", sucursalService.getAll());
		return mAV;
	}
	
	
	
	
	@GetMapping("/new")
	public ModelAndView create() {
		
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.SUCURSAL_NEW);
		mAV.addObject("sucursal", new Sucursal());		
		return mAV;
	}
	
	@GetMapping("/create")
	public RedirectView create(@ModelAttribute("sucursal") SucursalModel sucursal) {
		sucursalService.insertOrUpdate(sucursal);
		return new RedirectView(ViewRouteHelper.SUCURSAL_ROOT); 
	}
	
	@GetMapping("/{id}")
	public ModelAndView get(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.SUCURSAL_INFO);
		mAV.addObject("sucursal", sucursalService.findBysucursalesId(id));
		return mAV;
	}
	
	
	
	
	@GetMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.SUCURSAL_UPDATE);
		mAV.addObject("sucursal", sucursalService.findBysucursalesId(id));
		return mAV;
		
	}
	
	@GetMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id) {
		sucursalService.remove(id);
		return new RedirectView(ViewRouteHelper.SUCURSAL_ROOT);
	}
	
	
	/*@GetMapping("/distancia")
	public ModelAndView  distancia (@RequestParam(value="id")int id, @RequestParam(value= "id2") int id2) {
		
		System.out.println("___");
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.SUCURSAL_DISTANCIA);
		System.out.println("___");
		SucursalModel sucursal = sucursalService.findBysucursalesId(id);
		System.out.println("___");
		SucursalModel sucursal2 = sucursalService.findBysucursalesId(id2);
		System.out.println("___");
		double distancia = sucursalService.distnaciaSucursales(sucursal, sucursal2);
		System.out.println(distancia);
		mAV.addObject("distancia",distancia);
		return mAV;	
		
	}*/
	
	@GetMapping("/distancia")
	public ModelAndView  distancia1 (@RequestParam(value="id")int id) {
		
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.SUCURSAL_DISTANCIA);
		
		SucursalModel sucursal = sucursalService.findBysucursalesId(id);	
		
		double distancia = sucursalService.distancias(sucursal);		
		
		
		mAV.addObject("distancia",distancia);
		return mAV;	
		
	}


}