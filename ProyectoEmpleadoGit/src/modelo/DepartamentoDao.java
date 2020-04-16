package modelo;

import java.sql.Connection;

public class DepartamentoDao {
	public static Connection conexion;
	
	public DepartamentoDao(Connection conexion) {
		this.conexion=conexion;
	}
	

}
