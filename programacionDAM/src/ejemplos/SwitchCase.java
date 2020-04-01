package ejemplos;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		//El switch es una estructura condicional que nos permite elegir entre varias opciones
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el día de la semana en formato numérico: ");
		int dia=sc.nextInt();
		switch(dia) {
			case 1:	System.out.println("Lunes.");
				break;
			case 2: System.out.println("Martes.");
				break;
			case 3: System.out.println("Miercoles.");
				break;
			case 4: System.out.println("Jueves.");
				break;
			case 5: System.out.println("Viernes.");
				break;
			case 6: System.out.println("Sabado.");
				break;
			case 7: System.out.println("Domingo.");
				break;
			default: System.out.println("Dia de la semana incorrecto.");
				break;
		}

	}

}
