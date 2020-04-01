package ejercicios;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero=sc.nextInt();
		int i=1;
		boolean par;
		if(numero % 2==0) {
			par=true;
		}else {
			par=false;
		}
		while(i<=numero) {
			if(par==true){
				if(i % 2==0) {
					System.out.print("*");
				}else {
					System.out.print("  ");
				}
			}else {
				if(i % 2!=0) {
					System.out.print("*");
				}else {
					System.out.print("  ");
				}
			}
			i++;
		}

	}

}







