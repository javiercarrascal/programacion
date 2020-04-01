package objetos.clasesAbstractas;

import java.util.Scanner;

public class Triangulo extends Figura implements Dibujable{
	private double base;
	private double altura;
	
	double area() {
		double area=this.base*this.altura/2;
		return area;
	}
	
	double perimetro() {
		double perimetro= 3*this.base;
		return perimetro;
	}
	
	void pedirDatos() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce la base del triangulo");
		this.base=sc.nextDouble();
		System.out.println("Introduce la altura del triangulo");
		this.altura=sc.nextDouble();
	}
	
	boolean comparar(Figura f) {
		boolean iguales=false;
		if(f instanceof Triangulo) {
			Triangulo t =(Triangulo)f;
			if(this.base==t.base && this.altura==t.altura){
				iguales=true;
			}
		}
		return iguales;
	}

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujo del triangulo");
		
	}
	
	public Triangulo(){
		
	}

}













