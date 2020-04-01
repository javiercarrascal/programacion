package ejercicios;
import java.util.Scanner;

public class Ejercicio4{
	public static void main(String[] args){
		//Creo la variable sc, la cual es un Scanner (para introducir datos)
		Scanner sc = new Scanner(System.in);
		double dineroReducido, ivaReducido,ivaNormal, dineroNormal,ivaCultural, 
			dineroCultural, dineroTotal, ivaTotal;
		System.out.println("Introduce el dinero al que aplicar el iva reducido:");
		//Pido el dato al usuario y lo guardo en la variable dineroReducido.
		dineroReducido=sc.nextDouble();
		
		System.out.println("Introduce el dinero al que aplicar el iva normal:");
		//Pido el dato al usuario y lo guardo en la variable dineroNormal.
		dineroNormal=sc.nextDouble();
		
		System.out.println("Introduce el dinero al que aplicar el iva cultural:");
		//Pido el dato al usuario y lo guardo en la variable dineroCultural.
		dineroCultural=sc.nextDouble();
		
		//Calculo el iva reducido
		ivaReducido=dineroReducido*0.04;
		ivaNormal=dineroNormal*0.21;
		ivaCultural=dineroCultural*0.1;
		//Sumo los ivas para mostrar el total de iva
		ivaTotal=ivaReducido+ivaCultural+ivaNormal;
		
		//Calculo el total de dinero a pagar
		dineroTotal=ivaTotal+dineroReducido+dineroNormal+dineroCultural;
		
		
		System.out.println("El IVA total a pagar es: " + ivaTotal);
		System.out.println("El dinero total a pagar es: " + dineroTotal);
		
	
	}
}