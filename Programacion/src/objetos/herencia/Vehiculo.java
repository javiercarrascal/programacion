package objetos.herencia;

public class Vehiculo {  
	protected int velocidad;  
	protected int ruedas;  
	
	public Vehiculo(int velocidad) {
		this.velocidad=velocidad;
	}
	
	protected void parar() {   
		velocidad = 0;  
	}  
	protected void acelerar(int kmh) {   
		velocidad += kmh;  
	} 
} 












