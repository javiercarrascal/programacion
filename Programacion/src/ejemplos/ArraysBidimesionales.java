package ejemplos;

public class ArraysBidimesionales {

	public static void main(String[] args) {
		// Creo un array bidimensional de 3x4
		int [][]array= new int[3][4];
		//Relleno el array de numeros aleatorios.
		//El primer for sirve para ir recorriendo las filas. El length da el numero de filas
		for(int i=0;i<array.length;i++) {
			//El for anidado sirve para recorrer las columnas
			for(int j=0;j<array[i].length;j++) {
				//Introduzco un numero aleatorio en cada una de las posiciones del array
				array[i][j]=(int)(Math.random()*100);
			}
		}
		//Para mostrar un array bidimensional tb hay que usar 2 for anidados
		for(int i=0;i<array.length;i++) {
			//El for anidado sirve para recorrer las columnas
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] + ",");
			}
			System.out.println();
		}
		
		//Creacion de un array bidimensional de distinto numero de columnas por fila
		int[][]arrayRaro = new int [4][];
		arrayRaro[0]=new int[10];
		arrayRaro[1]=new int[5];
		arrayRaro[2]= new int[7];
		arrayRaro[3]=new int[2];
		int[]fila3= {1,2,3,4,5,6,4,3,2,3,4,5,54,3,3,2,2,22,34,5};
		arrayRaro[3]=fila3;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
