package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controlador.Departamento;

public class DepartamentoDao {
	public static Connection conexion;
	
	public DepartamentoDao(Connection conexion) {
		this.conexion=conexion;
	}
	
	//Devuelve el numero de filas afectadas por el select
	public static int insertar(Departamento depart){
		try{
			//1 interrogacion: numero
			//2 interrogacion:nombre
			//3 interrogacion: localidad
			PreparedStatement stmt = conexion.prepareStatement
					("insert into departamentos (numero, nombre, localidad) values(?,?,?)");
			
			//Ahora sustituimos las interrogaciones por el contenido del objeto depart
			stmt.setInt(1, depart.getNumero());
			stmt.setString(2, depart.getNombre());
			stmt.setString(3, depart.getLocalidad());
			
			//ExecuteUpdate cuando quiero realizar una modificacion en la bbdd
			return stmt.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
			return -1;
		}
	}


	
	
	
	
	
	
	
	
	
}
