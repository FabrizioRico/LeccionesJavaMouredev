/*
 * Classes
 * En esta clase exploramos un poco mas sobre encapsulamiento
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 9 feb. 2026
 */

package leccion.n08_testpoo;

import leccion.n08_poo.Person;

public class Classes {
	
	public static void main(String[] args) {
		
		var person = new Person("Fabrizio", 20, "123456");
		
		//no se puede modificar poeque es protected
//		person.name = "Fabrizio";
//		person.age = "20";
		
		person.presentation();
		
//		person.name = "Fabrizio Omar";
		
//		no se puede ver poeque es protected
//		System.out.println(person.name);
		
		var person2 = new Person("Omar", 27, "12345678");
		person2.presentation();
	}
}
