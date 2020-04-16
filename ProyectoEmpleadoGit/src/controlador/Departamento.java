package controlador;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Departamento {
private int numero;
private String nombre;
private String localidad;
private ArrayList <Empleado> empleados= new ArrayList <Empleado>();

	public Departamento(){ //Se utiliza para pedir datos 1 a 1
		this.empleados = new ArrayList <Empleado>();
	}
	public Departamento(int numero, String nombre, String localizacion){ // Pedir datos 1 a 1
		this.numero = numero;
		this.nombre = nombre;
		this.localidad = localizacion;
	}	
	public Departamento(int numero, String nombre, String localizacion, ArrayList<Empleado> empleados){
		this.numero = numero;
		this.nombre = nombre;
		this.localidad = localizacion;
		this.empleados = empleados;
	}

public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getLocalizacion() {
	return localidad;
}
public void setLocalizacion(String localizacion) {
	this.localidad = localizacion;
}
public ArrayList<Empleado> getEmpleados() {
	return empleados;
}
public void setEmpleados(ArrayList<Empleado> empleados) {
	this.empleados = empleados;
}


@Override
public String toString(){
	return "Departamento [numero= " + this.numero + ", nombre= " +
			this.nombre + ", localizacion= " +this.localidad + "]";
}

public void pedirDatos(){
	boolean correcto=false;
	do{
		try{
			Scanner pk = new Scanner(System.in);
			System.out.println("Introduzca el nombre del departamento ");
			this.nombre = pk.nextLine();
			System.out.println("Introduzca la localizacion del departamento ");
			this.localidad = pk.nextLine();
			correcto=true;
		} catch(InputMismatchException e){
			System.out.println("Introduzca el valor correctamente");
		}
	}while (!correcto);

}


}
