package objetos.excepciones;

public class Ejemplo4 {

	public static void main(String[] args) {
		try {
			dividirCero();
		}catch(ArithmeticException ex) {
			System.out.println("Excepcion aritmetica");
		}
			

	}
	
	//Este metodo puede lanzar una excepcion atithmeticException
	//El que llame a este metodo deberá gestionar esta excepcion
	public static void dividirCero() throws ArithmeticException{
		int a= 100/0;
	}

}
