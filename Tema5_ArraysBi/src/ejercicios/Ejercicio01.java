package ejercicios;

import java.util.Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Creamos la tabla 5x5
		int tabla[][] = new int [5][5];
		
		//Recorremos la tabla a medida que le damos valores
		for(int i=0; i<tabla.length; i++) {
			for(int j=0; j<tabla[i].length; j++) {
				tabla[i][j] = 10*(j+i);
			}
			System.out.println(Arrays.toString(tabla[i])); //Imprimimos la tabla por filas
		}
	}

}
