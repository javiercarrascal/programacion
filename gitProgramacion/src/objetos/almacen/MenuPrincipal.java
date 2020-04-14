package objetos.almacen;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {
	//Creo el carrito de la compra estatico para poder acceder a el desde el main
	//y desde el resto de metodos estaticos
	static ArrayList<Bebida> carrito= new ArrayList<Bebida>();
	//Creo el almacen tb estático, como el carrito de la compra
	static Almacen almacen = new Almacen();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Esta variable nos sirve para salirnos del menu principal o no
		boolean salir=false;
		int opcion=0;
		while(!salir) {
			boolean correcto=false;
			while(!correcto) {
				System.out.println("1. Nueva bebida");
				System.out.println("2. Estadísticas");
				System.out.println("3. Comprar");
				System.out.println("4. Consultar Carrito");
				System.out.println("5. Salir");
				System.out.println("Introduce la opcion que deseas: ");
				try {
					opcion=sc.nextInt();
					correcto=true;
				}catch(InputMismatchException ex) {
					System.out.println("El valor introducido no es un número.");
					sc = new Scanner(System.in);
				}
			}
			//Cada case del seitch nos lleva a un metodo distinto
			switch(opcion) {
			case 1: menuNuevaBebida();
				break;
			case 2: menuEstadisticas();
				break;
			case 3: menuComprar();
				break;
			case 4: menuConsultarCarrito();
				break;
			case 5: 
				menuSalir();
				salir=true;
				break;
			}
		}

	}
	public static void menuSalir() {
		double dinero=0;
		for(Bebida b: carrito) {
			if(b instanceof Azucarada) {
				Azucarada a= (Azucarada)b;
				double precio=0;
				if(a.isPromocion()) {
					precio=a.getPrecio()-a.getPrecio()*0.1;
				}else {
					precio=a.getPrecio();
				}
				dinero+=precio;
					
			}
			if(b instanceof Agua) {
				dinero+=b.getPrecio();
			}
		}
		System.out.println("El dinero total a pagar es: " + dinero);
	}
	
	
	
	
	
	
	//Todos los metodos deben ser static, ya que hay que llamarlos desde el main
	//que a la fuerza es static
	public static void menuNuevaBebida() {
		Scanner sc = new Scanner(System.in);
		Scanner scNumeros = new Scanner(System.in);
		System.out.println("Qué tipo de bebida? A-agua R-refresco");
		char opcion=sc.nextLine().charAt(0);
		System.out.println("Introduce la marca: ");
		String marca= sc.nextLine();
		System.out.println("Introduce el identificador: ");
		int identificador=scNumeros.nextInt();
		System.out.println("Introduce los litros: ");
		double litros=scNumeros.nextDouble();
		System.out.println("Introduce el precio: ");
		double precio=scNumeros.nextDouble();
		if(opcion=='a' || opcion =='A') {
			System.out.println("Introduce el origen:");
			String origen=sc.nextLine();
			Agua a= new Agua(identificador, litros, precio, marca, origen);
			almacen.agregarProducto(a);
			
		}
		if(opcion=='r' ||opcion=='R') {
			System.out.println("Introduce el porcentaje de azucar:");
			double azucar=scNumeros.nextDouble();
			System.out.println("Introduce 'si' o 'no' tiene promocion?");
			String promo=sc.nextLine();
			boolean promocion=false;
			if(promo.equals("si")) {
				promocion=true;
			}
			Azucarada a = new Azucarada(identificador, litros, precio, marca, promocion, azucar);
			almacen.agregarProducto(a);
		}
	}

	public static void menuEstadisticas() {
		//Al igual que en el menu principal tenemos:
		//Variable 'salir' que controla si se sigue o no en el menu
		//While con las opciones del menu
		//Switch para llamar a otro metodo o realizar los calculos que se le pidan
		Scanner sc = new Scanner(System.in);
		boolean salir=false;
		while(!salir) {
			boolean correcto=false;
			int opcion=0;
			while(!correcto) {
				System.out.println("1. Totales");
				System.out.println("2. Por estantería");
				System.out.println("3. Por marca");
				System.out.println("4. Por precio");
				System.out.println("5. Volver");
				System.out.println("Introduce la opcion que deseas: ");
				try {
					opcion=sc.nextInt();
					correcto=true;
				}catch (InputMismatchException e) {
					System.out.println("El caracter introducido no es válido.");
					sc = new Scanner(System.in);
				}
			}
			//Cada case del switch nos lleva a un metodo distinto
				
			switch(opcion) {
			case 1: 
				//Llamo al método calcularPrecio de la calse Almacen
				double precioTotal=almacen.calcularPrecio();
				System.out.println("El precio total de las bebidas del almacen es: + precioTotal");
				break;
			case 2: 
				menuCalcularPrecioEstanteria();
				break;
			case 3: 
				menuCalcularPrecioPorMarca();
				break;
			case 4: 
				menuObtenerBebidasPorPrecioMax();
				break;
			case 5: 
				//Si elije la opcion 5 se pone la variable salir a true
				salir=true;
				break;
			}
			
		}
	}
	
	public static void menuComprar() {
		//Al igual que en el menu principal tenemos:
		//Variable 'salir' que controla si se sigue o no en el menu
		//While con las opciones del menu
		//Switch para llamar a otro metodo o realizar los calculos que se le pidan
		Scanner sc = new Scanner(System.in);
		boolean salir=false;
		while(!salir) {
			System.out.println("1. Azucarada");
			System.out.println("2. Agua");
			System.out.println("3. Por código");
			System.out.println("4. Volver");
			System.out.println("Introduce la opcion que deseas: ");
			int opcion=sc.nextInt();
			//Cada case del switch nos lleva a un metodo distinto
			switch(opcion) {
			case 1: 
				Azucarada a = almacen.comprarAzucarada();
				if(a!=null) {
					carrito.add(a);
					System.out.println("Bebida añadida al carrito:");
					System.out.println(a);
				}else {
					System.out.println("No se ha añadido ninguna bebida");
				}
				break;
			case 2: 
				Agua ag = almacen.comprarAgua();
				if(ag!=null) {
					carrito.add(ag);
					System.out.println("Bebida añadida al carrito:");
					System.out.println(ag);
				}else {
					System.out.println("No se ha añadido ninguna bebida");
				}
				break;
			case 3: 
				menuComprarPorCodigo();
				break;
			case 4: 
				//Si elije la opcion 4 se pone la variable salir a true
				salir=true;
				break;
			}
		}
	}
	
	public static void menuComprarPorCodigo() {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> codigos= almacen.getCodigos();
		System.out.println("Elige el código de la bebida que quieres comprar:");
		for(Integer cod: codigos) {
			System.out.println(cod);
		}
		int elegido = sc.nextInt();
		Bebida b= almacen.comprarCodigo(elegido);
		if(b!=null) {
			carrito.add(b);
			System.out.println("Bebida añadida al carrito. ");
			System.out.println(b);
		}else {
			System.out.println("Bebida no encontrada.");
		}
	}
	
	
	
	public static void menuCalcularPrecioEstanteria() {
		Scanner sc = new Scanner(System.in);
		int numero=0;
		do{
			System.out.println("Introduce el numero de estantería que quieres consultar: ");
			numero=sc.nextInt();
			//Compruebo que el numero de estanteria que introduce el usuario es correcto
		}while(numero<0 || numero>9);
		double precio=almacen.calcularPrecioPorEstanteria(numero);
		System.out.println("El precio total de la estantería seleccionada es: " + precio);
		
	}
	public static void menuObtenerBebidasPorPrecioMax() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el precio maximo que quieres pagar:");
		double precioMax=sc.nextDouble();
		ArrayList<Bebida> bebidas= almacen.obtenerBebidasPorPrecioMax(precioMax);
		System.out.println("Listado de bebidas por debajo de ese precio: ");
		for(Bebida b: bebidas) {
			System.out.println(b);
		}
	}
	
	public static void menuCalcularPrecioPorMarca() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String>marcas=almacen.getMarcas();
		System.out.println("Esta es la lista de marcas disponibles: ");
		for(String marca: marcas) {
			System.out.println(marca);
		}
		System.out.println("Introduce la marca que quieres consultar: ");
		String marca = sc.nextLine();
		double precio=almacen.calcularPrecioPorMarca(marca);
		System.out.println("El precio total de la marca seleccionada es: " + precio);
		
	}
	
	public static void menuConsultarCarrito() {
		//Al igual que en el menu principal tenemos:
		//Variable 'salir' que controla si se sigue o no en el menu
		//While con las opciones del menu
		//Switch para llamar a otro metodo o realizar los calculos que se le pidan
		Scanner sc = new Scanner(System.in);
		System.out.println("LISTA DE BEBIDAS EN EL CARRITO: ");
		for(Bebida b: carrito) {
			if(b instanceof Azucarada) {
				System.out.println((Azucarada)b);
			}
			if(b instanceof Agua) {
				System.out.println((Agua)b);
			}
		}
		System.out.println("Selecciona una opcion: ");
		boolean salir=false;
		while(!salir) {
			System.out.println("1. Eliminar elemento del carrito");
			System.out.println("2. Volver");
			int opcion=sc.nextInt();
			//Cada case del switch nos lleva a un metodo distinto
			switch(opcion) {
			case 1: 
				System.out.println("Introduce el codigo que deseas eliminar: ");
				int eliminar=sc.nextInt();
				for(Bebida b:carrito) {
					if(b.getIdentificador()==eliminar) {
						carrito.remove(b);
						almacen.agregarProducto(b);
					}
				}
				break;
			case 2: 
				salir=true;
				break;
			}
		}
	}		
	
	
	
	
	
	
	
	
	
	
	
	
}
