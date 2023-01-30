package ejercicios;

import java.util.Arrays;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Creamos constantes para dar tamaño a la tabla
		final int FILAS = 4;
		final int COLUMNAS = 5;
		//Creamos la tabla filas(4) x columnas(5)
		int tabla[][] = new int [FILAS][COLUMNAS];
		int sumasHorizontal = 0; //Variable para guardar la suma de las filas horizontales
		int sumasVertical = 0; //Variable para guardar la suma de las filas verticales
		int suma; //Variable para guardar la suma de cada elemento de cada fila
		
		for (int i = 0; i < FILAS; i++) {
			suma=0; //Reiniciamos la variable de la suma tras cada iteración
			for (int j = 0; j < COLUMNAS; j++) {
				tabla[i][j] = (int)((Math.random() * (999 - 100)) + 100); //Damos a cada elemento un valor aleatorio
				suma += tabla[i][j]; //Añadimos el valor a la suma de la fila
			}
			sumasHorizontal += suma; //Añadimos el valor de esta fila a la suma de todas las filas
			System.out.print(Arrays.toString(tabla[i])); 
			System.out.println(suma); //Imprimimos la fila seguida de la suma de sus valores
		}
		//Recorremos la tabla por columnas
		for (int i = 0; i < COLUMNAS; i++) {
			suma=0; //Reiniciamos el valor de la suma tras cada vuelta
			for (int j = 0; j < FILAS; j++) {
				suma += tabla[j][i]; //Añadimos el valor a la suma de la columna
			}
			sumasVertical += suma; //Añadimos el valor de la suma de esta columna a la suma de todas las columnas
			System.out.print(suma + " "); //Imprimimos el valor debajo de su columna
		}
		//Mostramos en la esquina inferior derecha el valor de la suma de todas las filas y columnas
		System.out.print(sumasVertical + sumasHorizontal); 
	}
}
