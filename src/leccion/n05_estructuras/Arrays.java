/*
 * Arrays
 * En esta clase exploramos los arreglos (Array) 
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 28 ene. 2026
 */

package leccion.n05_estructuras;

public class Arrays {

	public static void main(String[] args) {

		// Declaracion y creación
		int[] numbers = new int[3];
		System.out.println(numbers);

		String[] names = { "Fabrizio", "Omar", "Risco", "Alva" };
		System.out.println(names);

		// Acceso
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);

		System.out.println(numbers[1]);

		System.out.println((new String[3])[0]);

		// Modificación
		numbers[0] = 1;
		numbers[1] = 10;
//	numbers[3] = 10; ERROR
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
//	System.out.println(numbers[3]); ERROR 

		System.out.println(names[2]);
		names[2] = "Rico";
		System.out.println(names[2]);

		// Una vez declarado el array, no se puede cambiar el tamaño ni el tipo de dato
		System.out.println(names.length);
		names[2] = null;
		System.out.println(names[2]);
		System.out.println(names.length);

		// Solo los objetos pueden ser null, primitivos no
//	numbers[2] = null; ERROR

		boolean[] booleans = new boolean[5];
		System.out.println(booleans[2]);
	}
}
