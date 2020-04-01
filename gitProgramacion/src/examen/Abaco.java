package examen;

import java.util.Scanner;

public class Abaco {
	private int unidades;
	private int decenas;
	private int centenas;
	private int unidMillar;
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public int getDecenas() {
		return decenas;
	}
	public void setDecenas(int decenas) {
		this.decenas = decenas;
	}
	public int getCentenas() {
		return centenas;
	}
	public void setCentenas(int centenas) {
		this.centenas = centenas;
	}
	public int getUnidMillar() {
		return unidMillar;
	}
	public void setUnidMillar(int unidMillar) {
		this.unidMillar = unidMillar;
	}
	public Abaco() {
		super();
	}
	public Abaco(int unidades, int decenas, int centenas, int unidMillar) {
		super();
		this.unidades = unidades;
		this.decenas = decenas;
		this.centenas = centenas;
		this.unidMillar = unidMillar;
		valida();
	}
	
	private void valida() {
		if(this.unidades<0 || this.unidades>9 ||this.decenas<0 || this.decenas>9 
				||this.centenas<0 || this.centenas>9 ||this.unidMillar<0 || this.unidMillar>9) {
			this.unidades=0;
			this.decenas=0;
			this.centenas=0;
			this.unidMillar=0;
		}
	}
	public Abaco(int numero) {
		this.unidades=numero%10;
		numero/=10;
		this.decenas=numero%10;
		numero/=10;
		this.centenas=numero%10;
		numero/=10;
		this.unidMillar=numero%10;
	}
	
	public void pedirDatos() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce las unidades: ");
		this.unidades=sc.nextInt();
		System.out.println("Introduce las decenas: ");
		this.decenas=sc.nextInt();
		System.out.println("Introduce las centenas: ");
		this.centenas=sc.nextInt();
		System.out.println("Introduce las unidades de millar: ");
		this.unidMillar=sc.nextInt();
	}
	@Override
	public String toString() {
		return "Abaco [unidades=" + unidades + ", decenas=" + decenas + ", centenas=" + centenas + ", unidMillar="
				+ unidMillar + "]";
	}
	public void siguiente() {
		this.unidades++;
		if(this.unidades==10) {
			this.unidades=0;
			this.decenas++;
		}
		if(this.decenas==10) {
			this.decenas=0;
			this.centenas++;
		}
		if(this.centenas==10) {
			this.centenas=0;
			this.unidMillar++;
		}
		if(this.unidMillar==10) {
			this.unidMillar=0;
		}
	}
	public void anterior() {
		this.unidades--;
		if(this.unidades==-1) {
			this.unidades=9;
			this.decenas--;
		}
		if(this.decenas==-1) {
			this.decenas=9;
			this.centenas--;
		}
		if(this.centenas==-1) {
			this.centenas=9;
			this.unidMillar--;
		}
		if(this.unidMillar==-1) {
			this.unidMillar=0;
		}
	}
	
	public void suma(Abaco abaco2) {
		int numero=this.unidMillar*1000+this.centenas*100+this.decenas*10+this.unidades;
		int num2=abaco2.unidMillar*1000+abaco2.centenas*100+abaco2.decenas*10+abaco2.unidades;
		numero+=num2;
		this.unidades=numero%10;
		numero/=10;
		this.decenas=numero%10;
		numero/=10;
		this.centenas=numero%10;
		numero/=10;
		this.unidMillar=numero%10;
		
	}
	public void resta(Abaco abaco2) {
		int numero=this.unidMillar*1000+this.centenas*100+this.decenas*10+this.unidades;
		int num2=abaco2.unidMillar*1000+abaco2.centenas*100+abaco2.decenas*10+abaco2.unidades;
		numero-=num2;
		if(numero<0) {
			numero*=-1;
		}
		this.unidades=numero%10;
		numero/=10;
		this.decenas=numero%10;
		numero/=10;
		this.centenas=numero%10;
		numero/=10;
		this.unidMillar=numero%10;
		
	}
	public void multiplica(Abaco abaco2) {
		int numero=this.unidMillar*1000+this.centenas*100+this.decenas*10+this.unidades;
		int num2=abaco2.unidMillar*1000+abaco2.centenas*100+abaco2.decenas*10+abaco2.unidades;
		numero*=num2;
		this.unidades=numero%10;
		numero/=10;
		this.decenas=numero%10;
		numero/=10;
		this.centenas=numero%10;
		numero/=10;
		this.unidMillar=numero%10;
		
	}
	//Constructor copia (crea un objeto con los datos del otro pasado como parametro)
	public Abaco(Abaco abaco2) {
		this.unidades=abaco2.unidades;
		this.decenas=abaco2.decenas;
		this.centenas=abaco2.centenas;
		this.unidMillar=abaco2.unidMillar;
	}
	//Devuelve un objeto con mis mismos datos
	public Abaco copia() {
		Abaco ab2= new Abaco(this.unidades,this.decenas,this.centenas,this.unidMillar);
		return ab2;
	}
	
	public boolean igual(Abaco abaco2) {
		boolean iguales=true;
		if(this.unidades!=abaco2.unidades || this.decenas!=abaco2.decenas 
				|| this.centenas==abaco2.centenas || this.unidMillar!=abaco2.unidMillar) {
			iguales=false;
		}
		return iguales;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
