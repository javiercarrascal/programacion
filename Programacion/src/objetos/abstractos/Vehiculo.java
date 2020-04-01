package objetos.abstractos;

public abstract class Vehiculo {  
	public int velocidad=0;  
	abstract public void acelera();  
	public void para() {  
		velocidad=0;  
	} 
} 