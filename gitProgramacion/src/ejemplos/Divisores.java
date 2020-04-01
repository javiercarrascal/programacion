package ejemplos;

public class Divisores {

	public static void main(String[] args) {
		//La operación % se utiliza para obtener el resto de una división
		int resto=10 % 5;
		System.out.println("El resto de 10/5 es :" + resto);
		
		//Para saber si un número es par se obtiene el resto de su división entre 2
		//Si el resto es 0 entonces el número será par
		int par = 10 % 2;
		if(par==0) {
			System.out.println("El numero 10 es par.");
		}else {
			System.out.println("El numero 10 es impar.");
		}

	}

}
