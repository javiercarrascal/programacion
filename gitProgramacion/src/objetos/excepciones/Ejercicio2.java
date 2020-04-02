package objetos.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] array = new int[10];
		for(int i=0;i<8;i++) {
			array[i]=(int)(Math.random()*10);
		}
		System.out.print("LISTA 1: [");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			if(i!=array.length-1) {
				System.out.print("|");
			}
		}
		System.out.println("]");
		for(int i=0;i<2;i++) {
			boolean correcto=false;
			//Saco fuera del while las variables para que sigan "existiendo" despues
			int numero=0, posicion=0;
			while(!correcto) {
				try {
					System.out.println("Introduce un numero: ");
					numero=sc.nextInt();
					System.out.println("Introduce la posicion en la que lo quieres insertar: ");
					posicion=sc.nextInt();
					correcto=true;
				}catch(InputMismatchException e) {
					System.out.println("Debe introducir un valor numerico.");
					sc= new Scanner(System.in);
				}
			}
			try {
				for(int j=array.length-1;j>posicion;j--) {
						array[j]=array[j-1];			
				}
				array[posicion]=numero;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Posición del array no válida");
				//Para que vuelva a hacer otra vez la peticion en caso de fallo
				i--;
			}
		}
		System.out.print("LISTA 1: [");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			if(i!=array.length-1) {
				System.out.print("|");
			}
		}
		System.out.println("]");
		

	}

}
