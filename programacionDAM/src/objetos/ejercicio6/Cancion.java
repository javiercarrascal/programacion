package objetos.ejercicio6;

import java.util.ArrayList;

/*.Queremos hacer una especie de Spotify. Como sab�is, Spotify maneja playlists y canciones. 
 * Modelaremos esos elementos utilizando clases Cancion y Playlist.
Cada Cancion tiene un titulo (atributo �titulo�), un nombre de artista/grupo (atributo �artista�) 
y una duraci�n total (atributo �duracionMinutos�).
Tenemos que crear atributos privados, constructor por defecto y con par�metros (para todos los atributos), m�todos get y set de los atributos, 
y el m�todo toString(). El m�todo toString() devolver� en este formato el contenido de la canci�n �[<titulo> - <artista> (<duracion> minutos) ]�. 
Por ejemplo: �Get Lucky � Daft Punk (3 minutos)�. 
La clase Cancion tendr� un m�todo �reproducir()� que imprimir� en pantalla �Reproduciendo� � concatenado con el titulo de la canci�n.*/
public class Cancion {
	private String titulo;
	private String artista;
	private double duracion;
	ArrayList<Cancion> lista;
	
	public Cancion() {};
	
	public Cancion(String titulo, String artista, double duracion) {
		this.titulo=titulo;
		this.artista=artista;
		this.duracion=duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public String toString() {
		String cadena= this.titulo + " - " + this.artista + "(" + this.duracion + ")";
		return cadena;
	}
	public void reproducir() {
		System.out.println("Reproduciendo..." + this.titulo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
