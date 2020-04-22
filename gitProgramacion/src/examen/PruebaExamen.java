package examen;

import java.util.ArrayList;

import examen.Hora;

public class PruebaExamen {
	
	public static void main(String[] args) {
		double puntuacion=0;
		boolean correcto=true;
		
		
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
		// ToString
		System.out.println("Se deberán imprimir los datos del objeto a continuacion");
		
		
	
		
		
		
		

		 

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
				abaco.suma(abaco2);
				
				if(abaco.getUnidades()!=1){
					correcto=false;
				}
				if(abaco.getDecenas()!=2){
					correcto=false;
				}
				if(abaco.getCentenas()!=2){
					correcto=false;
				}
				if(abaco.getUnidMillar()!=2){
					correcto=false;
				}
				if(correcto){
					System.out.println("Suma correcto +1");
					puntuacion+=1;
				}else{
					System.out.println("Suma incorrecto");
				}
				
				
			
				
				
		
			
				
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
				
				
				
				
		
		
		
		
		
			/**	
				
				
				correcto=true;
				abaco = new Abaco();
				abaco.setUnidades(1);
				abaco.setDecenas(2);
				abaco.setCentenas(3);
				abaco.setUnidMillar(4);
				
				abaco2 = abaco.copia();
				
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
				
				
				**/
				
				
				
				
				
				
				
				correcto=true;
				abaco = new Abaco();
				abaco.setUnidades(1);
				abaco.setDecenas(2);
				abaco.setCentenas(3);
				abaco.setUnidMillar(4);
				
				abaco2.setUnidades(1);
				abaco2.setDecenas(2);
				abaco2.setCentenas(3);
				abaco2.setUnidMillar(4);
				
				if (abaco.igual(abaco2)){
					correcto=true;
				}
				if(correcto){
					System.out.println("Igual correcto +0.5");
					puntuacion+=0.5;
				}else{
					System.out.println("Igual incorrecto");
				}
				
		
		System.out.println("Nombre del alumno");
		System.out.println("Nota sobre : " + puntuacion);
		System.out.println("observaciones del alumno");
		
		
		
		
		ArrayList<Hora> horas= new ArrayList<Hora>();
		Hora h1= new Hora (10, 10, 10);
		Hora h2=new Hora(05, 05, 05);
		Hora h3=new Hora(01, 01, 01);
		
		horas.add(h1);
		horas.add(h2);
		horas.add(h3);

		Hora h4= new Hora();
		h4.leer();
		
		horas.add(h4);
		
		int i, suma=0;
		for(i=0;i<horas.size(); i++) {
			suma+=horas.get(i).getHoras();	
		}
		System.out.println("El total de las horas contenidas es " + suma);
		
		
		for(Hora h: horas) {
			System.out.println("Los segundos transcurridos son: " + h.aSegundos());
		}
		
		
		int sum;
		for(i=0; i<horas.size(); i++) {
			sum=0;
			sum=horas.get(i).getHoras()+horas.get(i).getMinutos()+horas.get(i).getSegundos();
			if(sum>20) {
				System.out.println(horas.get(i));
			}
		
		}

	}

}
