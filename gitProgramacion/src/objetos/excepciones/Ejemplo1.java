package objetos.excepciones;

public class Ejemplo1 {

	public static void main(String[] args) {
		int[] array = new int[10];
		try {
			System.out.println(array[11]);
			
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Posicion incorrecta");
			System.out.println(ex.getMessage());
		}

	}

}
