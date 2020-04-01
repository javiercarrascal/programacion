package objetos.ejercicio9;

public class Electrodomestico {
	protected int precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	
	
	//Los colores disponibles son blanco, negro, rojo, azul y gris
	private String[] colores= {"blanco", "negro", "rojo", "azul", "gris"};
	private char[]consumos= {'A','B','C','D','E','F'};
	
	private void comprobarColor(String color) {
		boolean correcto=false;
		for(int i=0;i<colores.length;i++) {
			if(color.toLowerCase().equals(colores[i])) {
				this.color=color;
				correcto=true;
			}
		}
		if(!correcto) {
			this.color="blanco";
		}
		
	}
	
	private void comprobarConsumoEnergetico(char consumo) {
		boolean correcto=false;
		String consumoString = String.valueOf(consumo);
		consumoString=consumoString.toUpperCase();
		for(int i=0;i<consumos.length;i++) {
			if(String.valueOf(consumos[i]).equals(consumoString)) {
				correcto=true;
				this.consumoEnergetico=consumo;
			}
		}
		if(!correcto) {
			this.consumoEnergetico='F';
		}
	}
	
	
	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public int getPeso() {
		return peso;
	}
	/*Por defecto, el color será blanco, el consumo energético será F, 
	 * el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.buen */
	public Electrodomestico() {
		super();
		this.color="blanco";
		this.consumoEnergetico='F';
		this.precioBase=100;
		this.peso=5;
	}
	public Electrodomestico(int precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color="blanco";
		this.consumoEnergetico='F';
	}

	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
		
	}
	public int precioFinal() {
		int precioExtra=0;
		switch(consumoEnergetico) {
		case 'A':	precioExtra+=100;	break;
		case 'B':	precioExtra+=80;	break;
		case 'C':	precioExtra+=60;	break;
		case 'D':	precioExtra+=50;	break;
		case 'E':	precioExtra+=30;	break;
		case 'F':	precioExtra+=10;	break;
		}
		if(this.peso>=0 && this.peso<20) {
			precioExtra+=10;
		}
		if(this.peso>=20 && this.peso<50) {
			precioExtra+=50;
		}
		if(this.peso>=50 && this.peso<80) {
			precioExtra+=80;
		}
		if(this.peso>=80) {
			precioExtra+=100;
		}
		return precioBase+precioExtra;
	}
	
	
	
	
	
	
}
