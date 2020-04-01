package objetos.interfaces.ejercicio1;

public class Gallo implements PuedeCantar {

	@Override
	public void cantar() {
		System.out.println("Soy un gallo y canto: " + this.CANTO_GALLO);
		
	}
	
	
	
}
