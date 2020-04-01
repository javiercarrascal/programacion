package ejercicios;
import java.util.Scanner;
public class Ejercicio1{
	public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			int num1, num2, num3;
			System.out.println("Por favor, introduce un numero: ");
			num1= sc.nextInt();
			System.out.println("Por favor, introduce otro numero: ");
			num2=sc.nextInt();
			num3= num1+num2;
			//Para concatenar cadenas de texto se usa el +
			System.out.println("La suma de " + num1 + " + " + num2 + " es: " + num3);
			//Para hacer una suma que se muestre por pantalla habría que usar parentesis
			System.out.println("La suma de " + num1 + " + " + num2 + " es: " + (num1+num2));   
	}
}









