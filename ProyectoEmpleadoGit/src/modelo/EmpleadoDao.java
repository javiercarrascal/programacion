package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controlador.Departamento;
import controlador.Empleado;
import utilidades.Utilidades;
public class EmpleadoDao {
	private static Connection conexion;
	public static Connection getConexion() {
		return conexion;
	}
	public static void setConexion(Connection conexion) {
		EmpleadoDao.conexion = conexion;
	}
	public static int insertar(Empleado emple){
		try{
			PreparedStatement stmt = conexion.prepareStatement
				("insert into empleados (numero, apellidos, oficio, codigo_postal, fecha_alta, "
						+ "salario, comision) values(?,?,?,?,?,?,?)");
			stmt.setInt(1, emple.getNumero());
			stmt.setString(2, emple.getApellidos());
			stmt.setString(3, emple.getOficio());
			stmt.setInt(4, emple.getDireccion());
			/**
			 * Tenemos una fechaAlta en el objeto empleado que es de tipo java.util.Date
			 * Por otro lado tenemos una fecha_alta en BBDD que es de tipo sql.TimeStamp
			 * para guardar en bbdd tenemos que transformar de una a otra
			 */
			stmt.setTimestamp(5, Utilidades.parsearFechaSQL(emple.getFechaAlta()));
			stmt.setInt(6, emple.getSalario());
			stmt.setInt(7, emple.getComision());
			//Devuelvo el numero de filas que han sido modificadas
			return stmt.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
			System.out.println("Fallo al insertar empleado.");
			return -1;
		}
	}
		
	
	

}



