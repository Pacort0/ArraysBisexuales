package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int tabla[][] = new int[4][5];
		int minima;
		int maxima;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<tabla.length; i++) {
			for(int j=0; j<tabla[i].length; j++) { 
				System.out.print("Introduzca la " + (j+1) + "º nota para el Alumno " + (i+1) + ": ");
				tabla[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Las notas de los alumnos son:");
		for(int k=0; k<tabla.length; k++) {
			System.out.println("Alumno " + (k+1) + ":" + Arrays.toString(tabla[k]));
		}
		
		for(int l=0; l<tabla.length; l++) {
			minima = 10;
			maxima = 0;
			media = 0;
			System.out.println();
			for(int m=0; m<tabla[l].length; m++) {
				if(tabla[l][m] <= minima) {
					minima = tabla[l][m];
				}
				if(tabla[l][m] >= maxima) {
					maxima = tabla[l][m];
				}
				media += tabla[l][m];
			}
			media /= 5;
			System.out.println("La nota mínima del Alumno " + (l+1) + " es:" + minima);
			System.out.println("La nota mínima del Alumno " + (l+1) + " es:" + maxima);
			System.out.println("La nota media del Alumno " + (l+1) + " es: " + media);
		}
		sc.close();
	} 
	
}