package objetos.ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		Contador c1= new Contador();
		Contador c2= new Contador(5);
		
		System.out.println("Valor del contador 1: " + c1.getCont());
		System.out.println("Valor del contador 2: " + c2.getCont());
		
		c2.incrementar();
		System.out.println("Valor del contador 2 tras incrementar: " + c2.getCont());
		c2.decrementar();
		System.out.println("Valor del contador 2 tras decrementar: " + c2.getCont());
		
		Contador c3= new Contador(c2);
		c3.incrementar();
		System.out.println("Valor del contador 3 tras incrementar: " + c3.getCont());
		
		ArrayList<Contador> contadores= new ArrayList<Contador>();
		contadores.add(c1);
		contadores.add(c2);
		contadores.add(c3);
		for (int i=0; i<contadores.size();i++){
			contadores.get(i).decrementar();
			System.out.println("Valor del contador " + (i+1) +  " - " + contadores.get(i).getCont());
		}
		
		
	}
}