package objetos.excepciones;

public class Ejemplo5 {

	public static void main(String[] args){
		try {
			//Lanzo una excepcion con el mensaje "hola mundo"
			throw new Exception("Hola mundo");
			
		}catch(Exception e) {
			System.out.println("Llega al catch");
			System.out.println(e.getMessage());

		}

	}

}
