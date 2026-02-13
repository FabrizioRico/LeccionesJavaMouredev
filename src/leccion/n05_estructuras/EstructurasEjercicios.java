/*
 * EstructurasEjercicios
 * En esta clase resolvemos ejercicios sobre las estructuras de datos (Array, ArrayList, HashMap y HashSet)
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 29 ene. 2026
 */

package leccion.n05_estructuras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EstructurasEjercicios {

	public static void main(String[] args) {

		// 1. Crea un Array con 5 valores e imprime su longitud.
		String[] values = { "1", "2", "3", "4", "5" };

		System.out.println(values.length);

		// 2. Modifica uno de los valores del Array e imprime el valor del índice antes
		// y después de modificarlo.
		System.out.println(values[1]);
		values[1] = "dos";
		System.out.println(values[1]);

		// 3. Crea un ArrayList vacío.
		ArrayList<String> artistName = new ArrayList<String>();

		System.out.println(artistName);

		// 4. Añade 4 valores al ArrayList y elimina uno a continuación.
		artistName.add("Nine Inch Nails");
		artistName.add("Queens of the Stone Age");
		artistName.add("Portishead");
		artistName.add("Garbage");

		artistName.remove(0);
		System.out.println(artistName);

		// 5. Crea un HashSet con 2 valores diferentes.
		HashSet<String> SongName = new HashSet<String>();

		SongName.add("Elysium");
		SongName.add("The World Is Not Enough");
		System.out.println(SongName);

		// 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
		SongName.add("Elysium");
		SongName.add("Live And Let Die");

		System.out.println(SongName);

		// 7. Elimina uno de los elementos del HashSet.
		SongName.remove("Elysium");

		System.out.println(SongName);

		// 8. Crea un HashMap donde la clave sea un nombre y el valor el número de
		// teléfono. Añade tres contactos.
		HashMap<String, String> Contacts = new HashMap<String, String>();

		Contacts.put("Fabrizio Risco Alva", "912738871");
		Contacts.put("Paul McCartney", "912368765");
		Contacts.put("Trent Reznor", "981326872");

		// 9. Modifica uno de los contactos y elimina otro.
		Contacts.put("Trent Reznor", "555-9578");

		Contacts.remove("Paul McCartney");

		System.out.println(Contacts);

		// 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet
		// y finalmente en un HashMap con clave y valor iguales.
		List<String> listOfValues = Arrays.asList(values);
		System.out.println(listOfValues);

		HashSet<String> setOfValues = new HashSet<String>(listOfValues);
		System.out.println(setOfValues);

		HashMap<String, String> mapOfValues = new HashMap<String, String>();
		for (String element : setOfValues) {
			mapOfValues.put(element, element);
		}
		System.out.println(mapOfValues);

	}
}
