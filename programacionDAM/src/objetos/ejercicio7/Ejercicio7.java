package objetos.ejercicio7;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		Hora h1= new Hora(1,1,1);
		h1.print();
		System.out.println(h1.aSegundos());
		h1.deSegundos(10000);
		h1.print();
		Hora h2= new Hora(10,10,10);
		if(h1.mayorQue(h2)) {
			System.out.println("H1 > H2");
		}else {
			System.out.println("H1 < H2");
		}
		Hora h3=h1.copia();
		
		System.out.println(h3.hashCode());

	}

}
