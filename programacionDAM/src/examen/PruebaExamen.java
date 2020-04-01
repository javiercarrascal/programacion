package examen;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaExamen {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double puntuacion=0;
		boolean correcto=true;

		// Getters, Setters y constructor vacío.
		
		Abaco abaco2;
		abaco2=new Abaco();	
		Abaco abaco = new Abaco();
		abaco.setUnidades(1);
		abaco.setDecenas(2);
		abaco.setCentenas(3);
		abaco.setUnidMillar(4);
		
		if(abaco.getUnidades()!=1){
			correcto=false;
		}
		if(abaco.getDecenas()!=2){
			correcto=false;
		}
		if(abaco.getCentenas()!=3){
			correcto=false;
		}
		if(abaco.getUnidMillar()!=4){
			correcto=false;
		}
		if(correcto){
			System.out.println("getters y setters correctos +1 punto");
			puntuacion +=1;
		}else{
			System.out.println("getters y setters incorrectos");
		}
		
		
		/**FIN GETTERS Y SETTERS**/
		
		
		
		//CONSTRUCTOR PARAMETROS + VALIDA . (1.5 punto)
		
		correcto=true;
		abaco = new Abaco(4,3,2,1);
		if(abaco.getUnidades()!=4){
			correcto=false;
		}
		if(abaco.getDecenas()!=3){
			correcto=false;
		}
		if(abaco.getCentenas()!=2){
			correcto=false;
		}
		if(abaco.getUnidMillar()!=1){
			correcto=false;
		}
		abaco = new Abaco(11,3,2,1);
		if(abaco.getUnidades()!=0||abaco.getDecenas()!=0||abaco.getCentenas()!=0||abaco.getUnidMillar()!=0){
			correcto=false;
		}
		if(correcto){
			System.out.println("Constructor 4 parametros y valida correcto +1");
			puntuacion+=1;
		}else{
			System.out.println("Constructor 4 parametros y valida incorrecto");
		}
		
		
		/** FIN CONSTRUCTOR PARAMETROS + VALIDA*/
		
		
		//CONSTRUCTOR 1 PARAMETRO
		  

		correcto=true;
		abaco = new Abaco(4321);
		if(abaco.getUnidades()!=1){
			correcto=false;
		}
		if(abaco.getDecenas()!=2){
			correcto=false;
		}
		if(abaco.getCentenas()!=3){
			correcto=false;
		}
		if(abaco.getUnidMillar()!=4){
			correcto=false;
		}
		abaco = new Abaco(1000000);
		if(abaco.getUnidades()!=0||abaco.getDecenas()!=0||abaco.getCentenas()!=0||abaco.getUnidMillar()!=0){
			correcto=false;
		}
		if(correcto){
			System.out.println("Constructor 1 parametro correcto +0.5");
			puntuacion+=0.5;
		}else{
			System.out.println("Constructor 1 parametro incorrecto");
		}
		
		//FIN CONSTRUCTOR 1 PARAMETRO*/
		
		
		
		
		// PEDIR DATOS
		 
		 
		System.out.println("Introduce los datos 5,6,7,8");
		correcto=true;
		abaco.pedirDatos();
		if(abaco.getUnidades()!=5){
			correcto=false;
		}
		if(abaco.getDecenas()!=6){
			correcto=false;
		}
		if(abaco.getCentenas()!=7){
			correcto=false;
		}
		if(abaco.getUnidMillar()!=8){
			correcto=false;
		}
		if(correcto){
			System.out.println("Pedir datos correcto +0.5");
			puntuacion+=0.5;
		}else{
			System.out.println("Pedir datos incorrecto");
		}
	
		/**FIN PEDIR DATOS*/
		
		
		
		
		//SIGUIENTE
		 

		correcto=true;
		abaco = new Abaco();
		abaco.setUnidades(9);
		abaco.setDecenas(9);
		abaco.setCentenas(9);
		abaco.setUnidMillar(8);
		
		abaco.siguiente();
		
		if(abaco.getUnidades()!=0){
			correcto=false;
		}
		if(abaco.getDecenas()!=0){
			correcto=false;
		}
		if(abaco.getCentenas()!=0){
			correcto=false;
		}
		if(abaco.getUnidMillar()!=9){
			correcto=false;
		}
		if(correcto){
			System.out.println("Siguiente correcto +0.5");
			puntuacion+=0.5;
		}else{
			System.out.println("Siguiente incorrecto");
		}
		
		
		/**FIN SIGUIENTE**/
		
		
		
		/**ANTERIOR 
		
				correcto=true;
				abaco = new Abaco();
				abaco.setUnidades(0);
				abaco.setDecenas(0);
				abaco.setCentenas(0);
				abaco.setUnidMillar(9);
				abaco.anterior();
				if(abaco.getUnidades()!=9){
					correcto=false;
				}
				if(abaco.getDecenas()!=9){
					correcto=false;
				}
				if(abaco.getCentenas()!=9){
					correcto=false;
				}
				if(abaco.getUnidMillar()!=8){
					correcto=false;
				}
				if(correcto){
					System.out.println("Anterior correcto +0.5");
					puntuacion+=0.5;
				}else{
					System.out.println("Anterior incorrecto");
				}
		
		
		//FIN ANTERIOR*/
		
		
		
				
		
			/** RESTA 
				
				correcto=true;
				abaco = new Abaco();
				abaco.setUnidades(5);
				abaco.setDecenas(5);
				abaco.setCentenas(5);
				abaco.setUnidMillar(5);
				
				abaco2 = new Abaco();
				abaco2.setUnidades(6);
				abaco2.setDecenas(6);
				abaco2.setCentenas(6);
				abaco2.setUnidMillar(6);
				abaco.resta(abaco2);
				
				if(abaco.getUnidades()!=1){
					correcto=false;
				}
				if(abaco.getDecenas()!=1){
					correcto=false;
				}
				if(abaco.getCentenas()!=1){
					correcto=false;
				}
				if(abaco.getUnidMillar()!=1){
					correcto=false;
				}
				if(correcto){
					System.out.println("Resta correcto +1");
					puntuacion+=1;
				}else{
					System.out.println("Resta - 1 incorrecto");
				}
				
				
				
			FIN RESTA*/	
		
		
		
		
		
		
			/**MULTIPLICA	
				
				correcto=true;
				abaco = new Abaco();
				abaco.setUnidades(5);
				abaco.setDecenas(5);
				abaco.setCentenas(5);
				abaco.setUnidMillar(5);
				
				abaco2 = new Abaco();
				abaco2.setUnidades(6);
				abaco2.setDecenas(6);
				abaco2.setCentenas(6);
				abaco2.setUnidMillar(6);
				abaco.multiplica(abaco2);
				
				if(abaco.getUnidades()!=0){
					correcto=false;
				}
				if(abaco.getDecenas()!=3){
					correcto=false;
				}
				if(abaco.getCentenas()!=6){
					correcto=false;
				}
				if(abaco.getUnidMillar()!=9){
					correcto=false;
				}
				if(correcto){
					System.out.println("Multiplica correcto +0.5");
					puntuacion+=0.5;
				}else{
					System.out.println("Multiplica incorrecto");
				}
				
				
				
				FIN MULTIPLICA*/
		
		
		
		
		
				
				/**COPIA
				
				correcto=true;
				abaco = new Abaco();
				abaco.setUnidades(1);
				abaco.setDecenas(2);
				abaco.setCentenas(3);
				abaco.setUnidMillar(4);
				
				abaco2 = new Abaco(abaco);
				
				if(abaco2.getUnidades()!=1){
					correcto=false;
				}
				if(abaco2.getDecenas()!=2){
					correcto=false;
				}
				if(abaco2.getCentenas()!=3){
					correcto=false;
				}
				if(abaco2.getUnidMillar()!=4){
					correcto=false;
				}
				if(correcto){
					System.out.println("Copia correcto +0.5");
					puntuacion+=0.5;
				}else{
					System.out.println("Copia incorrecto");
				}
				
				
				FIN COPIA**/
				
				
				
				
				
				
	
		
		System.out.println("Nombre del alumno");
		System.out.println("Nota sobre : " + puntuacion);
		System.out.println("observaciones del alumno");
		
		
		//con la clase hora
				ArrayList<Hora> horas = new ArrayList<Hora>();
				Hora h = new Hora(10,10,10);
				Hora h2 = new Hora(5,5,5);
				Hora h3 = new Hora(1,1,1);
				horas.add(h);
				horas.add(h2);
				horas.add(h3);
				
				
		
		System.out.println("Horas: ");
		int hora=sc.nextInt();
		System.out.println("minutos: ");
		int minutos=sc.nextInt();
		System.out.println("segundos: ");
		int segundos=sc.nextInt();
		
		Hora h4 = new Hora(hora,minutos,segundos);
		horas.add(h4);
		
		int total=0;
		for(int i=0;i<horas.size();i++) {
			horas.get(i).getHoras();
			
		}
			
		
		
		
	}

}
