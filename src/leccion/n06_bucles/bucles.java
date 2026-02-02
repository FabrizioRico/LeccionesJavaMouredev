/*
 * bucles
 * En esta clase exploramos...
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 30 ene. 2026
 */

package leccion.n06_bucles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class bucles {

	public static void main(String[] args) {
		
		var hola = "hola";
		
		//Bucles
		
		//for controlado por contador
		for (int index = 0; index <= 5; index++) {
			System.out.println("Hola bucleador");
		}
		
		for (int index = 1; index <= 5; index++) {
			System.out.println("Hola bucler");
		}
		
//		for (int index = 5; index > 0; index += 2) {
//			System.out.println("Hola INFINITO");
//		}
		
		for (int index = 5; index >= 0; index--) {
			System.out.println("Hola bucle reverso");
		}
		
		Integer[] numbers = {1, 2, 3};
		
		for (int index = 0; index < numbers.length; index++) {
			System.out.println(numbers[index]);
		}
		
		
		//for-each
		for (Integer number:numbers) {
			System.out.println(number);	
		}
		
		HashSet<String> artistName = new HashSet<String>();
		artistName.add("David Bowie");
		artistName.add("Suzanne Vega");
		artistName.add("Layne Staley");
		
		for (String name: artistName) {
			System.out.println(name);
		}
		
		HashMap<String, String> users = new HashMap<String, String>();
		users.put("PerryDios", "perryelperruno@hotmail.com");
		users.put("Nick Gurr", "gab@gmail.com");
		users.put("billy", "billy@gmail.com");
		
		for (Map.Entry<String, String> user : users.entrySet()) {
			System.out.println(user);
			System.out.println(user.getKey());
			System.out.println(user.getValue());
		}
	}

}
