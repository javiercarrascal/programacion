package objetos.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean correcto=false;
		while(!correcto) {
			System.out.println("Introduce un numero entre 10 y 20: ");
			try {
				int numero=sc.nextInt();
				if(numero>=10 && numero<=20) {
					correcto=true;
				}else {
					System.out.println("El numero debe estar entre 10 y 20");
				}
			}catch(InputMismatchException nombreExcepcion) {
				System.out.println("Numero mal introducido");
				sc=new Scanner(System.in);
				
			}catch(Exception e) {
				System.out.println("Error generico ");
			}
		}
	}

}
