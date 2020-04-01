package objetos.almacen;

public class Azucarada extends Bebida{
	private boolean promocion;
	private double azucar;
	
	public Azucarada(int identificador, double litros, double precio, String marca, boolean promocion, double azucar) {
		super(identificador, litros, precio, marca);
		this.promocion = promocion;
		this.azucar = azucar;
	}
	public boolean isPromocion() {
		return promocion;
	}
	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	public double getAzucar() {
		return azucar;
	}
	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}
	@Override
	public String toString() {
		return "Azucarada [promocion=" + promocion + ", azucar=" + azucar + ", identificador=" + identificador
				+ ", litros=" + litros + ", precio=" + precio + ", marca=" + marca + "]";
	}
	

	

}


















