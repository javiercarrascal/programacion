package ejercicios;

import java.util.Scanner;

public class Ejercicio44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print("*");
			}
			System.out.println();
			for(int j=0;j<num;j++) {
				System.out.print("_");
			}
			System.out.println();
		
		}
	}

}
