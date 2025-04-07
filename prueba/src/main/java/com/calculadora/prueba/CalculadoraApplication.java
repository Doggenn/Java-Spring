package com.calculadora.prueba;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double valor1, valor2, total;
		
		SpringApplication.run(CalculadoraApplication.class, args);
		
		System.out.print("Inserta el primer valor: ");
		
		valor1 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Inserta el segundo valor: ");
		
		valor2 = entrada.nextDouble();
		entrada.nextLine();
		
		total = valor1 + valor2;
		
		System.out.print("El resultado de la suma de ");
		System.out.print(valor1);
		System.out.print(" y del ");
		System.out.print(valor2);
		System.out.print(" es de: ");
		System.out.print(total);
		System.out.print(".");
		
	}

}
