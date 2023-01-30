package ejercicios;

import java.util.Arrays;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Creamos la tabla 6x10
		int tabla[][] = new int[6][10];
		int max = 0; //Variable para guardar el valor máximo
		int min = 1000; //Variable para guardar el valor mínimo
		String maximo = ""; //Variable para imprimir el resultado
		String minimo = ""; //Variable para imprimir el resultado 
		
		//Recorremos la tabla dándole valores aleatorios
		for(int y=0; y<tabla.length; y++) {
			for(int x=0; x<tabla[y].length; x++) {
				tabla[y][x] = (int)(Math.random()*1001);
				//A medida que se asignan los valores aleatorios se van comparando para determinar el máximo y el mínimo
				if(tabla[y][x] > max) {
					max = tabla[y][x];
					maximo = ("El valor máximo se encuentra en la posición" + " [" + (y+1) + ", " + (x+1) + "] = " + max);
				}
				if(tabla[y][x] < min) {
					min = tabla[y][x];
					minimo = ("El valor mínimo se encuentra en la posición" + " [" + (y+1) + ", " + (x+1) + "] = " + min);
				}
			}
			//Mostramos la tabla por filas
			System.out.println(Arrays.toString(tabla[y]));
		}
		//Imprimimos el resultado final
		System.out.println();
		System.out.println(maximo);
		System.out.println(minimo);
	}

}
