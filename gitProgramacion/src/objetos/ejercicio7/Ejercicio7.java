package objetos.ejercicio7;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		int puntuacion=0;
		
		//Ejercicio1
		
		 
		Hora h1= new Hora(1,0,0);
		if(h1.aSegundos()==3600) {
			puntuacion+=1;
		}
		 
		
		
		System.out.println("Puntuacion total: " + puntuacion);
	}

}
