package ejemplos;

public class Bucles {

	public static void main(String[] args) {
		int i=0;
		//Va a entrar en el while mientras se cumpla la condición i<10
		//Bucle en el que se entra de 0 a N veces
		while(i<10) {
			System.out.println("Hola mundo!" + i);
			//Aumentamos i en 1 para que en algún momento se deje de cumplir la condición.
			i++;
		}
		//do-while: Bucle en el que se entra de 1 a N veces xq la condición se evalua al final
		do {
			System.out.println("Entro en el do while.");
			i--;
		}while(i>0);
		
		//FOR; Igual que un while, pero la inicialización y el incremento van en la propia estructura
		for(int j=0; j<10;j++) {
			System.out.println("Valor de j: " + j);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
