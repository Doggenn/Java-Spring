package com.adrian.calculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.calculadora.service.AritmeticaService;

@RestController
public class AritmeticaController {
	
	AritmeticaService aritmeticaService = new AritmeticaService();
	
	@GetMapping("/test")
	public String test() {
		return "Hola mundo!";
	}
	
	@GetMapping("/suma")
	public Integer suma(@RequestParam(name="num1")Integer num1, @RequestParam(name="num2")Integer num2) {
		return aritmeticaService.suma(num1, num2);
	}
	
	@GetMapping("/resta")
	public Integer resta(@RequestParam(name="num1")Integer num1, @RequestParam(name="num2")Integer num2) {
		return aritmeticaService.resta(num1, num2);
	}
	
	@GetMapping("/mult")
	public Integer mult(@RequestParam(name="num1")Integer num1, @RequestParam(name="num2")Integer num2) {
		return aritmeticaService.mult(num1, num2);
	}
	
	@GetMapping("/div")
	public Integer div(@RequestParam(name="num1")Integer num1, @RequestParam(name="num2")Integer num2) {
		return aritmeticaService.div(num1, num2);
	}
	
	@GetMapping("/rest")
	public Integer rest(@RequestParam(name="num1")Integer num1, @RequestParam(name="num2")Integer num2) {
		return aritmeticaService.rest(num1, num2);
	}

}
