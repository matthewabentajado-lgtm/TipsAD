package com.trips.contrllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/categorias")
public class categoriaTripcontroller {
	
	@GetMapping("index")
	public String index() {
		return "categorias/ListarCategorias";
	}
	
	@GetMapping("/create")
	public String crear() {
		return "categorias/formCategoria";
		
	}
	
	@PostMapping("/save")
	public String guardar(@RequestParam("nombre") String nombre , @RequestParam("descripcion") String descripcion ) {
		
		System.out.println( nombre);
		System.out.println( descripcion);
		
		return "";
	}
}
