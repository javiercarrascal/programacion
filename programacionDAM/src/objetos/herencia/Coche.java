package objetos.herencia;

//La palabra reservada extends indica que Coche hereda de Vehiculo
public class Coche extends Vehiculo implements Arrancable{
	private int gasolina;
	
	
	
	
	public Coche() {
		super(4);
		this.gasolina=50;
	}
	public Coche(int ruedas) {
		super(ruedas);
		this.gasolina=50;
	}
	public void repostar(int cantidad) {
		this.gasolina+=cantidad;
	}
	
	public int getGasolina() {
		return gasolina;
	}
	public void setGasolina(int gasolina) {
		this.gasolina = gasolina;
	}
	public void saludar() {
		System.out.println("Hola, soy un coche y estoy saludando.");
	}
	@Override
	public void arrancar() {
		System.out.println("arrancamos el coche");
		System.out.println("El maximo de cilindrada es " + this.MAX_CILINDRADA);		
	}
	@Override
	public void detenerMotor() {
		System.out.println("Detenemos el motor del coche");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
