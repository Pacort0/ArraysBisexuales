package ejercicios;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Creamos la tabla 3x6
		int tabla[][] = new int[3][6];
		
		//Rellenamos la tabla manualmente
		tabla[0][0] = 0;
		tabla[0][1] = 30;
		tabla[0][2] = 2;
		tabla[0][5] = 5;
		tabla[1][0] = 75;
		tabla[1][4] = 0;
		tabla[2][2] = -2;
		tabla[2][3] = 9;
		tabla[2][5] = 11;
		
		//Imprimimos la tabla por columnas
		for(int i=0; i<tabla.length; i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}
	}
}
