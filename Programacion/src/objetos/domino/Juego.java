package objetos.domino;

import java.util.ArrayList;

public class Juego {
	public static void main(String[] args) {
		ArrayList<Jugador> jugadores= new ArrayList<Jugador>();
		Domino d = new Domino();
		Jugador j1 = new Jugador("pepe", true);
		Jugador j2 = new Jugador("Manoli", false);
		jugadores.add(j1);
		jugadores.add(j2);
		d.repartirPiezas(jugadores);
		int turno=0;
		Tablero tablero= new Tablero();
		int pasan=0;
		boolean finPartida=false;
		while(!finPartida) {
			//Llamo al metodo jugar del jugador que devuelve true o false en funcion de si pasa o no
			boolean juega = jugadores.get(turno).jugar(tablero);
			//Compruebo que el jugador que ha lanzado sigue teniendo piezas
			if(jugadores.get(turno).getPiezas().isEmpty()) {
				finPartida=true;
				System.out.println("Fin de partida. Ha ganado " 
						+ jugadores.get(turno).getNombre());
			}
			if(!juega) {
				//Si el jugador ha pasado entonces se le reparte otra pieza y le vuelve a tocar
				if(!d.piezas.isEmpty()) {
					System.out.println("Se reparte una pieza a " + jugadores.get(turno).getNombre());
					jugadores.get(turno).darPieza(d.piezas.get(0));
					d.piezas.remove(0);
					//Resto 1 al turno para que al sumar 1 después le vuelva a tocar al mismo
					turno--;
				}else {
					//Si no quedan piezas por dar y pasan todos hasta volver a llegar al jugador que ha
					//tirado la ultima vez se acaba la partida
					pasan++;
					//Su han pasado todos los jugadores entonces termina la partida
					if(pasan==jugadores.size()) {
						System.out.println("Fin de la partida");
						finPartida=true;
					}
				}
			}else {
				//En cada ronda pongo el contador de "pasar" a 0 en caso de que el jugador juegue correctamente
				pasan =0;
			}
			//Aumento el turno para que en la siguiente ronda le toque al siguiente jugador
			turno++;
			//Si el turno llega al numero de jugadores entonces le vuelve a tocar al jugador 0
			if(turno==jugadores.size()) {
				turno=0;
			}
			
		}
		
		
	}
}





