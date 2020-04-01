package objetos.ejercicio6;

import java.util.ArrayList;

public class Ejercicio6 {

	public static void main(String[] args) {
		Cancion c1= new Cancion();
		Cancion c2 = new Cancion("Get lucky", "daft punk", 3.30);
		c2.reproducir();
		Playlist p1= new Playlist("Mi lista guay");
		p1.anyadirCancion(c2);
		
		p1.obtieneCancion(0).reproducir();
		System.out.println("El total de canciones de la lista es: " + p1.obtieneTotalCanciones());
		p1.mostrarPlaylist();
		ArrayList<Cancion> cancionesDeTamara= p1.encontrarCancionPorArtista("tamara");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
