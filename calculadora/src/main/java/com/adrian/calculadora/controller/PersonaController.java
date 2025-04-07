package com.adrian.calculadora.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.calculadora.domain.Persona;
import com.adrian.calculadora.service.PersonaService;

@RestController
public class PersonaController {

	@Autowired
	PersonaService personaService;
	
	@GetMapping("/getPersona")
	public Optional<Persona> getId(Integer id){
		
		Optional<Persona> persona = personaService.getById(id);
		
		return persona;
	}
	
	@GetMapping("/getAllPersona")
	public List<Persona> getAllPersona(){
		
		
		return personaService.getAllPersona();
	}
	
	@GetMapping("/findByNombre")
	public List<Persona> findByPersona(String nombre){
		
		return personaService.findByNombre(nombre);
		
	}
	
	@GetMapping("/findByNombreAndApellidos")
	public List<Persona> findByPersona(String nombre, String apellidos){
		
		return personaService.findByNombreAndApellidos(nombre, apellidos);
		
	}

}
