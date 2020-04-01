package objetos.domino;

import java.util.ArrayList;
import java.util.Collections;

public class Domino {
	ArrayList<Pieza> piezas = new ArrayList<Pieza>();
	public Domino() {
		for(int i=0;i<=6;i++) {
			for(int j=i;j<=6;j++) {
				Pieza p= new Pieza(i,j);
				piezas.add(p);
			}
		}
	}
	public void mostrarPiezas() {
		for(Pieza p: piezas) {
			System.out.println(p);
		}
	}
	public void repartirPiezas(ArrayList<Jugador> jugadores) {
		//Desordeno el array de piezas
		Collections.shuffle(this.piezas);
		//Al iniciar el juego se reparten 7 piezas a cada jugador
		for(int i=0;i<7;i++) {
			for(Jugador j:jugadores) {
				//Para no complicarme calculando la pieza que hay que dar siempre reparto la 0
				j.darPieza(piezas.get(0));
				//Elimino la pieza que acabo de repartir
				piezas.remove(0);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
