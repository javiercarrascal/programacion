package objetos.ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		Electrodomestico[] electrodomesticos= new Electrodomestico[10];
		Television t1= new Television(500,20);
		Television t2= new Television(600,30);
		Television t3= new Television(700,40);
		Lavadora l1= new Lavadora();
		Lavadora l2= new Lavadora();
		Lavadora l3= new Lavadora();
		Electrodomestico e1= new Electrodomestico();
		Electrodomestico e2= new Electrodomestico();
		Electrodomestico e3= new Electrodomestico();
		Electrodomestico e4= new Electrodomestico();
		electrodomesticos[0]=t1;electrodomesticos[1]=l1;electrodomesticos[2]=e1;
		electrodomesticos[3]=t2;electrodomesticos[4]=l2;electrodomesticos[5]=e2;
		electrodomesticos[6]=t3;electrodomesticos[7]=l3;electrodomesticos[8]=e3;
		electrodomesticos[9]=e4;
		int precioTeles=0, precioLavadoras=0, precioTotal=0;
		for(int i=0;i<electrodomesticos.length;i++) {
			//Instance of me sirve para preguntar si es una instancia de un objeto
			if(electrodomesticos[i] instanceof Television) {
				Television t = (Television)electrodomesticos[i];
				System.out.println("Television:" + t.precioFinal());
				precioTeles+=t.precioFinal();
			}else if(electrodomesticos[i] instanceof Lavadora){
				Lavadora l = (Lavadora)electrodomesticos[i];
				System.out.println("Lavadora:" + l.precioFinal());
				precioLavadoras+=l.precioFinal();
			}else {
				System.out.println(electrodomesticos[i].precioFinal());
				precioTotal+=electrodomesticos[i].precioFinal();
			}
			
		}
		System.out.println("Total televisores: " + precioTeles);
		System.out.println("Total Lavadoras: " + precioLavadoras);
		System.out.println("Total Electrodomesticos: " + precioTotal);

	}

}
