package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Creamos la tabla 4x5
		int tabla[][] = new int[4][5];
		int num = 0; //Variable donde guardar las notas que se introduzcan
		int minima; //Variable para guardar la nota mínima
		int maxima; //Variable para guardar la nota máxima
		double media; //Variable para guardar la media
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<tabla.length; i++) { //Recorremos la tabla pidiendo las notas de los alumnos
			for(int j=0; j<tabla[i].length; j++) { 
				do { //Se pide al menos una vez
				System.out.print("Introduzca la " + (j+1) + "º nota para el Alumno " + (i+1) + ": ");
				num = sc.nextInt();
				}while(num<0 || num>10); //Si la nota se encuentra fuera de rango, se vuelve a pedir
				tabla[i][j] = num; //Si es válida, se guarda
			}
		}
		
		System.out.println(); //Espacio (por estética)
		System.out.println("Las notas de los alumnos son:"); //Imprimimos las notas de los alumnos por columnas
		for(int k=0; k<tabla.length; k++) {
			System.out.println("Alumno " + (k+1) + ":" + Arrays.toString(tabla[k]));
		}
		
		//Para calcular máximas y mínimas
		for(int l=0; l<tabla.length; l++) {
			//Damos un valor inicial a todas las variables cada vez que se reinicie el bucle
			minima = 10;
			maxima = 0;
			media = 0;
			System.out.println();
			//Calculamos la nota mínima
			for(int m=0; m<tabla[l].length; m++) {
				if(tabla[l][m] <= minima) {
					minima = tabla[l][m];
				}
				//Calculamos la nota máxima
				if(tabla[l][m] >= maxima) {
					maxima = tabla[l][m];
				}
				//Sumamos todas las notas individuales de cada alumno
				media += tabla[l][m];
			}
			media /= 5; //Hacemos la media de las notas de cada alumno
			//Imprimimos los datos finales de cada alumno
			System.out.println("La nota mínima del Alumno " + (l+1) + " es:" + minima);
			System.out.println("La nota mínima del Alumno " + (l+1) + " es:" + maxima);
			System.out.println("La nota media del Alumno " + (l+1) + " es: " + media);
		}
		sc.close();
	} 
	
}