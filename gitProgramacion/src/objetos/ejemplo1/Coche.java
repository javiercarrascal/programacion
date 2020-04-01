package objetos.ejemplo1;

public class Coche {
	//Primero ponemos los atributos de la clase indicando su visibilidad y tipo
	private int potencia;
	private String marca;
	private String modelo;
	private String matricula;
	private String color;
	
	//Un constructor siempre tiene que ser público
	//Un constructor no devuelve nada, ni siquiera "void"
	//El constructor se llama exactamente igual que la clase, incluídas mayúsculas
	//Puede recibir tantos argumentos como nos interese
	public Coche(int potencia, String marca, String modelo, String matricula, String color) {
		this.potencia=potencia;
		this.color=color;
		this.marca=marca;
		this.setMatricula(matricula);
		this.modelo=modelo;
	}
	//El constructor vacío o constructor por defecto solo crea el objeto vacío.
	public Coche() {};
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setColor(String color) {
		this.color=color;
	}
	public void setPotencia(int potencia) {
		this.potencia=potencia;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public void setMatricula(String matricula) {
		if(matricula.length()<7) {
			this.matricula="Sin especificar";
		}else {
			this.matricula=matricula;
		}
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	public void vender() {
		System.out.println("El coche con matricula " + matricula + " se ha vendido.");
	}
	public int getPotencia() {
		return potencia;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getColor() {
		return color;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
