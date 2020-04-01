package objetos.ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		Persona p1= new Persona();
		p1.setNombre("pepe");
		p1.setApellidos("perez gonzalez");
		p1.setAnioNacimiento(1984);
		p1.setMesNacimiento(6);
		p1.setDiaNacimiento(29);
		p1.setSexo('m');
		p1.saludar();
		p1.mostrarEdad();

	}

}
