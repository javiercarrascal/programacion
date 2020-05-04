package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import controlador.Departamento;
import controlador.Empleado;
import utilidades.Utilidades;
public class EmpleadoDao {
	private static Connection conexion;
	
	public EmpleadoDao(Connection conexion) {
		this.conexion=conexion;
	}
	
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
	
	//Metodo que consulta los empleados de la bbdd y devuelve todos
	static public ArrayList<Empleado> consultaEmpleados(){
		//Creo el arrayList de empleados donde los ire guardando 
		ArrayList<Empleado> aEmpleados = new ArrayList<Empleado>();
		try{
			Statement st=conexion.createStatement();
			//ResultSet: tipo de dato donde se recoge lo que venga de la tabla
			ResultSet rs=st.executeQuery("SELECT * FROM empleados");
			//Automaticamente se coloca en la posicion 0
			//rs.next() devuelve true si hay algo en la siguiente posicion
			while(rs.next()){
				//Entre comillas va EL NOMBRE DE LA COLUMNA EN LA BBDD
				int numero=rs.getInt("numero");;
				String apellidos=rs.getString("apellidos");
				String oficio = rs.getString("oficio");
				int direccion = rs.getInt("codigo_postal");
				Date fechaAlta =  rs.getDate("fecha_alta");
				int salario = rs.getInt("salario");
				int comision = rs.getInt("comision");
				Empleado emple= new Empleado(numero, apellidos, oficio, direccion, fechaAlta,
						salario, comision);
				//Guardo en el array de departamentos el que acabo de crear
				aEmpleados.add(emple);
			}
			return aEmpleados;
		}catch (SQLException e){
			e.printStackTrace();
			return null;
		}
	}
	//Metodo que consulta los departamentos por el numero del departamento en que traajan
		static public ArrayList<Empleado> consultaEmpleadosPorNumeroDepartamento(int num){
			//Creo el arrayList de departamentos donde los ire guardando 
			ArrayList<Empleado> aEmpleados = new ArrayList<Empleado>();
			try{
				PreparedStatement st=conexion.prepareStatement("SELECT * FROM empleados where numero_departamento= ?");
				st.setInt(1,  num);
				//ResultSet: tipo de dato donde se recoge lo que venga de la tabla
				ResultSet rs=st.executeQuery();
				//Automaticamente se coloca en la posicion 0
				//rs.next() devuelve true si hay algo en la siguiente posicion
				while(rs.next()){
					//Entre comillas va EL NOMBRE DE LA COLUMNA EN LA BBDD
					int numero=rs.getInt("numero");;
					String apellidos=rs.getString("apellidos");
					String oficio = rs.getString("oficio");
					int direccion = rs.getInt("codigo_postal");
					Date fechaAlta =  rs.getDate("fecha_alta");
					int salario = rs.getInt("salario");
					int comision = rs.getInt("comision");
					Empleado emple= new Empleado(numero, apellidos, oficio, direccion, fechaAlta,
							salario, comision);
					//Guardo en el array de departamentos el que acabo de crear
					aEmpleados.add(emple);
				}
				return aEmpleados;
			}catch (SQLException e){
				e.printStackTrace();
				return null;
			}
		}	
	
	

}



