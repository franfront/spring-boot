package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
	
	
	@GetMapping("/")
	public String index() {
	return "params/index";
	}
	
	
	@GetMapping("/string")
	public String param(@RequestParam(name="texto", required=false, defaultValue = "algun valor") String texto, Model model) {
		
		model.addAttribute("resultado", "El parametro enviado es: " + texto);
		
		return "params/ver";
	}
	
	@GetMapping("/mix-params")
	public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
		
		model.addAttribute("resultado", "El parametro enviado es: '" + saludo + "' y el numero es: " + numero);
		
		return "params/ver";
	}
	
	@GetMapping("/mix-params-request")
	public String param(HttpServletRequest request , Model model) {
		
		String saludo = request.getParameter("saludo");
		Integer numero = null;
		
		try {
		 numero = Integer.parseInt(request.getParameter(saludo));
		} catch(NumberFormatException e) {
			numero = 0;
		}
		
		
		model.addAttribute("resultado", "El parametro enviado es: '" + saludo + "' y el numero es: " + numero);
		
		return "params/ver";
	}
	

}
