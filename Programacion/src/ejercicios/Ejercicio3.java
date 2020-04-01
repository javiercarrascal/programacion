package ejercicios;
import java.util.Scanner;
public class Ejercicio3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int coches, todoTerrenos, gasCoche, gasTodoTerreno;
		System.out.println("Introduce el numero de coches normales: ");
		coches=sc.nextInt();
		System.out.println("Introduce el numero de todo terrenos: ");
		todoTerrenos=sc.nextInt();
		System.out.println("Introduce la gasolina de un coche normal: ");
		gasCoche=sc.nextInt();
		System.out.println("Introduce la gasolina de un todo terreno: ");
		gasTodoTerreno=sc.nextInt();
		System.out.println("La gasolina total es: "
				+(coches*gasCoche+todoTerrenos*gasTodoTerreno));
		

	}
}