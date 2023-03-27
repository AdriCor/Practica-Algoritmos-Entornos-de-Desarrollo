package com.entornos.AdrianCorrionero.algoritmos;
/*
 * Representa los siguientes metodos matematicos:
 * fibonacci, primo y factorial
 * @author Adrian Corrionero Castillo
 * */
public abstract class Algoritmos {
/*Calcula el numero fibonacci de forma iterativa
 * de un numero pasado por parametro
 **/
	public static int fibonacci(int num) {
		int actual=0, segundo=1, ultimo=0; 
		for (int i=0;i <=num;i++) {
			ultimo= actual;
			actual=segundo;
			segundo=segundo+ultimo;
		}
		return actual;
		
		
	}
	
	
	

}
