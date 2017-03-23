package ar.edu.udc.lap.unidad1.t01tiposdedatos;

/**
 * Ejemplos de arrays y estructuras repetitivas.
 * 
 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 */
public class ArraysYBucles {

	public static void main(String[] args) {

		float[] tempertaturasPromedio = new float[12];

		tempertaturasPromedio [0] = 23.4f;
		tempertaturasPromedio [1] = 22.1f;
		tempertaturasPromedio [2] = 20.0f;
		tempertaturasPromedio [3] = 17.0f;
		tempertaturasPromedio [4] = 13.0f;
		tempertaturasPromedio [5] = 10.4f;
		tempertaturasPromedio [6] =  9.5f;
		tempertaturasPromedio [7] = 11.5f;
		tempertaturasPromedio [8] = 13.7f;
		tempertaturasPromedio [9] = 17.5f;
		tempertaturasPromedio[10] = 20.6f;
		tempertaturasPromedio[11] = 22.9f;
		
		
		/* �cu�l es el promedio anual? */
		
		
		/*	Se pronostica que de aqu� a 30 a�os las temperaturas aumentra�n en un 12 %
		 *  �C�mo quedar�a el arreglo de temperaturas medias para entonces? 
		 */
		 
		
		/* Ejercicio
		 * Cree un arreglo con las temperaturas promedio expresada en grados farenheith
		 */
		

		int[] fibonacci = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };
		/* Ejercicio escriba una rutuna que, dado un n�mero entero, escriba la sucesi�n de fibonacci de ese �rden */
		

		/*
		while(true)
			;
		*/
		
		/*
		int i = 0;
		
		while(i< 10){
			System.out.println(i);
			i++;
		}*/
		
		/*
		int i = 0;
		
		do {
			System.out.println(i);
			i++;
		} while (i< 10);
		*/
		
		int i = 0;
		
		do
			System.out.println(i++);	
		while (i< 10);
				
		/*
		for (int i = 0; i < 10 ; i++){
			System.out.println(i);
		}*/
		
	}

}
