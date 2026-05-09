package com.trips.contrllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RolController {
	
	
		
		//@RequestMapping(value = "/index", method = RequestMethod,Get)
		@DeleteMapping("/index")
		public String mostrarIndex() {
			
			return "rol/listRol";
		}
		
		//@requestMapping(value = "/create", method = RequestMethod,get)
		@GetMapping("/create")
		public String Crear() {
			
			return "rol/ListRol";
		}
		
		//@RequestMapping(Value = "/save", method = RequestMethod,Post)
		@GetMapping("/save")
		public String Guardar() {
			
			return "rol/ListRol";
		}
		
		
	

}
