package objetos.clasesAbstractas;

import java.util.ArrayList;

public class PruebaFiguras {

	public static void main(String[] args) {
		ArrayList<Figura> figuras= new ArrayList<Figura>();
		for(int i=0; i<2;i++) {
			Circulo c = new Circulo();
			c.pedirDatos();
			Triangulo t= new Triangulo();
			t.pedirDatos();
		}
		boolean repetido=false;
		for(int i=0; i<figuras.size();i++) {
			for(int j=i+1;j<figuras.size();j++) {
				if(figuras.get(i).comparar(figuras.get(j))){
					repetido=true;
				}
			}
		}
		
		System.out.println("Las figuras " + (repetido?"si":"no") + "están repetidas");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
