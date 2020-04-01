package ejercicios;

public class Ejercicio35 {

	public static void main(String[] args) {
		//Bucle principal. de qué número hacemos la tabla de multiplicar.
		for(int i=1;i<=10;i++) {
			System.out.println("*** TABLA DE MULTIPLICAR DEL " + i+ " ***");
			//Numeros por los que se multiplica dentro de la tabla
			for(int j=1;j<=10;j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			
				
			
		}

	}

}
