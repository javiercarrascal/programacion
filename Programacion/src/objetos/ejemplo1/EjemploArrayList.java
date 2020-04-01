package objetos.ejemplo1;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		//Si creo un arrayList sin especificar el tipo de dato será por defecto de String
		ArrayList lista1 = new ArrayList();
		//Para añadir elementos a un arrayList se usa el "add" y entre parentesis se pasa lo 
		//que se quiere añadir
		lista1.add("Hola mundo");
		lista1.add("me llamo pepe");
		//Para obtener el tamaño de un arrayList se usa el "size()"
		System.out.println("El tamaño del arrayList creado es:" + lista1.size());
		//Para recorrer un arrayList podemos hacerlo con un for
		for(int i=0;i<lista1.size();i++) {
			//Para recuperar algo del arraylist se utiliza "get(posicion)"
			System.out.println(lista1.get(i));
		}
		//Para crear un arrayList de Coches se pone el tipo asi: "<Coche>"
		ArrayList<Coche> listaCoches= new ArrayList<Coche>();
		Coche c1= new Coche(110, "Peugeot","307","1111aaa","negro");
		Coche c2= new Coche(200,"Peugeot","308","2222bbb", "gris");
		listaCoches.add(c1);
		//Para añadir algo en una posicion concreta se indica la posicion antes del objeto
		listaCoches.add(0, c2);
		//Para eliminar un elemento del array utilizamos el remove(posicion)
		listaCoches.remove(0);
		
		
		
		
		

		
		

	}

}
