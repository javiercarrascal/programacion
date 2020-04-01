package ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num, mayor, menor;
		System.out.println("Introduce un numero: ");
		num=sc.nextInt();
		mayor=num;
		menor=num;
		while(num!=0) {
			if(num>mayor) {
				mayor=num;
			}
			if(num<menor) {
				menor=num;
			}
			System.out.println("Introduce otro numero: ");
			num=sc.nextInt();
		}
		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);
	}

}
