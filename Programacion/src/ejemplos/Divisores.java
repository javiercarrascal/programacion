package ejemplos;

public class Divisores {

	public static void main(String[] args) {
		//La operaci�n % se utiliza para obtener el resto de una divisi�n
		int resto=10 % 5;
		System.out.println("El resto de 10/5 es :" + resto);
		
		//Para saber si un n�mero es par se obtiene el resto de su divisi�n entre 2
		//Si el resto es 0 entonces el n�mero ser� par
		int par = 10 % 2;
		if(par==0) {
			System.out.println("El numero 10 es par.");
		}else {
			System.out.println("El numero 10 es impar.");
		}

	}

}
