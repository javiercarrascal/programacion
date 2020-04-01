package objetos.ejercicio5;

import java.util.Scanner;

public class NIF {
	private int numero;
	private char letra;
	public NIF() {
		numero=0;
		this.letra=' ';
	}
	public NIF(int numero) {
		setNumero(numero);
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		char[] letras= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		this.numero = numero;
		int resto=numero%23;
		this.letra=letras[resto];
	}
	public void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el numero de dni: ");
		int numero=sc.nextInt();
		setNumero(numero);
	}
	public void mostrar() {
		String numeroString= String.valueOf(numero);
		for(int i=0;i<8-numeroString.length();i++) {
			System.out.print(0);
		}
		System.out.print(this.numero + "-" + this.letra);
		
	}
	
	
	
	
	
}
