package ejercicios;

import java.util.Arrays;

public class Ejercicio08 {

	public static void main(String[] args) {
		int matriz [][] = new int[5][5];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int)((Math.random() * (10 - 1)) + 1);
			}
			System.out.println(Arrays.toString(matriz[i]));
		}
		if(simetrico(matriz)) {
			System.out.println("La matriz es simétrica");
		}
		else{
			System.out.println("La matriz no es simétrica");
		}
	}

	public static Boolean simetrico(int[][] matriz) {
		Boolean simetria = true;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] != matriz[j][i]) {
					simetria = false;
					break;
				}
			}
		}
		return simetria;
	}
	
}
