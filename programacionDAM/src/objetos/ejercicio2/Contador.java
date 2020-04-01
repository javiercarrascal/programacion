package objetos.ejercicio2;

public class Contador {
	private int cont;
	
	public Contador() {}
	
	public Contador(int cont) {
		this.setCont(cont);
	}
	public int getCont() {
		return this.cont;
	}
	public void setCont(int cont) {
		if(cont<0) {
			this.cont=0;
		}else {
			this.cont=cont;
		}
	}
	public void incrementar() {
		this.cont++;
	}
	public void decrementar() {
		this.cont--;
		if(this.cont<0) {
			this.cont=0;
		}
	}
	
	public Contador(Contador contador2) {
		this.cont=contador2.cont;
	}
	
	
	
	
	
	
}















