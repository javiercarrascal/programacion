package vista;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import controlador.Departamento;
import controlador.Empleado;
import modelo.ConexionDao;
import modelo.DepartamentoDao;
import modelo.EmpleadoDao;
import utilidades.Utilidades;

public class Pruebas {

	public static void main(String[] args) {
		//Cómo introducir fecha pidiendo¡sela al usuario
		/**
		Scanner sc= new Scanner(System.in);
		boolean correcto=false;
		Date fecha1 = null;
		while(!correcto) {
			try {
				System.out.println("Introduce fecha formato dd/mm/aaaa: ");
				String fechaString = sc.nextLine();
				fecha1 = Utilidades.parsearFechaString(fechaString);
				System.out.println("Fecha creada correctamente");
				correcto=true;
			} catch (ParseException e) {
				System.out.println("Formato de fecha incorrecto");
			}
		}
		Empleado e= new Empleado();
		e.setFechaAlta(fecha1);
		
		**/

		
		
		
		ConexionDao conDao = new ConexionDao();
		DepartamentoDao depDao = new DepartamentoDao(conDao.getConexion());
		EmpleadoDao empDao= new EmpleadoDao(conDao.getConexion());
	
		Departamento depart= new Departamento(1,"Marketing","Sevilla");
		
		depDao.actualizar(depart);
		
		
		try {
			Date fechaLibro= Utilidades.parsearFechaString("29/04/1990");
			
			Empleado emple1= new Empleado(1,"perez", "contable",28008,
					fechaLibro,1000,10);
		
			
			
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		/**
		Departamento depart= new Departamento(2,"administracion","Bilbao");
		int filasAfectadas= DepartamentoDao.insertar(depart);
		if(filasAfectadas==1) {
			System.out.println("Departamento introducido");
		}else {
			System.out.println("Error al insertar departamento.");
		}
	**/
		
		int codigoDepartamento=1;
		Departamento depar=DepartamentoDao.consultaDepartamentoPorNumero(codigoDepartamento);
		
		
		
		System.out.println(depar);
		
		for(Empleado emple:depar.getEmpleados()) {
			
			System.out.println("     " + emple);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
