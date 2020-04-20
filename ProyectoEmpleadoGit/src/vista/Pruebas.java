package vista;

import controlador.Departamento;
import modelo.ConexionDao;
import modelo.DepartamentoDao;

public class Pruebas {

	public static void main(String[] args) {
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
