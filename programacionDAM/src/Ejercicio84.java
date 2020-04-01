
public class Ejercicio84 {

	public static void main(String[] args) {
		System.out.println(fechaLarga("19/06/1990"));

	}
	public static String fechaLarga(String fechaNormal) {
		String[] palabras=fechaNormal.split("/");
		String[] meses= {"enero","febrero","marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre"
							,"Octubre","Noviembre","Diciembre"};
		int mes=Integer.parseInt(palabras[1]);
		String fechaCompleta= palabras[0]+ " de "+ meses[mes-1] + " de " + palabras[2];
		return fechaCompleta;
	
	}

}
