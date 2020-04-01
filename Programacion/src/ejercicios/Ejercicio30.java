package ejercicios;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		boolean primo=true;
		System.out.println("Introduce un numero: ");
		num=sc.nextInt();
		int i=2;
		while(i<num) {
			if(num%i==0) {
				primo=false;
			}
			i++;
		}
		if(primo==true) {
			System.out.println("El numero " + num + " es primo.");
		}else {
			System.out.println("El numero " + num + " no es primo.");
		}
	}

}





