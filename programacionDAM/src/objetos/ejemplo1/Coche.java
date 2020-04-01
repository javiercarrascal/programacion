package objetos.ejemplo1;

public class Coche {
	private String matricula;
	private String modelo;
	private String color;
	private int potencia;
	private String marca;
	
	//Un constructor siempre es público
	//Un constructor no puede devolver nada, ni siquiera "void"
	//El nombre del constructor tiene que ser el mismo que el de la clase
	//Este es un constructor con todos los atributos de la clase
	public Coche (String matricula, String modelo, String color, int potencia, String marca) {
		this.setMatricula(matricula);
		this.modelo=modelo;
		this.color=color;
		this.potencia=potencia;
		this.marca=marca;
	}
	
	public Coche() {}
	
	public void setMatricula(String matricula) {
		if(matricula.length()==7) {
			this.matricula=matricula;
		}else {
			this.matricula="Sin especificar";
		}
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setPotencia(int potencia) {
		this.potencia=potencia;
	}

	
	public void vender() {
		System.out.println("Se ha vendido el coche con matricula " + matricula);
	}
	public String getMatricula() {
		return matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public String getColor() {
		return color;
	}
	public int getPotencia() {
		return potencia;
	}

	public String getMarca() {
		return marca;
	}
	
	//El constructor copia me sirve para crear un objeto copianto los datos de otro del mismo tipo
		public Coche(Coche coche2) {
			this.color=coche2.color;
			this.potencia=coche2.potencia;
			this.marca=coche2.marca;
			this.matricula=coche2.matricula;
			this.modelo=coche2.modelo;
		}
		
		//El toString transforma el objeto en un String y lo devuelve
		public String toString() {
			String cadena= "Matricula: " + this.matricula + ", Marca: " + this.marca + ", Color: " 
						+ this.color + ", Modelo: " + this.modelo + ", Potencia: " + this.potencia;
			return cadena;
		}
		
		
}
