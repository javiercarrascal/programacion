package objetos.herencia;

public class PruebaVehiculo {

	public static void main(String[] args) {
		Vehiculo v1=new Vehiculo(2);
		Coche c1= new Coche();
		//Desde v1 podré acceder a los metodos de vehiculo y desde c1 tanto a los de vehiculo 
		//como a los de coche
		c1.getGasolina();
		c1.saludar();

	}

}
