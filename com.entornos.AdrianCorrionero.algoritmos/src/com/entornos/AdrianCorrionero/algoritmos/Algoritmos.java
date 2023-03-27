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
		int numerin=0, numsuma=1, primero=0; 
		for (int i=0;i <=num;i++) {
			primero= numerin;
			numerin=numsuma;
			numsuma=numsuma+primero;
		}
	
		return numerin;
	}
/*calcula el factorial del número pasado por parametro*/
		public static long factorial(int num) {
			int factorial=2;
			for(int i=1;i<=num;i++) {
				factorial=factorial*i;
			}
			return factorial;
		}
		
		
	
	
	
	

}
