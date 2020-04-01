package examen;

import java.util.Scanner;
import java.util.ArrayList;

public class Abaco {
	Scanner sc = new Scanner (System.in);
	private int unidades;
	

	private int decenas;
	private int centenas;
	private int unidMillar;
	
	public Abaco() {
		this.unidades=0;
		this.decenas=0;
		this.centenas=0;
		this.unidMillar=0;
	}
	
	private void valida() {
		if((this.unidades<0 || this.unidades>9) || (this.decenas<0 || this.decenas>9) || (this.centenas<0 || this.centenas>9) ||
				(this.unidMillar<0 || this.unidMillar>9)) {
			this.unidades=0;
			this.decenas=0;
			this.centenas=0;
			this.unidMillar=0;
		}
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
	public Abaco(int unidad, int decena, int centena, int unidMillar) {
		this.unidades=unidad;
		this.decenas=decena;
		this.centenas=centena;
		this.unidMillar=unidMillar;
	}
	public Abaco(int parametro) {
		ArrayList<Abaco> abaco= new ArrayList<Abaco>();
		for(int i=0; i<parametro;i++) {
			
		}
	}
	
	
	public void pedirDatos() {
		System.out.println("UnidadeS: ");
		this.unidades=sc.nextInt();
		System.out.println("decenas: ");
		this.decenas=sc.nextInt();
		System.out.println("centenas: ");
		this.centenas=sc.nextInt();
		System.out.println("UnidMillar: ");
		this.unidMillar=sc.nextInt();
		valida();
	}

	public String toString() {
		return "Abaco [unidades=" + this.unidades + ", decenas=" + this.decenas + ", centenas=" + this.centenas + ", unidMillar="
				+ this.unidMillar + "]";
	}
	
	public int siguiente() {
		this.unidades++;
		if(this.unidades>9) {
			this.unidades=0;
			this.decenas++;
			if(this.decenas>9) {
				this.decenas=0;
				this.centenas++;
				if(this.centenas>9) {
					this.centenas=0;
					this.unidMillar++;
				}
			}
		}
		valida();
		return this.unidades;
	}
	public void anterior() {
		this.unidades--;
		if(this.unidades==-1){
			this.unidades=0;
			this.decenas--;
			if(this.decenas==-1) {
				this.decenas=0;
				this.centenas--;
				if(this.centenas==-1) {
					this.centenas=0;
					this.unidMillar--;
				}
			}
		}
		valida();
	}

	public void suma(Abaco abaco2) {
		int total=(abaco.unidades + abaco2.unidades) + (abaco.decenas + abaco2.decenas) + 
				(abaco.centenas + abaco2.centenas) + (abaco.unidMillar + abaco2.unidMillar);
		
	}
	public void resta(Abaco abaco2) {
		int total=(abaco.unidades - abaco2.unidades) - (abaco.decenas - abaco2.decenas)-
				(abaco.centenas - abaco2.centenas) - (abaco.unidMillar - abaco2.unidMillar);
		
	}
	public void multi(Abaco abaco2) {
		int total=(abaco.unidades * abaco2.unidades) * (abaco.decenas * abaco2.decenas) *
				(abaco.centenas * abaco2.centenas) * (abaco.unidMillar * abaco2.unidMillar);
		
	}
	public Abaco copia() {
		Abaco a = new Abaco(this.unidades,this.decenas,this.centenas,this.unidMillar);
		return a;
	}
	Abaco abaco = new Abaco(4,3,2,1);
	public boolean igualQue(Abaco abaco2) {
		if(abaco2.toString()==abaco.toString()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
