package com.trips.contrllers;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	
	@GetMapping("/listadi")
	public String mostrarLista(Model model) {
		List<String> lista = (List<String>) new LinkedHashSet<String>();
		lista.add("en la montaña");
		lista.add("en la ciudad");
		return null;
		
		
	}
	
	@GetMapping
	public String mostrarhome (Model model) {
		model.addAttribute("mensaje", "bienvenidos a la apliaccion"); //mensaje uno
		model.addAttribute("mensaje2", "Categoria de producto");	 //mensaje dos
		model.addAttribute("fecha" , new Date(0));					//retornado un objeto
		
		return "home";
		
	}
	
	
	@GetMapping
	public String mostrarhome() {
	
		return "home";
	}
	
	@GetMapping("/")
	public String mostrarHomre(Model model) {
		
		String Trip = "Rapel en el volcan";
		Date fechapublicacion = new Date(0);
		double Costo = 5.0;
		boolean vigente = true;
		
		model.addAttribute("Trip", Trip);
		model.addAttribute("fechapublicacion", fechapublicacion);
		model.addAttribute("Costo", Costo);
		model.addAttribute("vigente", vigente);
		model.addAttribute("mensaje","hola mundo");
		return "home";
		
	}

}
