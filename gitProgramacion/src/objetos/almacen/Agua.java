package objetos.almacen;

public class Agua extends Bebida{
	private String origen;
	

	public Agua(int identificador, double litros, double precio, String marca, String origen) {
		super(identificador, litros, precio, marca);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "Agua [origen=" + origen + ", identificador=" + identificador + ", litros=" + litros + ", precio="
				+ precio + ", marca=" + marca + "]";
	}


	

}
