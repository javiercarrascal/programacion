package objetos.ejercicio1;

public class Persona {
	private String nombre;
	private String apellidos;
	private int anioNacimiento;
	private int mesNacimiento;
	private int diaNacimiento;
	private char sexo;
	
	
	
	public void saludar() {
		System.out.println("Hola, soy " + this.nombre + " " + this.apellidos + " y nací el " 
				+ this.diaNacimiento + "/" +this.mesNacimiento + "/"+ this.anioNacimiento );
	}
	public void mostrarEdad() {
		System.out.println("En la actualidad tengo " + this.getEdad() + " años");
	}
	public int getEdad() {
		return (2020-this.anioNacimiento);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre.length()<3) {
			this.nombre="sin especificar";
		}else {
			this.nombre = convertirMayuscula(nombre);
		}
	}
	
	private String convertirMayuscula(String palabra) {
		String letra=palabra.substring(0,1).toUpperCase();
		palabra=letra+palabra.substring(1);
		return palabra;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		String[] arrayApellidos=apellidos.split(" ");
		String cadenaApellidos="";
		for(int i=0; i<arrayApellidos.length;i++) {
			cadenaApellidos+=convertirMayuscula(arrayApellidos[i]) + " ";
		}
		this.apellidos=cadenaApellidos;
	}
	
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		if(anioNacimiento>1900 && anioNacimiento<2020) {
			this.anioNacimiento = anioNacimiento;
		}else {
			this.anioNacimiento=2000;
		}
	}
	public int getMesNacimiento() {
		return mesNacimiento;
	}
	public void setMesNacimiento(int mesNacimiento) {
		if(mesNacimiento>0 && mesNacimiento <=12) {
			this.mesNacimiento = mesNacimiento;
		}else {
			this.mesNacimiento=1;
		}
	}
	public int getDiaNacimiento() {
		return diaNacimiento;
	}
	public void setDiaNacimiento(int diaNacimiento) {
		if(diaNacimiento>0 && diaNacimiento<=31) {	
		this.diaNacimiento = diaNacimiento;
		}else {
			this.diaNacimiento=1;
		}
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	

}
