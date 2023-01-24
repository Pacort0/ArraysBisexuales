package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		int tamanio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un tamaño para las matrices NxN: ");
		tamanio = sc.nextInt();
		
		int matrizA [][] = new int[tamanio][tamanio];
		int matrizB [][] = new int[tamanio][tamanio];
		
		System.out.println("Matriz A: ");
		for(int i=0; i<matrizA.length; i++) {
			for(int j=0; j<matrizA[i].length; j++) {
				matrizA[i][j] = (int)(Math.random()*100);
			}
			System.out.println(Arrays.toString(matrizA[i]));
		}
		
		System.out.println("\nMatriz B: ");
		for(int i=0; i<matrizA.length; i++) {
			for(int j=0; j<matrizB[i].length; j++) {
				matrizB[i][j] = matrizA[j][i];
			}
			System.out.println(Arrays.toString(matrizB[i]));
		}
		sc.close();
	}
}
