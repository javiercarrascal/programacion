package ejercicios;
import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1,num2,intervalo;
		System.out.println("Introduce el primer número: ");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=sc.nextInt();
		System.out.println("Introduce el intervalo: ");
		intervalo=sc.nextInt();
		if(num2<num1) {
			int aux=num1;
			num1=num2;
			num2=aux;
		}
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
