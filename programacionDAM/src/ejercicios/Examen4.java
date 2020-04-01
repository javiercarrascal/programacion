package ejercicios;

import java.util.Arrays;

public class Examen4 {

	public static void main(String[] args) {
		int[][] array = new int[10][10];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if((i+j)%2==0) {
					int par=((int)(Math.random()*50))*2;
					array[i][j]=par;
				}else {
					int impar=((int)((Math.random()*50))*2)-1;
					array[i][j]=impar;	
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		int[][] tablaPares= new int[5][10];
		int[][] tablaImpares= new int[5][10];
		int x=0, y=0;
		for(int i=0;i<tablaPares.length;i++) {
			for(int j=0;j<tablaPares[i].length;j++) {
				tablaPares[i][j]=array[x][y];
				x+=2;
				if(x>=array[y].length) {
					y++;
					if(y%2==0) {
						x=0;
					}else {
						x=1;
					}
				}
			}
		}
		for(int i=0;i<tablaPares.length;i++) {
			System.out.println(Arrays.toString(tablaPares[i]));
		}
		x=1;y=0;
		for(int i=0;i<tablaImpares.length;i++) {
			for(int j=0;j<tablaImpares[i].length;j++) {
				tablaImpares[i][j]=array[x][y];
				x+=2;
				if(x>=array[y].length) {
					y++;
					if(y%2==0) {
						x=1;
					}else {
						x=0;
					}
				}
			}
		}
		for(int i=0;i<tablaImpares.length;i++) {
			System.out.println(Arrays.toString(tablaImpares[i]));
		}
		
		
		
		
		
		
		
		
		
		

	}

}
