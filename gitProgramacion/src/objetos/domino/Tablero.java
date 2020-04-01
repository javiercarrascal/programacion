package objetos.domino;

import java.util.ArrayList;

public class Tablero {
	ArrayList<Pieza>tablero = new ArrayList<Pieza>();
	
	//Metodo que intenta colocar la pieza que se le pasa como parametro en el tablero
	//posición: 
	//	true:Derecha false:izquierda
	//Devolverá true si la coloca bien y false si no la coloca bien
	public boolean colocarPieza(Pieza p, boolean posicion) {
		//Si el tablero está vacío colocará la pieza y devuelve true
		if(tablero.isEmpty()) {
			tablero.add(p);
			return true;
		}else {
			//El tablero no está vacío
			if(posicion==true) {
				if (p.getNum1()==tablero.get(tablero.size()-1).getNum2()) {
					//LA pieza está bien colocada
					tablero.add(p);
					return true;
				}else if(p.getNum2()==tablero.get(tablero.size()-1).getNum2()) {
					//Hay que girar la pieza para colocarla
					p.girar();
					tablero.add(p);
					return true;
				}else {
					//No coincide ninguno de los numeros
					return false;
				}
			}else {
				if (p.getNum2()==tablero.get(0).getNum1()) {
					//LA pieza está bien colocada
					//Coloco la pieza en la posicion 0
					tablero.add(0, p);
					return true;
				}else if(p.getNum1()==tablero.get(0).getNum1()) {
					//Hay que girar la pieza para colocarla
					p.girar();
					tablero.add(0, p);
					return true;
				}else {
					//No coincide ninguno de los numeros
					return false;
				}
			}	
		}
	}
	public void mostrarTablero() {
		System.out.println("Tablero:");
		for(Pieza p:tablero) {
			System.out.print(p);
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
