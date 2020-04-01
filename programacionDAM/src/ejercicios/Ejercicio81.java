package ejercicios;
import java.util.Arrays;

public class Ejercicio81 {
		
	public static int[] intervalo(int num1, int num2) {
		//calculo el tamaño del array resultante
		int tam = num2-num1+1;
		//Creo el array con el tamaño del paso anterior
		int[] array = new int[tam];
		//recorro con un for el array y en cada posicion voy guardando un numero y sumando 1
		for(int i=0;i<array.length;i++) {
			array[i]=num1;
			num1++;
		}
		//devuelvo el array
		return array;
	}
	public static int[] intervalo(int num1, int num2, int num3) {
		int tam=0;
		for(int i=num1;i<=num2;i+=num3) {
			tam++;
		}
		int[] array = new int[tam];
		//recorro con un for el array y en cada posicion voy guardando un numero y sumando el intervalo
		for(int i=0;i<array.length;i++) {
			array[i]=num1;
			num1+=num3;
		}
		//devuelvo el array
		return array;	
	}
	
	
	public static void main(String[] args) {
		int[] array2=intervalo(10,20,2);

		System.out.println(Arrays.toString(array2));
	
	}

}


















