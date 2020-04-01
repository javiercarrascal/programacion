package objetos.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

public static void main(String[] args) {
		
		Libro libro1=new Libro();
		Libro libro2=new Libro();
		Libro libro3=new Libro();
		//Para acceder a los atrib o a los metodos de una clase se utiliza el punto "."
		libro1.setTitulo("La Casa De La Pradera");
		libro1.setAutor("Chiquito De La Calzada");
		libro1.setEjemplares(10);
		libro1.setPrestados(9);
		libro2.setTitulo("El Ultimo Mohicano   ");
		libro2.setAutor("Kiko Rivera           ");
		libro2.setEjemplares(5);
		libro2.setPrestados(4);
		System.out.print(libro1);
		System.out.println();
		System.out.print(libro2);
		System.out.println();
		System.out.println("Intento alquilar el libro 1");
		if(libro1.prestamo()) {
			System.out.println("Se ha hecho el prestamo del libro 1");
		}else {
			System.out.println("No se ha hecho el prestamo del libro 1");
		}
		System.out.println("El libro " + libro1.getTitulo() + " tiene prestados " + libro1.getPrestados());
		
		System.out.println("Intento alquilar el libro 1");
		if(libro1.prestamo()) {
			System.out.println("Se ha hecho el prestamo del libro 1");
		}else {
			System.out.println("No se ha hecho el prestamo del libro 1");
		}
		System.out.println("El libro " + libro1.getTitulo() + " tiene prestados " + libro1.getPrestados());
		System.out.println("Devuelvo el libro1");
		if(libro1.devolucion()) {
			System.out.println("Se ha hecho la devolucion del libro 1");
		}else {
			System.out.println("No se ha hecho la devolucion del libro 1");
		}
		
		libro1.setPrestados(0);
		System.out.println("He puesto a 0 el numero de ejemplares prestados de libro1");
		System.out.println("El libro " + libro1.getTitulo() + " tiene prestados " + libro1.getPrestados());
		System.out.println("intento devolver el libro 1");
		if(libro1.devolucion()) {
			System.out.println("Se ha hecho la devolucion del libro 1");
		}else {
			System.out.println("No se ha hecho la devolucion del libro 1");
		}
		Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int ejemplares;
        System.out.println();
        System.out.print("Introduce titulo Del Libro 3: ");
        titulo = sc.nextLine();
        libro3.setTitulo(titulo);
        System.out.print("Introduce Autor Del Libro 3: ");
        autor = sc.nextLine();
        libro3.setAutor(autor);
        System.out.print("Numero De Ejemplares: ");
        ejemplares = sc.nextInt();
        libro3.setEjemplares(ejemplares);
		System.out.print(libro3.toString());
	}

}







