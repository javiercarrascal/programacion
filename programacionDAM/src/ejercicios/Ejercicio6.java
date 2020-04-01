package ejercicios;
import java.util.Scanner;
public class Ejercicio6{
	public static void main(String[] args){
		//Creo la variable sc, la cual es un Scanner (para introducir datos)
		Scanner sc = new Scanner(System.in);
		double radio, area, perimetro;
		System.out.println("Introduce el radio de la circunferencia:");
		radio=sc.nextDouble();
		perimetro=Math.PI * 2 * radio;
		area=Math.PI * Math.pow(radio,2);
		
		System.out.println("El area de la circunferencia es: " + area);
		System.out.println("El perímetro de la circunferencia es: " + perimetro);
	}
}