package ejemplos;

public class Bucles {

	public static void main(String[] args) {
		int i=0;
		//Va a entrar en el while mientras se cumpla la condici�n i<10
		//Bucle en el que se entra de 0 a N veces
		while(i<10) {
			System.out.println("Hola mundo!" + i);
			//Aumentamos i en 1 para que en alg�n momento se deje de cumplir la condici�n.
			i++;
		}
		//do-while: Bucle en el que se entra de 1 a N veces xq la condici�n se evalua al final
		do {
			System.out.println("Entro en el do while.");
			i--;
		}while(i>0);
		
		//FOR; Igual que un while, pero la inicializaci�n y el incremento van en la propia estructura
		for(int j=0; j<10;j++) {
			System.out.println("Valor de j: " + j);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
