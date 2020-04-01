package objetos.ejercicio7;

import java.util.Scanner;

public class Hora {
	private int horas;
	private int minutos;
	private int segundos;
	public Hora() {
		this.horas=0;
		this.minutos=0;
		this.segundos=0;
	}
	public Hora(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		valida();
	}
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce las horas: ");
		this.horas=sc.nextInt();
		System.out.println("Introduce los minutos: ");
		this.minutos=sc.nextInt();
		System.out.println("Introduce los segundos: ");
		this.segundos=sc.nextInt();
		valida();
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
		valida();
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
		valida();
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
		valida();
	}
	private void valida() {
		if(this.horas<0 || this.horas>23) {
			this.horas=0;
		}
		if(this.minutos<0 || this.minutos>59) {
			this.minutos=0;
		}
		if(this.segundos<0 || this.segundos>59) {
			this.segundos=0;
		}
	}
	public void print() {
		System.out.println((this.horas<10?"0":"") + this.horas + ":"+  (this.minutos<10?"0":"") 
				+ this.minutos  +":"+ (this.segundos<10?"0":"") + this.segundos);
	}
	//Metodo que devuelve el numero de segundos transcurridos desde media noche hasta la hora actual
	public int aSegundos() {
		int segundos=this.horas*3600 + this.minutos*60 + this.segundos;
		return segundos;
	}
	//Metodo que pone la hora actual calculando cuanto ha pasado desde media noche con los segundos 
	//que se le pasan como argumento
	public void deSegundos(int segundos) {
		this.horas=segundos/3600;
		segundos=segundos%3600;
		this.minutos=segundos/60;
		this.segundos=segundos%60;
		valida();
	}
	
	public void siguiente() {
		this.segundos++;
		if(this.segundos==60) {
			this.segundos=0;
			this.minutos++;
			if(this.minutos==60) {
				this.minutos=0;
				this.horas++;
			}
		}
		valida();
	}
	public void anterior() {
		this.segundos--;
		if(this.segundos==-1){
			this.segundos=59;
			this.minutos--;
			if(this.minutos==-1) {
				this.minutos=59;
				this.horas--;
			}
		}
		valida();
	}
	public int segundosDesde(Hora hora2) {
		return(this.aSegundos()-hora2.aSegundos());
	}
	
	
	
	
	
	public boolean igualQue(Hora hora2) {
		if(this.aSegundos()==hora2.aSegundos()) {
			return true;
		}else {
			return false;
		}
	}
	public boolean menorQue(Hora hora2) {
		if(this.aSegundos()<hora2.aSegundos()) {
			return true;
		}else {
			return false;
		}
	}
	public boolean mayorQue(Hora hora2) {
		if(this.aSegundos()>hora2.aSegundos()) {
			return true;
		}else {
			return false;
		}
	}
	
	public Hora copia() {
		Hora h = new Hora(this.horas,this.minutos,this.segundos);
		return h;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
