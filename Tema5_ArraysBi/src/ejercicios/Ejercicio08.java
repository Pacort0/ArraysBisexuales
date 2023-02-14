package ejercicios;

import java.util.Arrays;

public class Ejercicio08 {

	public static void main(String[] args) {
		//Creamos la tabla 5x5
		int matriz [][] = new int[5][5];
		
		//Rellenamos la tabla con valores aleatorios
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int)((Math.random() * (10 - 1)) + 1);
			}
			System.out.println(Arrays.toString(matriz[i])); //Imprimimos la fila tras cada iteración
		}
		//Llamamos a la función 'simetrico' para determinar si la matriz es simétrica o no
		if(simetrico(matriz)) {
			System.out.println("La matriz es simétrica");
		}
		else{
			System.out.println("La matriz no es simétrica");
		}
	}
	
	//Función 'simetrico', recibe una tabla por parámetros y devuelve un booleano
	public static Boolean simetrico(int[][] matriz) {
		Boolean simetria = true; //Creamos la variable booleana inicializada a 'true'
		
		for(int i=0; i<matriz.length; i++) { //Recorremos la tabla
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] != matriz[j][i]) { //En cuanto un valor sea diferente al de su 'espejo', cerramos el bucle y devolvemos 'false'
					simetria = false;
					break;
				}
			}
		}
		return simetria;
	}
	
}
