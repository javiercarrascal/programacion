package objetos.ejemplo1;

public class Ejemplo1 {

	public static void main(String[] args) {
		//Creacion de un objeto llamado coche1 a partir de la clase Coche
		Coche coche1 = new Coche();
		//Para acceder a los atributos o a los metodos de una clase se utiliza el punto "."
		coche1.setColor("Rojo");
		coche1.setMarca("Opel");
		coche1.setMatricula("3349KDL");
		coche1.setPotencia(110);
		coche1.vender();
		System.out.println("El color es " + coche1.getColor());
		
		Coche c2= new Coche(120,"opel", "astra", "3366kkk", "gris");
		System.out.println("El color es " + c2.getColor());
		
		Coche coche3= new Coche(coche1);
		
		System.out.println(coche3);
		
		

	}

}











