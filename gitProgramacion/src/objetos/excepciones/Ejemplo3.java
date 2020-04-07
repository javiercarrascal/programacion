package objetos.excepciones;

public class Ejemplo3 {

	public static void main(String[] args) {
		
		//El orden de los catch debe ser de hijo a padre.
		int[] array = new int[5];
		try {
			//Provocamos una excepcion de tipo aritmetica
			int a= 100/0;
			System.out.println(array[6]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Error al acceder al array.");		
		}catch(ArithmeticException ex) {
			System.out.println("Error division entre 0");
		}catch(Exception ex) {
			System.out.println("Otro error distinto.");
		}

	}

}
