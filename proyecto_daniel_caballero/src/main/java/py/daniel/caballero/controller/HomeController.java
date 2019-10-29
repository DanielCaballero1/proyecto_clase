package py.daniel.caballero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Funcionar similar a una Servlet
@Controller
public class HomeController {
	
	//Similar al UrlPatern
	//que permite enlazar una url con una pagina o respuesta
	@RequestMapping("/") //req
	public String index() {
		
		System.out.println("Cargando página de bienvenida");
		
		return "view/nombre_pagina"; //resp
	}
	
	@RequestMapping("/menu")
	public String menu() {
		
		System.out.println("Cargando el menú");
		return "view/templates/menu";
		
	}
	
	
	
	
} 
