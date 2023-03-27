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
		/*devolver verdadero o falso en funcion de si el numero introducido 
		 * por parametro es primo o no */
		public static boolean primo (int num) {
			boolean primo=true;
			int divisor=2;
			if (primo && (divisor!=num)) {
				if (num%divisor==0) {
					primo=false;
				}else {
					divisor++;
				}
			}
			return primo;
			
			
			
			
			
		}
		
		
	
	
	
	

}
