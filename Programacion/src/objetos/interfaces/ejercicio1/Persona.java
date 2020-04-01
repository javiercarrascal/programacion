package objetos.interfaces.ejercicio1;

public abstract class Persona implements PuedeCantar{
	
	public void cantar() {
		System.out.println("Soy una persona y canto: " + this.CANTO_PERSONA);
		
	}
	
}
