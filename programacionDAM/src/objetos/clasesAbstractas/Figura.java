package objetos.clasesAbstractas;

public abstract class Figura{

	abstract double area() ; 
	abstract double perimetro() ;
	abstract void pedirDatos() ;
	
	abstract boolean comparar(Figura f) ;
	
	public void metodoNoAbstracto() {
		System.out.println("Metodo no abstracto que hace algo");
		
	}
	
}
