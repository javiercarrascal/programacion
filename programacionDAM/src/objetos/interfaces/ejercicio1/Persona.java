package objetos.interfaces.ejercicio1;

public abstract class Persona implements PuedeCantar {
	
	public void cantar() {
		System.out.println("La persona canta : " + this.CANTO_PERSONA);
	}
	

}
