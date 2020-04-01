package ejercicios;
import java.util.Scanner;
public class Ejercicio49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int auxiliar;
		System.out.println("Introduce un numero: ");
		int numero=sc.nextInt();
		do {
			auxiliar=0;
			while(numero>0) {
				int cifra=numero%10;
				auxiliar+=cifra;
				numero=numero/10;
			}
			System.out.println(auxiliar);
			numero=auxiliar;
		}while (numero>10);

	}

}
