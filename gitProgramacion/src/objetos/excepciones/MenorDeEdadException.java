package objetos.excepciones;

public class MenorDeEdadException extends Exception{
	String mensaje;
	
	public MenorDeEdadException(String mensaje) {
		this.mensaje=mensaje;
	}
	
	public String getMessage() {
		return this.mensaje;
	}
	

}
