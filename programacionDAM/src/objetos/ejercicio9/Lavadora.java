package objetos.ejercicio9;

public class Lavadora extends Electrodomestico{
	private int carga;
	private final int CARGA_POR_DEFECTO=5;

	public Lavadora(int precio, int peso) {
		super(precio, peso);
		this.carga=CARGA_POR_DEFECTO;
	}
	public Lavadora() {
		super();
		this.carga=CARGA_POR_DEFECTO;
	}
	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase,color,consumoEnergetico,peso);
		this.carga=carga;
		
	}
	public int getCarga() {
		return carga;
	}
	public int precioFinal() {
		int precioInicial=super.precioFinal();
		if(this.carga>30) {
			precioInicial+=50;
		}
		return precioInicial;
	}
}












