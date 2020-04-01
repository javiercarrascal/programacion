package objetos.interfaces.ejercicio1;

public class Canario implements PuedeCantar{

	@Override
	public void cantar() {
		System.out.println("Soy un canario y canto asi: " + this.CANTO_CANARIO);
		
	}
	
	

}
