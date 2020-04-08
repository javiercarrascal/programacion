package objetos.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean correcto=false;
		while(!correcto) {
			try {
				System.out.println("Introduce tu edad: ");
				int edad=sc.nextInt();
				if(edad<18) {
					throw new MenorDeEdadException();
				}else {
					correcto = true;
				}
			}catch(MenorDeEdadException e) {
					System.out.println(e.getMessage());
					
			}catch(InputMismatchException e) {
				System.out.println("Se espera un valor numerico");
				sc= new Scanner(System.in);
			}
		}
		

	}

}
