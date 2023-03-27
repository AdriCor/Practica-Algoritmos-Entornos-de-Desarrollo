package com.entornos.AdrianCorrionero.algoritmos;

public class Principal {
	public static void main(String[] args) {
		//declaro el array
		int[] numeros =new int [5];
		//relleno el array con numeros aleatorios entre 1 y 20
		for (int i=0;i<numeros.length;i++) {
			numeros[i]= ((int)(Math.random()*20)+1);
		}
		//declaro el segundo array
		int[]ResultadoFibonacci=new int[numeros.length];
		//relleno el array con el calculo del fibonacci de los numeros
		for (int i=0;i<numeros.length;i++) {
			ResultadoFibonacci[i]= Algoritmos.fibonacci(numeros[i]);
		}
		//declaro el tercer array
		long []ResultadoFactorial=new long[numeros.length];
		//relleno el array con el calculo del factorial de los numeros
		for (int i=0;i<numeros.length;i++) {
		ResultadoFactorial[i]= Algoritmos.factorial(numeros[i]);
		}
		//declaro el cuarto array
		boolean[]ResultadoPrimo=new boolean[numeros.length];
		//relleno el array con el indicador de si es primo o no
		for (int i=0;i<numeros.length;i++) {
		ResultadoPrimo[i]= Algoritmos.primo(numeros[i]);
		}
		
		
		
		
		
	}
}
