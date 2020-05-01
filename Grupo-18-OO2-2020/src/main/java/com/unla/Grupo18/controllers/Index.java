package com.unla.Grupo18.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.Grupo18.herlpers.ViewRouteHelper;

@Controller 
@RequestMapping("/")
public class Index {
	
	@GetMapping("hola")
	public String holaMundo() {
		return ViewRouteHelper.INDEX;
		
	}

	
	
	
	
	
	
	
	

}
