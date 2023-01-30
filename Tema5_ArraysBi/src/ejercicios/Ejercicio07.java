package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		int tamanio; //Variable para guardar el tamaño de la tabla introducido
		int aux; //Variable auxiliar 
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el valor de la tabla y lo guardamos
		System.out.println("Introduzca un tamaño para las matrices NxN: "); 
		tamanio = sc.nextInt();
		
		//Creamos la tabla cuadrado
		int matrizA [][] = new int[tamanio][tamanio];
		
		//Mostramos una primera matriz original rellenada aleatoriamente
		System.out.println("Matriz A: ");
		for(int i=0; i<matrizA.length; i++) {
			for(int j=0; j<matrizA[i].length; j++) {
				matrizA[i][j] = (int)(Math.random()*100);
			}
			System.out.println(Arrays.toString(matrizA[i]));
		}
		
		System.out.println("\nMatriz traspuesta de A: ");
		//Recorremos la matriz
		for(int i=0; i<matrizA.length; i++) {
			for(int j=0; j<=i; j++) {
				aux = matrizA[i][j]; //Guardamos el valor de (0,1) en la variable auxiliar
				matrizA[i][j] = matrizA[j][i]; //Copiamos el valor de (1,0) en la posición (0,1)
				matrizA[j][i] = aux; //Pegamos el valor de (0,1) en la posición (1,0)
			}
		}
		//Mostramos la tabla final
		for(int i=0; i<matrizA.length; i++) {
			System.out.println(Arrays.toString(matrizA[i]));
		}
		sc.close();
	}
}
