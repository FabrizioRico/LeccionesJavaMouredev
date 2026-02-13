/*
 * Set
 * En esta clase exploramos sobre los HashSet
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 29 ene. 2026
 */

package leccion.n05_estructuras;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {

		// Declaracion y creacion
		HashSet<String> names = new HashSet<>();
		var numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		// Tamaño
		System.out.println(names.size());

		// Añadir elementos
		names.add("Fabrizio");
		names.add("Risco");
		names.add("fabrizioriscoalva05@gmail.com");
		names.add("PerryDios");
		names.add("perryelperruno@hotmail.com");
		System.out.println(names.size());
		System.out.println(names);

		// Buscar elementos | No se pueden buscar por indice ya que se guarda en hash
		// por lo tanto no se puede modificar
		System.out.println(names.contains("Fabrizio"));
		System.out.println(names.contains("Risco"));

		// Eliminar elementos
		names.remove("PerryDios");
		System.out.println(names);

		// No se repiten al agregar varios
		names.add("Fabrizio");
		names.add("Fabrizio");
		names.add("Fabrizio");
		System.out.println(names);

		// Conjuntos
//		names.addAll(numbers);	ERROR por incompatibilidad

		var countries = new HashSet<String>();
		countries.add("Perú");
		countries.add("Alemania");
		countries.add("Italia");
		countries.add("Risco");

		System.out.println(countries);

		names.addAll(countries);

		System.out.println(names);

		// Se elimina lo que tenian en comun
		names.removeAll(countries);

		System.out.println(names);

		// se elimino lo que no tenian en comun
		names.retainAll(countries);
		System.out.println(names);
	}
}
