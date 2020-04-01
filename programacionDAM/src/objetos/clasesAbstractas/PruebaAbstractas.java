package objetos.clasesAbstractas;

import java.util.ArrayList;

public class PruebaAbstractas {

	public static void main(String[] args) {
		ArrayList<Figura> figuras= new ArrayList<Figura>();
		for(int i=0;i<2;i++){
			Triangulo t= new Triangulo();
			t.pedirDatos();
			Circulo c= new Circulo();
			c.pedirDatos();
			figuras.add(c);
			figuras.add(t);
		}
		boolean repetidas=false;
		for(int i=0;i<figuras.size();i++) {
			for(int j=i+1;j<figuras.size();i++) {
				if(figuras.get(i).comparar(figuras.get(j))) {
					repetidas=true;
				}
			}
		}
		System.out.println("Las figuras del array "+ (repetidas?"si":"no") 
				+ " estan repetidas.");

	}
	


}
