package ejercicios;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		int tabla[][] = new int[10][10];
		
		for(int i=0; i<tabla.length; i++){
			for(int j=0; j<tabla[i].length; j++){
				tabla[i][j] = (i+1)*(j+1); 
			}
			System.out.println(Arrays.toString(tabla[i]));
		}
	}

}
