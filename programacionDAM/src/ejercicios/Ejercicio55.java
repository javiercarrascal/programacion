package ejercicios;

import java.util.Scanner;
public class Ejercicio55 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int linea=1;
		System.out.println("Introduce un texto: ");
		String texto=sc.nextLine();
		System.out.print(linea + ":");
		for(int i=0;i<texto.length();i++) {
			if(texto.charAt(i)!=' ') {
				System.out.print(texto.charAt(i));
			}else {
				System.out.println();
				linea++;
				System.out.print(linea + ":");
			}
		}
		


	}

}




