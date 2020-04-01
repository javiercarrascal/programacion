package objetos.domino;

public class Pieza {
	private int num1;
	private int num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public Pieza(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public String toString() {
		return "[" + this.num1 + "|" + this.num2 + "]";
	}
	//Giro la pieza
		public void girar() {
			int aux=num1;
			num1=num2;
			num2=aux;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
