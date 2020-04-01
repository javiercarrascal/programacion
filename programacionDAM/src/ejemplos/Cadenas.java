package ejemplos;
import java.util.Scanner;
public class Cadenas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//La clase que vamos a utilizar para guardar una cadena de caracteres es STRING
		String texto = "El perro de san roque no tiene rabo.";
		System.out.println("Introduce un texto: ");
		texto=sc.nextLine();
		//Para sacar el caracter de una posición determinada utilizamos CHARAT(NUM)
		char caracter=texto.charAt(5);
		System.out.println("El caracter que hay en la posición 5 es: " + caracter);
		//Para obtener la longitud de un String utilizamos el .LENGTH()
		int longitud=texto.length();
		System.out.println("La longitud del texto introducido es: " + longitud);
		//Accedo a la ultima letra de lo que ha introducido el usuario
		System.out.println("Ultima letra " + texto.charAt(longitud-1));
		//Para recorrer el texto caracter a caracter puedo usar un for desde 0 hasta la longitud
		for(int i=0;i<longitud;i++) {
			System.out.println(texto.charAt(i));
		}
		//Para concatenar 2 strings usamos el + ò el .concat
		texto=texto+ " adios.";
		texto=texto.concat(" agur.");
		System.out.println(texto);
		//Para comparar 2 textos utilizo el compareTo
		String texto2="El caballo blanco de santiago";
		//El compareTo compara 2 textos y devuelve 0 en caso de que sean exactamente iguales
		int resultado=texto.compareTo(texto2);
		System.out.println("El resultado de la comparacion es: " + resultado);
		//Para comparar 2 textos sin que importen mayusculas y minudculas:equalsignorecase
		boolean iguales=texto.equalsIgnoreCase(texto2);
		//Para comparar 2 cadenas y obtener true o false se usa el .equals
		iguales=texto.equals(texto2);
		System.out.println("Valor de iguales: " + iguales);
		//Para extraer una subcadena de texto utilizamos el substring
		//Se obtiene la cadena que se encuentra entre el primer numero(incluido) y el 2º(no incluido)
		String sub = texto2.substring(0,5);
		System.out.println("resultado del substring" + sub);
		//Para obtener un texto todo en minusculas utilizamos el toLowerCase()
		String mins=texto2.toLowerCase();
		//Para obtener un texto todo en mayusculas utilizamos el toUpperCase()
		String mays=texto2.toUpperCase();
		System.out.println(mins);
		System.out.println(mays);
		//Para encontrar la ultima posición de un caracter en una cadena utilizamos lastIndexOf()
		int posicion = texto.lastIndexOf('a');
		//Para saber si una cadena termina con otra usamos endsWith (devuelve un boolean)
		boolean termina=texto.endsWith(".txt");
		//Para sustituir un caracter por otro en una cadena utilizamos el replace
		String textoModificado=texto.replace('a', 'A');
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
