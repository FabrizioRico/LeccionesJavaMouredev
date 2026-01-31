/*
 * Maps
 * En esta clase exploramos...
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 29 ene. 2026
 */

package leccion.n05_estructuras;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {

		// Declaración y creación
		HashMap<String, String> names = new HashMap<String, String>();
		var numbers = new HashMap<Integer, String>();

		// Tamaño
		System.out.println(names.size());

		// Añadir elementos
		names.put("Fabrizio Risco Alva", "fabrizioriscoalva05@gmail.com");
		names.put("PerryDios", "perryelperruno@hotmail.com");
		System.out.println(names);

		// Acceder a los elementos
		System.out.println(names.get("PerryDios"));
		System.out.println(names.get("Perry"));

		// Verificar elementos
		System.out.println(names.containsKey("PerryDios"));
		System.out.println(names.containsKey("Perry"));

		System.out.println(names.containsValue("fabrizioriscoalva05@gmail.com"));

		// Eliminar elementos
		System.out.println(names.remove("PerryDios"));
		System.out.println(names.remove("Fabrizio Risco Alva"));
		System.out.println(names);

		// Limpiar Hashmap
		names.clear();
		System.out.println(names);

		// Modificar elementos
		names.put("Fabrizio Risco Alva", "fabrizioriscoalva05@gmail.com");
		System.out.println(names);

		names.put("Fabrizio Risco Alva", "fabrizioriscoalva@gmail.com");
		System.out.println(names);

		names.replace("PerryDios", "perryelperruno@hotmail.com"); // Reemplaza si existe
		System.out.println(names);

		names.putIfAbsent("PerryDios", "perryelperruno@hotmail.com");
		System.out.println(names);

		// Otras operaciones
		System.out.println(names.isEmpty());
		var values = names.values();
		System.out.println(names.values());
		System.out.println(values);
	}
}
