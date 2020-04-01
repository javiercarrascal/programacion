package ejercicios;
import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1,num2,intervalo;
		System.out.println("Introduce el primer número: ");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=sc.nextInt();
		while(num2<num1) {
			System.out.println("Numero incorrecto. Introduce el segundo número: ");
			num2=sc.nextInt();
		}
		System.out.println("Introduce el intervalo: ");
		intervalo=sc.nextInt();
		int i=num1;
		while(i<=num2) {
			System.out.print(i);
			i=i+intervalo;
			if(i<num2) {
				System.out.print(", ");
			}
		}
		

	}

}
