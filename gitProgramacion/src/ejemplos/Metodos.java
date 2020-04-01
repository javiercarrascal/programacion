package ejemplos;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		saludar();
		esPar(10);
		int a=7;
		//Puedo llamar al metodo pasandole cualquier variable con cualquier nombre
		esPar(a);
		//Tb puedo llamarle con una variable que se llame igual que la del metodo
		int numero=15;
		esPar(numero);
		//En este punto la variable "numero" vale 15
		//Si llamo a el metodo incrementar no modifica el valor de la variable con la que lo llamo
		incrementar(numero);
		System.out.println(numero);
		//Llamo al metodo sumar, le paso el 10 al numero1 y el 15 al numero2
		sumar(10,15);
		double sumaDoubles = sumar(10.4 , 14.5);
		System.out.println(sumaDoubles);

		
		
	}

	//La primera palabra es el modificador de acceso, en este caso "public"
	//Para llamar a un metodo desde otro, si uno es estatico el otro tb debe serlo
	//void: Este metodo no "devuelve" nada.
	//El nombre "saludar" debe ir en minusculas
	//Si el metodo no necesita ningun dato no se le "pasa" nada, con lo cual los parentesis van vacíos
	public static void saludar() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre=sc.nextLine();
		System.out.println("Hola " + nombre + ", bienvenido.");
	}
	//Metodo que recibe un numero e indica al usuario si ese numero es par
	//NO pide el numero al usuario, lo recibe como "parámetro"
	//Para indicar qué dato "recibe" el metodo se indica el tipo de dato y el nombre de la variable
	//que lo contendrá
	public static void esPar(int numero) {
		if(numero%2==0) {
			System.out.println("El numero " + numero + " es par.");
		}else {
			System.out.println("El numero " + numero + " es impar.");
		}
	}
	//Metodo que incrementa en 1 el numero recibido y lo muestra
	public static void incrementar(int numero) {
		numero++;
		System.out.println(numero);
	}
	//Metodo que recibe 2 argumentos y los suma
	public static void sumar(int numero1, int numero2) {
		int suma=numero1+numero2;
		System.out.println("La suma de " + numero1 + " + "+ numero2 + " es " + suma);
	}
	//Metodo que recibe 3 argumentos y los suma
	//Dos metodos pueden llamarse igual si reciben distinto numero de args o de distinto tipo
	public static void sumar(int num1, int num2, int num3) {
		
	}
	
	//Metodo que recibe 2 double y devuelve su suma
	public static double sumar(double numero1, double numero2) {
		double suma=numero1+numero2;
		return suma;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}







