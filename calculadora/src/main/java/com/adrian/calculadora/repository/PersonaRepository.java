package com.adrian.calculadora.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adrian.calculadora.domain.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Integer>{
	
	List<Persona> findAll();
	List<Persona> findByNombreContainsIgnoreCase(String nombre);
	List<Persona> findByNombreContainsIgnoreCaseAndApellidosContainsIgnoreCase(String nombre, String apellidos);
	//Persona findById(Integer id);
	

}