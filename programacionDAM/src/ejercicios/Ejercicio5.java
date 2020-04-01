package ejercicios;
import java.util.Scanner;

public class Ejercicio5{
	public static void main(String[] args){
		//Creo la variable sc, la cual es un Scanner (para introducir datos)
		Scanner sc = new Scanner(System.in);
		double rojas, amarillas, azules, puntuacion;
		System.out.println("Introduce el numero de fichas rojas:");
		rojas=sc.nextInt();
		
		System.out.println("Introduce el numero de fichas azules:");
		azules=sc.nextInt();
		
		System.out.println("Introduce el numero de fichas amarillas:");
		amarillas=sc.nextInt();

		puntuacion=Math.pow(rojas,3)+(azules*2)- Math.pow(amarillas,2);
		
		System.out.println("La puntuacion total es: " + puntuacion);
	
	}
}