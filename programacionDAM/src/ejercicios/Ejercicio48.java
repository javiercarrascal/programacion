package ejercicios;
import java.util.Scanner;
public class Ejercicio48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador;
		do {
			System.out.println("Introduce un numero: ");
			int numero=sc.nextInt();
			contador=0;
			while(numero!=0) {
				numero=numero/10;
				contador++;
			}
			System.out.println("El numero tiene " + contador + " cifras.");
		}while (contador!=4);

	}

}
