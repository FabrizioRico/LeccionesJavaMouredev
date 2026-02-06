/*
 * BuclesEjercicios
 * En esta clase exploramos...
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 3 feb. 2026
 */

package leccion.n06_bucles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BuclesEjercicios {
	
	public static void main(String[] args) {
		
		// 1. Imprime los números del 1 al 10 usando while.
		var i = 1;
		while (i <= 10) {
			System.out.println(i);
			 i++;
		}
		
		
        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
		ArrayList<String> showName = new ArrayList<String>();
		
		showName.add("Dexter");
		showName.add("Designated Survivor");
		showName.add("The Blacklist");
		
		var index = 0;
		
		do {
			System.out.println(showName.get(index));
			index++;
		} while (showName.size() > index);
		
		
        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
		for (int multiplier = 0; multiplier <= 50; multiplier+=5 ) {
			System.out.println(multiplier);	
		}
		
		
        // 4. Recorre un Array de 5 números e imprime la suma total.
		int[] numbers = {1, 2, 3, 4, 5};
		
		int result = 0;
		
		for (int index2:numbers) {
			result+=index2;
		}
		System.out.println(result);
		
		
        // 5. Usa un for para recorrer un Array y mostrar sus valores.
		String[] artistName = {"Alice in Chains", "Portishead", "Nine Inch Nails"};
		
		for (int j = 0; j < artistName.length; j++) {
			System.out.println(artistName[j]);
		}

		
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
		HashSet<String> songName = new HashSet<String>();
		songName.add("Heaven beside you");
		songName.add("The Rip");
		songName.add("Discipline");
		
		for (String string : songName) {
			System.out.println(string);
		}
		
		HashMap<Integer, String> artistData = new HashMap<Integer, String>();
		artistData.put(1, "Supertramp");
		artistData.put(2, "Queens of the Stone Age");
		artistData.put(3, "Akira Yamaoka");
		
		for (Map.Entry<Integer, String> entry : artistData.entrySet()) {
			System.out.println(entry);
		}
		
		
        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

		for(int indexDesc = 10; indexDesc >= 1; indexDesc--) {
			System.out.println(indexDesc);
		}
		
		
        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
		int index3 = 0;
		
		while (index3 < 20) {
			index3++;
			if ((index3 % 3) == 0) {
				continue;	
			}
			System.out.println(index3);
		}
		
		
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
		Integer[] indexNega = {3, 2, 1, 0 , -1, -2, -3};
		
		for (Integer integer : indexNega) {
			if (integer < 0) {
				break;
			}
			System.out.println(integer);
		}
		
		
        // 10. Crea un programa que calcule el factorial de un número dado.
		int[] number = {5, 4, 3, 2, 1};
		
		result = 1;
		
		for (int j : number) {
			result *= j;
		}
		System.out.println(result);
		
		//OTRA MANERA DE HACERLO. YO NO LO HICE, ME LO ENSEÑO GPT
		int n = 5;
		int results = 1;

		for (int k = 1; k <= n; k++) {
		    results *= k;
		}
		System.out.println(results);

	}

}
