package objetos.ejercicio9;

public class Television extends Electrodomestico{
	private int resolucion;
	private boolean sintonizadorTDT;
	
	public int getResolucion() {
		return resolucion;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	public Television() {
		super();
		this.resolucion=20;
		this.sintonizadorTDT=false;
	}
	public Television (int precio, int peso) {
		super(precio, peso);
		this.resolucion=20;
		this.sintonizadorTDT=false;
	}
	public Television(int precioBase, String color, 
			char consumoEnergetico, int peso, int resolucion,boolean sintonizadorTDT) {
		super(precioBase,color,consumoEnergetico,peso);
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}
	public int precioFinal() {
		int precioInicial=super.precioFinal();
		if(this.resolucion>40) {
			precioInicial+=(precioInicial*0.3);
		}
		if(this.sintonizadorTDT) {
			precioInicial+=50;
		}
		return precioInicial;
	}
	
	

}
