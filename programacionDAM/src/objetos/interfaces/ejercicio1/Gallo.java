package objetos.interfaces.ejercicio1;

public class Gallo implements PuedeCantar {

	@Override
	public void cantar() {
		System.out.println("El gallo canta: " + this.CANTO_GALLO);
		
	}

}
