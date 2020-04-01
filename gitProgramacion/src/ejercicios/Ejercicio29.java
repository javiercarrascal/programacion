package ejercicios;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num, acumPositivos=0, acumNegativos=0;
		System.out.println("Introduce un numero: ");
		num=sc.nextInt();
		while(num!=0) {
			if(num<0) {
				acumNegativos+=num;
			}else {
				acumPositivos+=num;
			}
			System.out.println("Introduce otro numero: ");
			num=sc.nextInt();
		}
		System.out.println("Suma de positivos: " + acumPositivos);
		System.out.println("Suma de negativos: " + acumNegativos);
	}

}
