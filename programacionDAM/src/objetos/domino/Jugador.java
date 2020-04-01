package objetos.domino;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {
	private String nombre;
	private ArrayList<Pieza> piezas = new ArrayList<Pieza>();
	private int puntuacion;
	private boolean humano;

	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public boolean isHumano() {
		return humano;
	}
	public void setHumano(boolean humano) {
		this.humano = humano;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Pieza> getPiezas() {
		return piezas;
	}
	public void setPiezas(ArrayList<Pieza> piezas) {
		this.piezas = piezas;
	}
	public Jugador(String nombre, boolean humano) {
		super();
		this.humano=humano;
		this.nombre = nombre;
	}
	
	public void darPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	public void mostraPiezas() {
		System.out.println("Piezas del jugador " + this.nombre + ":");
		for(int i=0;i<piezas.size();i++) {
			Pieza p = piezas.get(i);
			System.out.print((i+1) + " - ");
			System.out.println(p);
		}

	}
	//Metodo que recibe el tablero y hace que juegue un jugador(humano o maquina)
	//Devuelve true si ha conseguido jugar una pieza y false si no
	public boolean jugar(Tablero t){
		System.out.println("Juega " + this.nombre);
		Scanner sc= new Scanner(System.in);
		if(this.humano) {
			t.mostrarTablero();
			System.out.println("Cuál de tus piezas quieres jugar? (0 para pasar)");
			this.mostraPiezas();
			int numPieza= sc.nextInt()-1;
			if(numPieza!=-1) {
				System.out.println("¿En qué posición del tablero?(1 izda, 2 dcha)");
				int posicion=sc.nextInt();
				boolean correcto=t.colocarPieza(piezas.get(numPieza), posicion==1?false:true);
				if(correcto) {
					piezas.remove(numPieza);
					return true;
				}else {
					System.out.println("Pieza incorrecta.");
					return false;
				}
			}else {
				System.out.println("El jugador ha pasado.");
				return false;
			}
		}else {
			//Juega la máquina
			//Si le toca y el tablero está vacío devuelve un false
			if(t.tablero.isEmpty()) {
				return false;
			}else {
				//compruebo los dos laterales del tablero
				int numIzquierda = t.tablero.get(0).getNum1();
				int numDerecha=t.tablero.get(t.tablero.size()-1).getNum2();
				Pieza elegida = null;
				boolean posicion=false;
				int suma=0;
				for(Pieza p: piezas) {
					//Compruebo contra la parte izda del tablero
					if(p.getNum1()==numIzquierda || p.getNum2()==numIzquierda) {
						//Compruebo que su suma sea la mayor de las piezas posibles
						if(p.getNum1()+p.getNum2()>suma) {
							elegida=p;
							suma=p.getNum1()+p.getNum2();
							posicion=false;
						}
					}
					//Compruebo la parte derecha del tablero
					if(p.getNum1()==numDerecha || p.getNum2()==numDerecha) {
						//Compruebo que su suma sea la mayor de las piezas posibles
						if(p.getNum1()+p.getNum2()>suma) {
							elegida=p;
							suma=p.getNum1()+p.getNum2();
							posicion=true;
						}
					}
				}
				//Intento colocar la pieza en el tablero
				boolean correcto=false;
				if(elegida!=null) {
					correcto=t.colocarPieza(elegida, posicion);
					if(correcto) {
						this.piezas.remove(elegida);
					}
				}
				return correcto;
				
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
