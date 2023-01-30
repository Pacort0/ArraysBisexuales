package ejercicios;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Creamos la tabla 10x10
		int tabla[][] = new int[10][10];
		
		//Recorremos la tabla mientras le damos valores
		for(int i=0; i<tabla.length; i++){
			for(int j=0; j<tabla[i].length; j++){
				tabla[i][j] = (i+1)*(j+1); //La 'j' son los valores por lo que se multiplica el valor estático 'i'
			}
			System.out.println(Arrays.toString(tabla[i])); //Imprimimos la tabla
		}
	}

}