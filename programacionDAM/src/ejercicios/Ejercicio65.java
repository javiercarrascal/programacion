package ejercicios;
import java.util.Scanner;
public class Ejercicio65 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] lista1 = new int[5];
		boolean creciente= true, decreciente=true;
		for(int i=0;i<lista1.length;i++) {
			System.out.println("Introduce el numero " + (i+1) +" de la lista:");
			lista1[i]=sc.nextInt();
		}
		for(int i=0;i<lista1.length-1;i++) {
			if(lista1[i]>lista1[i+1]) {
				creciente=false;
			}
			if(lista1[i]<lista1[i+1]) {
				decreciente=false;
			}
		}
		if(creciente && !decreciente) {
			System.out.println("La lista es creciente.");
		}
		if(!creciente&&decreciente) {
			System.out.println("La lista es decreciente.");
		}
		if(!creciente && !decreciente) {
			System.out.println("La lista está desordenada.");
		}
		if(creciente && decreciente) {
			System.out.println("Todos los numeros de la lista son iguales.");
		}
		
	
	}
	
	
	

}












