package objetos.excepciones.ejercicio3;

public class NotAValidCharacterException extends Exception{
	
	public String getMessage() {
		return "El valor introducido no es un carácter válido";
	}

}
