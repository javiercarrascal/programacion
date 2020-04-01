package ejercicios;

public class Ejercicio85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void insertarAleatorio(int[] array, int posicion) {
		array[posicion]=aleatorio();
	}
	
	public static int aleatorio() {
		int numero=(int)(Math.random()*100);
		return numero;
	}
	
	
}
