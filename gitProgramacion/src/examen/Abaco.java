package examen;

import java.util.Scanner;


public class Abaco {
	
	private int unidades;
	private int decenas;
	private int centenas;
	private int unidMillar;
	
	public Abaco() {
		this.unidades=0;
		this.centenas=0;
		this.decenas=0;
		this.unidMillar=0;
	}

	public Abaco(int unidades, int decenas, int centenas, int unidMillar) {
		this.unidades=unidades;
		this.decenas=decenas;
		this.centenas=centenas;
		this.unidMillar=unidMillar;
		
		valida();
	}
	
	public Abaco(int num) {
		if(num>9999 || num<0) {
			this.unidades=0;
			this.centenas=0;
			this.decenas=0;
			this.unidMillar=0;
		}
		else {
			this.unidades=num%10;
			num=num/10;
			this.decenas=num%10;
			num=num/10;
			this.centenas=num%10;
			num=num/10;
			this.unidMillar=num%10;
		}
	}
	
	
	public Abaco (Abaco a1) {
		Abaco a2= new Abaco();
		a2.unidades=a1.unidades;
		a2.decenas=a1.decenas;
		a2.centenas=a1.centenas;
		a2.unidMillar=a1.unidMillar;
	}
	
	private void valida() {
		if(this.unidades<0 || this.unidades>9 || this.decenas<0 || this.decenas>9 || this.centenas<0 || this.centenas>9 || this.unidMillar<0 || this.unidMillar>9) {
			this.unidades=0;
			this.decenas=0;
			this.centenas=0;
			this.unidMillar=0;
		}
	}
	
	public void pedirDatos() {		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca las unidades");
		this.unidades=sc.nextInt();
		System.out.println("introduzca las decenas");
		this.decenas=sc.nextInt();
		System.out.println("Introduzca las centenas");
		this.centenas=sc.nextInt();
		System.out.println("Introduzca las unidades de millar");
		this.unidMillar=sc.nextInt();
		
		valida();
	}
	
	
	public void siguiente() {
		
		this.unidades+=1;
		if(this.unidades>9) {
			this.unidades=0;
			this.decenas+=1;
		}
		if(this.decenas>9) {
			this.decenas=0;
			this.centenas+=1;
		}
		if(this.centenas>9) {
			this.centenas=0;
			this.unidMillar+=1;
		}
		if(this.unidMillar>9) {
			this.unidMillar=this.unidMillar%10;
		}
	}
	
	
	public void anterior() {
		this.unidades-=1;
		if(this.unidades<0 && this.decenas==0 && this.centenas==0 && this.unidMillar==0) {
			this.unidades=0;
			this.decenas=0;
			this.centenas=0;
			this.unidMillar=0;
		}
		else if(this.unidades<0){
			this.unidades=9;
			this.decenas-=1;
		}
		if(this.decenas<0) {
			this.decenas=9;
			this.centenas-=1;
		}
		if(this.centenas<0) {
			this.centenas=9;
			this.unidMillar-=1;
		}
		if(this.unidMillar<0) {
			this.unidMillar=0;
		}
	}
	
	
	public void suma(Abaco a1) {
		int numero, num2;
		numero=this.unidades+this.decenas*10+this.centenas*100+this.unidMillar*1000;
		num2=a1.unidades+a1.decenas*10+a1.centenas*100+a1.unidMillar*1000;
		
		numero=numero+num2;
		
		this.unidades=numero%10;
		numero=numero/10;
		this.decenas=numero%10;
		numero=numero/10;
		this.centenas=numero%10;
		numero=numero/10;
		this.unidMillar=numero%10;
		
		if(this.unidMillar>9) {
			this.unidMillar=this.unidMillar%10;
		}
	}
	
	
	public void resta(Abaco a1) {
		int numero, num2;
		numero=this.unidades+this.decenas*10+this.centenas*100+this.unidMillar*1000;
		num2=a1.unidades+a1.decenas*10+a1.centenas*100+a1.unidMillar*1000;
		
		numero=numero-num2;
		
		if(numero<0) {
			numero*=-1;
		}
		
		this.unidades=numero%10;
		numero=numero/10;
		this.decenas=numero%10;
		numero=numero/10;
		this.centenas=numero%10;
		numero=numero/10;
		this.unidMillar=numero%10;
		
		if(this.unidMillar>9) {
			this.unidMillar=this.unidMillar%10;
		}
	}
	
	
	public void multiplica(Abaco a1) {
		int numero, num2;
		numero=this.unidades+this.decenas*10+this.centenas*100+this.unidMillar*1000;
		num2=a1.unidades+a1.decenas*10+a1.centenas*100+a1.unidMillar*1000;
		
		numero=numero*num2;
		
		this.unidades=numero%10;
		numero=numero/10;
		this.decenas=numero%10;
		numero=numero/10;
		this.centenas=numero%10;
		numero=numero/10;
		this.unidMillar=numero%10;
		
		if(this.unidMillar>9) {
			this.unidMillar=this.unidMillar%10;
		}
	}
	
	
	public boolean igual(Abaco a1) {
		if(a1.unidades==this.unidades && a1.decenas==this.decenas && a1.centenas==this.centenas && a1.unidMillar==this.unidMillar) {
			return true;
		}
		else return false;
	}
	

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
		valida();
	}

	public int getDecenas() {
		return decenas;
	}

	public void setDecenas(int decenas) {
		this.decenas = decenas;
		valida();
	}

	public int getCentenas() {
		return centenas;
	}

	public void setCentenas(int centenas) {
		this.centenas = centenas;
		valida();
	}

	public int getUnidMillar() {
		return unidMillar;
	}

	public void setUnidMillar(int unidMillar) {
		this.unidMillar = unidMillar;
		valida();
	}

	@Override
	public String toString() {
		return "Abaco [unidades=" + unidades + ", decenas=" + decenas + ", centenas=" + centenas + ", unidMillar="
				+ unidMillar + "]";
	}
		
}
