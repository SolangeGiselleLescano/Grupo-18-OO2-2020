package com.example.TPCGrupo18.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import herlpers.ViewRouterHelper;

@Controller 
@RequestMapping("/")
public class Index {
	
	@GetMapping("hola")
	public String holaMundo() {
		return ViewRouterHelper.INDEX;
		
	}

	
	
	
	
	
	
	
	

}
