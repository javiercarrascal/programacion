package objetos.excepciones;

import java.io.IOException;

public class Ejemplo4 {

	public static void main(String[] args) {
	
		
				try {
					dividirCero();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	
	}
	
	//Este metodo puede lanzar una excepcion atithmeticException
	//El que llame a este metodo deberá gestionar esta excepcion
	public static void dividirCero() throws IOException{
		int a= 100/0;
	}

}
