package ejercicios;

import java.util.Arrays;

public class Ejercicio06 {

	public static void main(String[] args) {
		int tabla[][] = new int[6][10];
		int max = 0;
		int min = 1000;
		String maximo = "";
		String minimo = "";
		
		for(int y=0; y<tabla.length; y++) {
			for(int x=0; x<tabla[y].length; x++) {
				tabla[y][x] = (int)(Math.random()*1001);
				if(tabla[y][x] > max) {
					max = tabla[y][x];
					maximo = ("El valor máximo se encuentra en la posición" + " [" + (y+1) + ", " + (x+1) + "] = " + max);
				}
				if(tabla[y][x] < min) {
					min = tabla[y][x];
					minimo = ("El valor mínimo se encuentra en la posición" + " [" + (y+1) + ", " + (x+1) + "] = " + min);
				}
			}
			System.out.println(Arrays.toString(tabla[y]));
		}
		System.out.println();
		System.out.println(maximo);
		System.out.println(minimo);
	}

}
