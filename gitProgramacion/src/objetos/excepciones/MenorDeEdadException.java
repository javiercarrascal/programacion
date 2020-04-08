package objetos.excepciones;

public class MenorDeEdadException extends Exception{
	
	private String mensaje;
	
	public MenorDeEdadException(String mensaje) {
		this.mensaje=mensaje;
	}
	
	public MenorDeEdadException() {
		this.mensaje="El usuario debe ser mayor de edad.";
	}
	
	public String getMessage() {
		return this.mensaje;
	}
	

}
