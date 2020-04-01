package ejemplos;

import java.util.Scanner;

public class Caracteres {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char letra;
		System.out.println("Introduce un caracter: ");
		//PAra introducir un caracter pedimos una cadena y nos quedamos con la letra de la posicion 0
		letra= sc.nextLine().charAt(0);
		System.out.println("El caracter introducido es " + letra);
		if(letra == 'a') {
			System.out.println("Lo que sea.");
		}
		letra=99;
		System.out.println(letra);
		

	}

}
