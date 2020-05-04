package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controlador.Departamento;
import controlador.Empleado;


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
	
	
	//Metodo que recibe un código de departamento y lo elimina
	public static int eliminar(int codigo){
		try{
			//1 interrogacion: numero
			PreparedStatement stmt = conexion.prepareStatement
					("delete from departamentos where codigo = ?");
			
			//Ahora sustituimos las interrogaciones por el contenido de la variable
			stmt.setInt(1, codigo);
			//ExecuteUpdate cuando quiero realizar una modificacion en la bbdd
			return stmt.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
			return -1;
		}
	}
	
	public static int actualizar(Departamento depar) {return -1;}

	
	
	
	
	
	//Metodo que consulta los departamentos de la bbdd y devuelve todos
	static public ArrayList<Departamento> consultaDepartamentos(){
		//Creo el arrayList de departamentos donde los ire guardando 
		ArrayList<Departamento> aDepartamentos = new ArrayList<Departamento>();
		try{
			Statement st=conexion.createStatement();
			//ResultSet: tipo de dato donde se recoge lo que venga de la tabla
			ResultSet rs=st.executeQuery("SELECT * FROM departamentos");
			//Automaticamente se coloca en la posicion 0
			//rs.next() devuelve true si hay algo en la siguiente posicion
			while(rs.next()){
				//Entre comillas va EL NOMBRE DE LA COLUMNA EN LA BBDD
				int numero=rs.getInt("numero");
				String nombre=rs.getString("nombre");
				String direccion=rs.getString("localidad");
				Departamento dep = new Departamento(numero, nombre, direccion);
				//Guardo en el array de departamentos el que acabo de crear
				aDepartamentos.add(dep);
			}
			return aDepartamentos;	
		}catch (SQLException e){
			e.printStackTrace();
			return null;
		}
	}
	//Metodo que recibe el numero de departamento y lo devuelve con sus empleados cargados
	static public Departamento consultaDepartamentoPorNumero(int numero){
		//Creo el arrayList de departamentos donde los ire guardando 
		ArrayList<Empleado> aEmpleados = null;
		Departamento dep=null;
		try{
			PreparedStatement st=
					conexion.prepareStatement("SELECT * FROM departamentos where numero= ?");
			st.setInt(1, numero);
			//ResultSet: tipo de dato donde se recoge lo que venga de la tabla
			ResultSet rs=st.executeQuery();
			//Automaticamente se coloca en la posicion 0
			//rs.first() se posiciona en la primera posicion del resultset
			if(rs.first()) {
				//Entre comillas va EL NOMBRE DE LA COLUMNA EN LA BBDD
				numero=rs.getInt("numero");
				String nombre=rs.getString("nombre");
				String direccion=rs.getString("localidad");
				dep= new Departamento(numero, nombre, direccion);
				//Consulto a empleadoDao los empleados de este departamento
				aEmpleados=EmpleadoDao.consultaEmpleadosPorNumeroDepartamento(numero);
				dep.setEmpleados(aEmpleados);
			}
			return dep;
		}catch (SQLException e){
			e.printStackTrace();
			return null;
		}
	}


	
	
	
	
	
	
	
	
	
}
