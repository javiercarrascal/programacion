package objetos.herencia;

public class Vehiculo {
	//El modificador protected se utiliza cuando de una clase va a heredar otra
	protected int velocidad;
	protected int ruedas;
	
	public Vehiculo(int ruedas) {
		this.ruedas=ruedas;
		System.out.println("Se llama al constructor del vehiculo");
	}
	
	public void parar() {
		this.velocidad=0;
	}
	public void acelerar(int kmh) {
		this.velocidad+=kmh;
	}
	public void saludar() {
		System.out.println("Hola, soy un vehiculo y estoy saludando");
	}

}
