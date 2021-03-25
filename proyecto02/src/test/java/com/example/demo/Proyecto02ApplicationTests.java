package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controler.*;
import com.example.demo.model.*;
@SuppressWarnings("unused")
@SpringBootApplication

 
public class Proyecto02ApplicationTests {
	public static void main(String[] args){
		SpringApplication.run(Proyecto02ApplicationTests.class, args);

		CalculadoraControler nuevoControlador = new CalculadoraControler();
		nuevoControlador.resolverSuma();
	}

	
}