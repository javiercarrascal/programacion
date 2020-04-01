package objetos.ejemplo1;

import java.util.ArrayList;
import java.util.Iterator;

public class ForAvanzado {
	public static void main(String[] args) {
		ArrayList<Coche> coches= new ArrayList<Coche>();
		//PAra visualizar el array con un for normal hay que sacar cada objeto utilizando la i
		for(int i=0;i<coches.size();i++) {
			System.out.println(coches.get(i));
		}
		//En el for avanzado se recorre el array de coches y va metiendo cada coche en la variable c1
		//que es de tipo Coche
		for(Coche c1: coches) {
			System.out.println(c1);
		}
		//Para recorrer un arrayList con un iterador primero guardamos el iterador en una variable y 
		//Luego lo recorremos usando un while
		Iterator<Coche> it1=coches.iterator();
		while(it1.hasNext()) {
			Coche c1= it1.next();
			System.out.println(c1);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
