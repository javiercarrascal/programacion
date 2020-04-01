package objetos.interfaces.ejercicio1;

public class Canario implements PuedeCantar {
	@Override
	public void cantar() {
		System.out.println("El canario canta: " + this.CANTO_CANARIO);
		
	}


}
