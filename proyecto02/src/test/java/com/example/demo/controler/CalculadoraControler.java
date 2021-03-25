package com.example.demo.controler;
import com.example.demo.model.*;

public class CalculadoraControler {
	public void resolverSuma() {
		int a;
		int b;
		a=10;
		b=20;

		Calculadora nuevaCalculadora= new Calculadora ();
		nuevaCalculadora.setA(a);
		nuevaCalculadora.setB(b);

		System.out.println("El resultado de la suma es:" + nuevaCalculadora.sumarDosNumeros());


	}
}
