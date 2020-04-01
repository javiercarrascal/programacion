package ejemplos;

import java.util.Scanner;

public class BanderaEEUU {
	public static void main(String[] args) {
		int columnas=11;
		int filas=9;
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				if(i%2==0) {
					//Pares
					if(j%2==0) {
						System.out.print("*");
					}else {
						System.out.print("  ");
					}
				}else {
					if(j%2!=0) {
						System.out.print("*");
					}else {
						System.out.print("  ");
					}
				}
			}
			for(int j=0;j<30;j++) {
				System.out.print("_");
			}
			
			System.out.println("");
		}
		for(int i=0;i<6;i++) {
				for(int j=0;j<45;j++) {
					System.out.print("_");
				}
			System.out.println();
		}
	}
}
