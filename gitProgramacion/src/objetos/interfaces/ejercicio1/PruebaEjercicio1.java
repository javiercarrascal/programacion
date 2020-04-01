package objetos.interfaces.ejercicio1;

import java.util.ArrayList;

public class PruebaEjercicio1 {

	public static void main(String[] args) {
		Canario c = new Canario();
		PersonaNormal pn = new PersonaNormal();
		Tenor t = new Tenor();
		Gallo g = new Gallo();
		ArrayList<PuedeCantar> lista= new ArrayList<PuedeCantar>();
		lista.add(c);
		lista.add(pn);
		lista.add(t);
		lista.add(g);
		for(int i=0;i<lista.size();i++) {
			lista.get(i).cantar();
		}

	}

}
