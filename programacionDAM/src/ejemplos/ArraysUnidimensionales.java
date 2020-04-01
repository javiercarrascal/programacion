package ejemplos;

import java.util.Scanner;

public class ArraysUnidimensionales {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//Para crear un array se le indica el numero de posiciones que va a tener
		int[] edades= new int[5];
		//el tamaño del array lo obtenemos con el .length
		int tamanio=edades.length;
		for(int i=0;i<tamanio;i++) {
			System.out.println("Introduce la edad " + (i+1) + ":");
			//Para acceder a una posicion del array se pone la posicion entre corchetes.
			edades[i]=sc.nextInt();
		}
		for(int i=0;i<tamanio;i++) {
			System.out.println("La edad " + (i+1) + " es: " + edades[i]);
		}
		
		
		

	}

}
