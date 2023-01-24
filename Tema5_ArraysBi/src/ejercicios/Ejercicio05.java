package ejercicios;

import java.util.Arrays;

public class Ejercicio05 {

	public static void main(String[] args) {
		int tabla[][] = new int [4][5];
		int suma;
		int sumaTotal = 0;
		int fila1 = 0, fila2 = 0, fila3 = 0, fila4 = 0, fila5 = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			suma = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (int)((Math.random() * (999 - 100)) + 100);
				suma += tabla[i][j];
				sumaTotal += tabla[i][j];
				
				if(j == 0) {
					fila1 += tabla[i][j];
				}
				else if(j == 1) {
					fila2 += tabla[i][j];
				}
				else if(j == 2) {
					fila3 += tabla[i][j];
				}
				else if(j == 3) {
					fila4 += tabla[i][j];
				}
				else if(j == 4) {
					fila5 += tabla[i][j];
				}
			}
			System.out.print(Arrays.toString(tabla[i]));
			System.out.println(suma);
		}
		sumaTotal += fila1+fila2+fila3+fila4+fila5;
		System.out.print(fila1 + ",");
		System.out.print(fila2 + ",");
		System.out.print(fila3 + ",");
		System.out.print(fila4 + ",");
		System.out.print(fila5 + ",");
		System.out.print(sumaTotal);
	}
}
