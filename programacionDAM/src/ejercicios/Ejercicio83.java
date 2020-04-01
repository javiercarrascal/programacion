package ejercicios;

public class Ejercicio83 {

	public static void main(String[] args) {
		double porcentaje=analizarFrase("el perro de san roque no tiene rabo");
		System.out.println(porcentaje);

	}
	public static double analizarFrase(String frase) {
		String[] palabras=frase.split(" ");
		int contadorMenores=0;
		for(int i=0;i<palabras.length;i++) {
			if(palabras[i].length()<5) {
				contadorMenores++;
			}
		}
		double porcentaje=contadorMenores*100/palabras.length;
		//Para dejar el numero con 2 decimales lo multiplico por 100
		//Luego me quedo solo con la parte entera y vuelvo a dividirlo entre 100
		int porcentajeEntero=(int)(porcentaje*100);
		porcentaje=porcentajeEntero/100;
		return porcentaje;
	}

}













