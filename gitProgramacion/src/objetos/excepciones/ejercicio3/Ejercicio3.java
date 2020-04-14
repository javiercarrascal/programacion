package objetos.excepciones.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		char caracter;
		boolean correcto=false;
		do {
			System.out.println("Introduce un caracter válido: ");
			caracter=sc.nextLine().charAt(0);	
			if(caracter<65 || (caracter > 90 && caracter<97) || caracter>122) {
				//Casos en los que el caracter es incorrecto
				try {
					throw new NotAValidCharacterException();
					
				}catch(NotAValidCharacterException e) {
					
					System.out.println(e.getMessage());
				}
			}else{
				correcto=true;
			}
			
		}while(!correcto);
		
		if(caracter>=65 && caracter<=90) {
			System.out.println("Es una letra mayuscula.");
			caracter+=32;
			System.out.println("La misma lera en minuscula es: " + caracter);
		}else if(caracter>=97 && caracter<=122) {
			System.out.println("Es una letra minuscula.");
			caracter-=32;
			System.out.println("La misma lera en mayuscula es: " + caracter);
		}

	}
}
