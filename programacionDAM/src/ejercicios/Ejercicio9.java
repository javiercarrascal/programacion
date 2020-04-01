package ejercicios;
import java.util.Scanner;
public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a, b, c, aux;
		System.out.println("Introduce un numero: ");
		a=sc.nextInt();
		System.out.println("Introduce otro numero: ");
		b=sc.nextInt();
		System.out.println("Introduce otro numero: ");
		c=sc.nextInt();
		if(a>b) {
			//Guardo el valor de a en la variable aux
			aux=a;
			//Guardo el valor de b en la variable a
			a=b;
			//guardo el valor de aux (el valor original de a) en b
			b=aux;
		}
		if(b>c) {
			aux=b; b=c; c=aux;
		}
		if(a>b) {
			aux=a; a=b; b=aux;
		}
		System.out.println("Numeros ordenados: " + a + ", " + b + ", " + c);

	}

}







