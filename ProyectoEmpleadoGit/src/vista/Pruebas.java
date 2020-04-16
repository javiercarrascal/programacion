package vista;

import modelo.ConexionDao;
import modelo.DepartamentoDao;

public class Pruebas {

	public static void main(String[] args) {
		ConexionDao conDao = new ConexionDao();
		DepartamentoDao depDao= new DepartamentoDao(conDao.getConexion());
	}

}
