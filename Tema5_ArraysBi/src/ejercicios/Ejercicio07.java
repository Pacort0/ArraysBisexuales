package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		int tamanio;
		int aux;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un tamaño para las matrices NxN: ");
		tamanio = sc.nextInt();
		
		int matrizA [][] = new int[tamanio][tamanio];
		
		System.out.println("Matriz A: ");
		for(int i=0; i<matrizA.length; i++) {
			for(int j=0; j<matrizA[i].length; j++) {
				matrizA[i][j] = (int)(Math.random()*100);
			}
			System.out.println(Arrays.toString(matrizA[i]));
		}
		
		System.out.println("\nMatriz traspuesta de A: ");
		for(int i=0; i<matrizA.length; i++) {
			for(int j=0; j<=i; j++) {
				aux = matrizA[i][j];
				matrizA[i][j] = matrizA[j][i];
				matrizA[j][i] = aux;
			}
		}
		for(int i=0; i<matrizA.length; i++) {
			System.out.println(Arrays.toString(matrizA[i]));
		}
		sc.close();
	}
}
