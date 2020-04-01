package objetos.clasesAbstractas;

import java.util.Scanner;

public class Circulo extends Figura {
	private double radio;
	
	double area() {
		double area=Math.PI*Math.pow(radio,2);
		return area;
	}
	
	double perimetro() {
		double perimetro= 2*Math.PI*this.radio;
		return perimetro;
	}
	
	void pedirDatos() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el radio del circulo: ");
		this.radio=sc.nextDouble();

	}
	
	boolean comparar(Figura f) {
		boolean iguales=false;
		if(f instanceof Circulo) {
			Circulo c =(Circulo)f;
			if(this.radio==c.radio){
				iguales=true;
			}
		}
		return iguales;
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public Circulo() {
		super();
	}




}













