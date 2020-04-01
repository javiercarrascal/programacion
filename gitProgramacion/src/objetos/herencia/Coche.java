package objetos.herencia;

public class Coche extends Vehiculo implements Arrancable{
	public int gasolina;
	
	public void repostar(int litros) {
		this.gasolina+=litros;
	}
	public Coche() {
		super(0);
		this.ruedas=4;
	}
	public void acelerar(int kmh) {
		super.acelerar(kmh);
		this.gasolina-=1;
	}

	public void arrancar() {
		System.out.println("El coche ha arrancado");
		
	}

	public void detenerMotor() {
		System.out.println("El motor del coche se ha detenida");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
