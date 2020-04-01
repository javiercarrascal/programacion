package objetos.interfaces.ejercicio2;

public abstract class MaterialColeccionista implements Vendible{
	protected int codigoColeccion;
	protected int ejemplares;
	protected double precio;
	protected String Descripcion;
	protected int codigo;
	
	public boolean vender() {
		boolean correcto=false;
		if(this.ejemplares>0) {
			this.ejemplares--;
			correcto=true;
		}
		System.out.println("Precio a pagar: "
		+ this.precio+this.precio*this.IVA/100);
		return correcto;
		
	}

}
