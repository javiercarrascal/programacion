package ejercicios;

import java.util.Scanner;
public class Ejercicio53 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char caracter;
		do {
			System.out.println("Introduce un caracter: ");
			caracter=sc.nextLine().charAt(0);	
		}while(caracter<65 || (caracter > 90 && caracter<97) || caracter>122);
		
		if(caracter>=65 && caracter<=90) {
			System.out.println("Es una letra mayuscula.");
			caracter+=32;
			System.out.println("La misma lera en minuscula es: " + caracter);
		}else if(caracter>=97 && caracter<=122) {
			System.out.println("Es una letra minuscula.");
			caracter-=32;
			System.out.println("La misma lera en mayuscula es: " + caracter);
		}

	}

}
