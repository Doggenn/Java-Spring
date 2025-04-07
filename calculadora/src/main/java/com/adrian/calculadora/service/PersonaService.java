package com.adrian.calculadora.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adrian.calculadora.domain.Persona;
import com.adrian.calculadora.repository.PersonaRepository;

@Service
public class PersonaService {

	
	private final PersonaRepository personaRepository;
	
	public PersonaService(PersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}
	
	public List<Persona> getAllPersona(){
		
		return personaRepository.findAll();
		
	}
	
	public List<Persona> findByNombre(String nombre){
		
		return personaRepository.findByNombreContainsIgnoreCase(nombre);
		
	}
	
	public List<Persona> findByNombreAndApellidos(String nombre, String apellidos){
		
		return personaRepository.findByNombreContainsIgnoreCaseAndApellidosContainsIgnoreCase(nombre, apellidos);
		
	}
	
	public Optional<Persona> getById(Integer id) {
		return personaRepository.findById(id);
	}
	
}
