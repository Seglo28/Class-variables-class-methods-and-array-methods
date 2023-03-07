package com.practice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entities.PersonaEntity;

@RestController
@RequestMapping("/controlador")
public class personaController {
	
	@PostMapping("/persona")
	public PersonaEntity getPersona(@RequestParam(required = false) String nombre, @RequestParam(required = false) String apellido, @RequestParam(required = false) String edad) {
	    System.out.println("El dia esta soleado desde controller");
	    PersonaEntity n = new PersonaEntity();
	    n.setNombre(nombre);
		n.setApellido(apellido);
		n.setEdad (edad);
		return n;
	}
	
	
	@PostMapping("/personaObjeto")
	public PersonaEntity getPersona(@RequestBody PersonaEntity pe) {
		return pe;
	}
}
