package ejemplos;
import java.util.Scanner;
//Las importaciones siempre van antes del nombre de la clase.
public class PedirDatos{
	public static void main(String[] args){
		//Para pedir datos al usuario necesito una variable de tipo Scanner.
		//En este caso la llamo "sc" pero podria llamarse de cualquier modo.
		Scanner sc= new Scanner(System.in);
		System.out.println("Por favor, introduce un número: ");
		//Guardo en la variable numero lo que el usuario introduzca por teclado.
		int numero= sc.nextInt();
		System.out.print("El numero introducido es: ");
		System.out.println(numero);
		
		
	
	}

}