/*
 * List
 * En esta clase exploramos sobre la lista (ArrayList)
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 28 ene. 2026
 */

package leccion.n05_estructuras;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {

		// Declaración y creación //no se puede crear con datos primitivas
		ArrayList<String> names = new ArrayList<String>();
		var numbers = new ArrayList<Integer>();

		// Tamaños
		System.out.println(names.size());

		// Añadir elementos
		names.add("Fabrizio");
		names.add("Risco");
		names.add("Alva");
		System.out.println(names.size());

		// Acceder a los elementos
		System.out.println(names.getFirst());
		System.out.println(names.get(1));
		System.out.println(names.getLast());
		System.out.println(names);

		// Modificar los elementos
		names.set(2, "fabrizioriscoalva05@gmail.com");
		System.out.println(names.get(2));

		// Eliminar elementos
		names.remove(2);
//		System.out.println(names.get(2));	ERROR PORQUE YA SE ELIMINO
		System.out.println(names.size());

		// Buscar elementos
		System.out.println(names.contains("Fabrizio"));
		System.out.println(names.contains("fabrizioriscoalva05@gmail.com"));

		// Limpiar ArrayList
		System.out.println(names);
		names.clear();
		System.out.println(names.size());

	}

}
