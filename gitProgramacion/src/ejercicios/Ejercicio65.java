package ejercicios;
import java.util.Scanner;
public class Ejercicio65 {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean creciente=true, decreciente=true;
		int[] lista= new int[10];
		for(int i=0;i<lista.length;i++) {
			System.out.println("Introduce el numero " + (i+1) +" de la lista 1:");
			lista[i]=sc.nextInt();
		}
		for(int i=0;i<lista.length-1;i++) {
			if(lista[i]>lista[i+1]) {
				creciente=false;
			}
			if(lista[i]<lista[i+1]) {
				decreciente=false;
			}
		}
		if(creciente && !decreciente) {
			System.out.println("La lista es creciente.");
		}
		if(!creciente && decreciente) {
			System.out.println("La lista es decreciente.");
		}
		if(!creciente && !decreciente) {
			System.out.println("La lista está desordenada.");
		}
		
		
		
		
	
	}
	
	
	

}












