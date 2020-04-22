package vista;

import java.text.ParseException;

import controlador.Departamento;
import controlador.Empleado;
import modelo.ConexionDao;
import modelo.DepartamentoDao;
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
		
		Departamento depart= new Departamento(1,"contabilidad","Madrid");
		int filasAfectadas= DepartamentoDao.insertar(depart);
		if(filasAfectadas==1) {
			System.out.println("Departamento introducido");
		}else {
			System.out.println("Error al insertar departamento.");
		}
	
		
		
		
		
		
		
		//DepartamentoDao depDao= new DepartamentoDao(conDao.getConexion());
	}

}
