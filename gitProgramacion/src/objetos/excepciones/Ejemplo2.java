package objetos.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		/**
		 * Programa que pide al usuario un numero que tiene que estar entre el 10 y el 20
		 */
		Scanner sc= new Scanner(System.in);
		//La variable correcto ba a controlar si se repite la peticion de datos
		boolean correcto=false;
		while(!correcto) {
			System.out.println("Introduce un numero entre 10 y 20: ");
			//Dentro del try va lo que es susceptible de fallar
			try {
				//La siguiente linea "peta" si el usuario no mete un numero
				int numero=sc.nextInt();
				if(numero>=10 && numero<=20) {
					
					correcto=true;
				}else {
					System.out.println("El numero debe estar entre 10 y 20");
				}
			}catch(InputMismatchException nombreExcepcion) {
				System.out.println("Numero mal introducido");
				//Reinicio el escanner porque habra fallado
				sc=new Scanner(System.in);
			}catch(Exception e) {
				System.out.println("Se ha producido un error");
			}
		}
	}

}
