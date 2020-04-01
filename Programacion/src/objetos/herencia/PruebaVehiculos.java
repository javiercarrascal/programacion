package objetos.herencia;

public class PruebaVehiculos {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		Vehiculo v1= new Vehiculo(10);
		c1.parar();
	
		
		c1.acelerar(20);
		v1.acelerar(50);

	}

}
