package objetos.interfaces.ejercicio2;

import java.util.ArrayList;

public class Tienda {

	public static void main(String[] args) {
		System.out.println("hola mundo");
		Pelicula p1= new Pelicula();
		p1.setTitulo("titanic");
		p1.setDirector("James Cameron");
		p1.setEjemplares(10);
		VideoJuego v1= new VideoJuego();
		v1.setTitulo("Metal gear");
		v1.setEjemplares(5);
		v1.setPlataforma("ps4");
		ArrayList<Vendible> ventas = new ArrayList<Vendible>();
		ventas.add(p1);
		ventas.add(v1);
		
		for(int i=0;i<ventas.size();i++) {
			ventas.get(i).vender();
		}
		
		
		
		
		
	}

}
