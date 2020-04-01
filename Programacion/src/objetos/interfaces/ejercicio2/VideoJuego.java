package objetos.interfaces.ejercicio2;

import java.util.Scanner;

public class VideoJuego implements Alquilable, Vendible{
	private String titulo;
	private String plataforma;
	private int ejemplares;
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public void pedirDatos(){
		Scanner sc= new Scanner(System.in);
		Scanner scn= new Scanner(System.in);
		System.out.println("Introduce el titulo de la pelicula: ");
		this.titulo=sc.nextLine();
		System.out.println("Introduce la plataforma de la pelicula: ");
		this.plataforma=sc.nextLine();
		System.out.println("Introduce el numero de ejemplares: ");
		this.ejemplares=scn.nextInt();
		
	}
	
	@Override
	public boolean vender() {
		boolean correcto=false;
		if(this.ejemplares>0) {
			this.ejemplares--;
			correcto=true;
			System.out.println("El precio a pagar es " 
					+ (10+(double)10*Vendible.IVA/100));
		}
		return correcto;
	}

	@Override
	public void devolver() {
		this.ejemplares++;
		
	}

	@Override
	public boolean alquilar() {
		Scanner scn= new Scanner(System.in);
		boolean correcto=false;
		if(this.ejemplares>0) {
			this.ejemplares--;
			correcto=true;
		}
		System.out.println("Cuantos dias alquilas el juego?: ");
		int dias=scn.nextInt();
		System.out.println(dias+(double)dias*Alquilable.IVA/100);
		return correcto;

	}

}










