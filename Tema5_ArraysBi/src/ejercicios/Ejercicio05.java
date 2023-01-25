package ejercicios;

import java.util.Arrays;

public class Ejercicio05 {

	public static void main(String[] args) {
		final int FILAS = 4;
		final int COLUMNAS = 5;
		int tabla[][] = new int [FILAS][COLUMNAS];
		int sumaHorizontal = 0;
		int sumaVertical = 0;
		int suma;
		
		for (int i = 0; i < FILAS; i++) {
			suma=0;
			for (int j = 0; j < COLUMNAS; j++) {
				tabla[i][j] = (int)((Math.random() * (999 - 100)) + 100);
				suma += tabla[i][j];
			}
			sumaHorizontal += suma;
			System.out.print(Arrays.toString(tabla[i]));
			System.out.println(suma);
		}
		
		for (int i = 0; i < COLUMNAS; i++) {
			suma=0;
			for (int j = 0; j < FILAS; j++) {
				suma += tabla[j][i];
			}
			sumaVertical += suma;
			System.out.print(suma + " ");
		}
		System.out.print(sumaVertical + sumaHorizontal);
	}
}
