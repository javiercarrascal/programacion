package ejemplos;

public class Aleatorio {

	public static void main(String[] args) {
		//Para generar un numero aleatorio utilizamos el Math.random(), 
		//que dará un aleatorio entre 0 y 1
		double aleatorio=Math.random();
		System.out.println(aleatorio);
		//Para obtener un numero entre 0 y un número se multiplica por ese número
		aleatorio=Math.random()*10;
		System.out.println("Numero aleatorio entre 0 y 10: " + aleatorio);
		//Para no mostrar decimales transformamos el resultado en un int
		int aleatorioEntero=(int)(Math.random()*10);
		System.out.println("Numero aleatorio entero entre 0 y 9: " + aleatorioEntero );
		//Para que el aleatorio no empiece en 0 y llegue al numero final se le suma 1
		aleatorioEntero=(int)(Math.random()*10)+1;
		System.out.println("Aleatorio entre 1 y 10: " + aleatorioEntero);
		//Para que el aleatorio esté dentro de un rango
		//Ejemplo: numero aleatorio entre el 50 y el 70:
		//Se haya la diferencia: 70-50=20 
		//Se multiplica math.random * la diferencia y se suma al valor inicial
		aleatorioEntero=(int)(Math.random()*20)+50;
		System.out.println("Aleatorio entre 50 y 70: " + aleatorioEntero);
		
		
		
		
		
		
		
		
		
		
	}

}
