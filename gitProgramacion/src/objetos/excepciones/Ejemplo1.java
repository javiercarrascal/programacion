package objetos.excepciones;

public class Ejemplo1 {

	public static void main(String[] args) {
		/**
		 * Ejemplo de control de excepciones en el indice de un array
		 */
		//Me creo un array de 10 posiciones
		int[] array = new int[10];
		//Dentro del try va el codigo que voy a "intentar" ejecutar
		try {
			//Accedo a una posicion del array que no existe
			System.out.println(array[11]);
			
			//Nunca se ejecutara la siguiente linea
			System.out.println("hola mundo");
			
		//Llamo "ex" a la excepción que capturo, pero puedo llamarla de cualquier modo
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Posicion incorrecta");
			System.out.println(ex.getMessage());
		}
		

	}

}
