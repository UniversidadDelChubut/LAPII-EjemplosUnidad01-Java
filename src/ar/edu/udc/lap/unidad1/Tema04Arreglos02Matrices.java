package ar.edu.udc.lap.unidad1;

public class Tema04Arreglos02Matrices {
	// http://puntocomnoesunlenguaje.blogspot.com/2012/12/matriz-en-java.html

	public static void main(String[] args) {
		
		int a [][] = new int [2][3];
		
		for (int i = 0; i < a.length; i++) {  //n�mero de filas
		     for (int j = 0; j < a[i].length; j++) { //n�mero de columnas de cada fila
		          System.out.print(a[i][j] + " ");
		     }
		     System.out.println();
		}	
	    System.out.println();

		int [][] b = {{1}, {1, 1}, {1,2,1}};
		for (int i = 0; i < b.length; i++) {  //n�mero de filas
		     for (int j = 0; j < b[i].length; j++) { //n�mero de columnas de cada fila
		          System.out.print(b[i][j] + " ");
		     }
		     System.out.println();
		}	
		System.out.println();
		
		for (int[]fila: b) {  //n�mero de filas
		     for (int v: fila) { //n�mero de columnas de cada fila
		          System.out.print(v + " ");
		     }
		     System.out.println();
		}	
		
	}
	
	
}
