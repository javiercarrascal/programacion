package ejercicios;

import java.util.Arrays;

public class Ejercicio76 {

	public static void main(String[] args) {
		
		int[][] array = new int[10][10];
		int[] resultados = new int[10];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=(int)(Math.random()*10);
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				resultados[i]+=array[i][j];
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(Arrays.toString(array[i]) + " Suma:  " + resultados[i]);
		}
		int[][] aux = new int[10][10];
		int[] auxResultados = new int[10];
		for(int j=0;j<resultados.length;j++) {
			int min=Integer.MAX_VALUE;
			int posicion=0;
			for(int i=0;i<resultados.length;i++) {
				if(resultados[i]!=-1 && resultados[i]<min) {
					min=resultados[i];
					posicion=i;
				}
			}
			aux[j]=array[posicion];
			auxResultados[j]=resultados[posicion];
			resultados[posicion]=-1;
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(Arrays.toString(aux[i]) + " Suma: "+ auxResultados[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
