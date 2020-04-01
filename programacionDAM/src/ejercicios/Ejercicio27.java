package ejercicios;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero=sc.nextInt();
		int i=1;
		while(i<=numero) {
			if(i % 2==0) {
				System.out.print("*");
			}else {
				System.out.print("  ");
			}
			i++;
		}

	}

}
