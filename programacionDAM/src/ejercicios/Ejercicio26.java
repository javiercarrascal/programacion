package ejercicios;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero=sc.nextInt();
		int i=1;
		while(i<=numero) {
			System.out.print("*");
			i++;
		}

	}

}
