package ejemplos;
public class Condiciones{
	public static void main(String[] args){
		boolean a = true, b=false, c=true;
		int num1=10, num2=20;
		
		//Estructura condicional "if". Se ejecutará el codigo si se cumple la condicional
		if(a==c){
			System.out.println("Correcto");
		}
		if(num1>num2){
			System.out.println(num1 + " es mayor que " + num2);
		}
		
		if(num1==10) {
			System.out.println("El numero 1 es = 10");
		}else {
			System.out.println("El numero 1 es distinto de 10.");
		}
	
	
	
	}



}