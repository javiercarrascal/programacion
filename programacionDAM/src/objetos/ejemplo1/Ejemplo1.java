package objetos.ejemplo1;

public class Ejemplo1 {

	public static void main(String[] args) {
		//Creacion de un objeto llamado coche1 a partir de la clase Coche
		Coche coche1= new Coche();
		//Para acceder a los atributos o a los metodos de una clase se utiliza el punto "."
		coche1.setColor("rojo"); 
		coche1.setMarca("Fiat");
		coche1.setModelo("Panda");
		coche1.setPotencia(110);
		coche1.setMatricula("1111AA");
		coche1.vender();
		
		Coche coche2= new Coche("1111AAA", "Astra", "Negro", 110, "Opel");
		System.out.println(coche2.getMatricula());
		Coche coche3= new Coche(coche1);
		
		System.out.println(coche3);
		
	}

}











