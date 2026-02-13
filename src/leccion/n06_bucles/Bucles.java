/*
 * bucles
 * En esta clase exploramos los diferentes tipos de bucles
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 30 ene. 2026
 */

package leccion.n06_bucles;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bucles {

	public static void main(String[] args) {

		
		//Bucles
		
		//for controlado por contador
		for (int index = 0; index < 5; index++) {
			System.out.println("Hola bucleador de 5");
		}
		
		for (int index = 1; index <= 5; index++) {
			System.out.println("Hola bucle desde 1");
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
		
		//While
		int index = 0;
		
		while (index < 5) {
			System.out.println("Hola whilero");
			index++;
		}
		
		String[] actorName = {"Timothee Chalamet", "Zendaya", "Leonardo DiCaprio", "Rowan Atkinson"};
		 
		index = 0;
		while (index < actorName.length) {
			System.out.println(actorName[index]);
			index++;
		}
		
		Boolean find = false;
		index = 0;
		while (!find) {
			System.out.println(actorName[index]);
			if (actorName[index].equals("Zendaya")) {
				find = true;
				System.out.println(find);
			}
			index++;
		}
		
		
		//Do-while
		
		index = 0;
		do {
			System.out.println("Hola de nuevo");
			index++;
		} while (index < 0);
		
		
		
		//Control de bucles
		//Break
		for (String name:actorName) {
			if (name.equals("Leonardo DiCaprio")) {
				break;
			}
			System.out.println(name);
		}
		
		//Continue
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}

	}

}
