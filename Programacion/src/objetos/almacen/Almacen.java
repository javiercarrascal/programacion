package objetos.almacen;

import java.util.ArrayList;

public class Almacen {
	Bebida [][] bebidas = new Bebida[10][10];
	//Metodo que devuelve el precio de todos los productos que hay en el almacen
	public double calcularPrecio() {
		double precioTotal=0;
		for(int i=0;i<bebidas.length;i++) {
			for(int j=0;j<bebidas[i].length;j++) {
				//Antes de acceder al precio del objeto que haya en una posicion debo preguntar
				//si es null, ya que tendré espacios vacíos y sino el programa fallaría
				if(bebidas[i][j]!=null) {
					precioTotal+=bebidas[i][j].getPrecio();
				}
			}
		}
		return precioTotal;
	}
	//Metodo que devuelve las bebidas que estén por debajo del precio indicado
	public ArrayList<Bebida> obtenerBebidasPorPrecioMax(double precio) {
		ArrayList<Bebida>bebidasInferiores= new ArrayList<Bebida>();
		for(int i=0;i<bebidas.length;i++) {
			for(int j=0;j<bebidas[i].length;j++) {
				//Antes de acceder al precio del objeto que haya en una posicion debo preguntar
				//si es null, ya que tendré espacios vacíos y sino el programa fallaría
				if(bebidas[i][j]!=null && precio>bebidas[i][j].getPrecio()) {
					bebidasInferiores.add(bebidas[i][j]);
				}
			}
		}
		return bebidasInferiores;
	}
	
	public Bebida[][] getBebidas() {
		return bebidas;
	}
	public ArrayList<Integer> getCodigos(){
		ArrayList<Integer> codigos = new ArrayList<Integer>();
		for(int i=0;i<bebidas.length;i++) {
			for(int j=0;j<bebidas[i].length;j++) {
				if(bebidas[i][j]!=null) {
					codigos.add(bebidas[i][j].getIdentificador());
				}
			}
		}
		return codigos;
	}
	
	public Bebida comprarCodigo(int codigo) {
		Bebida b= null;
		boolean encontrada = false;
		for(int i=0;i<bebidas.length;i++) {
			for(int j=0;j<bebidas[i].length;j++) {
				if(bebidas[i][j]!=null) {
					if(bebidas[i][j].getIdentificador()==codigo && !encontrada) {
						b=bebidas[i][j];
						encontrada=true;
					}
				}
			}
		}
		return b;
	}
	
	public Azucarada comprarAzucarada() {
		Azucarada a = null;
		boolean encontrada = false;
		for(int i=0;i<bebidas.length;i++) {
			for(int j=0;j<bebidas[i].length;j++) {
				if(bebidas[i][j]!= null && 
					bebidas[i][j] instanceof Azucarada && 
					!encontrada) {
					a=(Azucarada) bebidas[i][j];
					bebidas[i][j]=null;
					encontrada=true;
				}
			}
		}
		return a;
	}
	public Agua comprarAgua() {
		Agua a = null;
		boolean encontrada = false;
		for(int i=0;i<bebidas.length;i++) {
			for(int j=0;j<bebidas[i].length;j++) {
				if(bebidas[i][j]!= null && 
						bebidas[i][j] instanceof Agua && 
						!encontrada) {
					a=(Agua) bebidas[i][j];
					bebidas[i][j]=null;
					encontrada=true;
				}
			}
		}
		return a;
	}
	
	
	
	//Metodo que recibe el numero de estantería y devuelve el precio total de la misma
	public double calcularPrecioPorEstanteria(int estanteria) {
		double precioTotal=0;
		for(int i=0;i<bebidas.length;i++) {
			//Al estar calculando el precio de una unica estanteria no nos hace falta otro for
			if(bebidas[estanteria][i]!=null) {
				precioTotal+=bebidas[estanteria][i].getPrecio();
			}
		}
		return precioTotal;
	}
	//Metodo que recibe una marca de bebida y devuelve el precio total de bebidas de esa marca
	public double calcularPrecioPorMarca(String marca) {
		double precioTotal=0;
		for(int i=0;i<bebidas.length;i++) {
			for(int j=0;j<bebidas[i].length;j++) {
				//Antes de acceder al precio del objeto que haya en una posicion debo preguntar
				//si es null, ya que tendré espacios vacíos y sino el programa fallaría
				//Lo comparo con la marca para calcular el precio por marca
				if(bebidas[i][j]!=null && bebidas[i][j].getMarca().equals(marca)) {
					precioTotal+=bebidas[i][j].getPrecio();
				}
			}
		}
		return precioTotal;
	}
	
	//Metodo que devuelve un arrayList con las marcas disponibles en el almacen
	public ArrayList<String> getMarcas(){
		ArrayList<String> marcas= new ArrayList<String>();
		for(int i=0;i<bebidas.length;i++) {
			for(int j=0;j<bebidas[i].length;j++) {
				if(bebidas[i][j]!=null) {
					String marca=bebidas[i][j].getMarca();
					if(!marcas.contains(marca)) {
						marcas.add(marca);
					}
				}
			}
		}
		return marcas;
	}
	public void agregarProducto(Bebida b) {
		boolean repetido=false;
		for(int i=0;i<bebidas.length;i++) {
			for(int j=0;j<bebidas[i].length;j++) {
				if(bebidas[i][j]!=null) {
					if(bebidas[i][j].getIdentificador()==b.getIdentificador()) {
						repetido=true;
					}
				}
			}
		}
		boolean insertado=false;
		if(!repetido) {
			for(int i=0;i<bebidas.length;i++) {
				for(int j=0;j<bebidas[i].length;j++) {
					if(bebidas[i][j]==null && !insertado) {
						bebidas[i][j]=b;
						insertado=true;
					}
				}
			}
		}	
	}
}

















