package objetos.excepciones;

public class Ejemplo1 {

	public static void main(String[] args) {
		int[] array = new int[10];
		//Dentro del try meto lo que "intento" hacer
		try {
			//Accedo a una posicion incorrecta del array
			System.out.println(array[11]);
			//No llegará a esta linea en caso de haberse provocado la excepcion
			System.out.println("Hola mundo");
			
		//En caso de saltar una excepcion de tipo ArrayIndex... lo capturara este catch
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Posicion incorrecta");
			System.out.println("Mensaje de la excepcion: "+ ex.getMessage());
		}

	}

}
