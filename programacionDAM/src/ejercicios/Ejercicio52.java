package ejercicios;
import java.util.Scanner;
public class Ejercicio52 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		char signo=' ';
		int acumulador=0, numero=0;
		System.out.println("Introduce un numero: ");
		acumulador=sc.nextInt();
		do {
			System.out.println("Introduce un signo: ");
			signo=sc2.nextLine().charAt(0);
			if (signo!='=') {
				System.out.println("Introduce un numero: ");
				numero=sc.nextInt();
			}
			switch(signo) {
			case '+': acumulador+=numero; break;
			case '-':acumulador-=numero;break;
			}
			System.out.println("Valor actual: " + acumulador);
			
		}while (signo!='=');

	}

}










