package ejercicios;

import java.util.Scanner;
public class Ejercicio54 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char caracter;
		int contEspacios=0, contMayusculas=0, contMinusculas=0;
		System.out.println("Introduce un texto: ");
		String texto=sc.nextLine();
		for(int i=0;i<texto.length();i++) {
			caracter=texto.charAt(i);
			if(caracter==32) {
				contEspacios++;
			}
			if(caracter>=65 && caracter<=90) {
				contMayusculas++;
			}
			if(caracter>=97 && caracter<=122) {
				contMinusculas++;
			}
		}
		System.out.println("El texto tiene " + contEspacios + " espacios.");
		System.out.println("El texto tiene " + contMayusculas + " mayusculas.");
		System.out.println("El texto tiene " + contMinusculas + " minúsculas.");

	}

}




