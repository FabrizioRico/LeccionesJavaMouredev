/*
 * Classes
 * En esta clase exploramos un poco mas sobre encapsulamiento y sobre clases y objetos
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 9 feb. 2026
 */

package leccion.n08_poo;

public class Classes {
	
	public static void main(String[] args) {
		
		var person = new Person("Fabrizio", -20, "123");
		
		person.name = "Fabrizio";
//		person.age = 20;
		
		person.presentation();
		
		person.name = "Fabrizio Omar";
		System.out.println(person.name);
		
		//no se puede modificar porque es private
//		person.id = "203";
		System.out.println(person.getId());
		
		person.setAge(29);
		System.out.println(person.getAge());
		
		var person2 = new Person("Omar", 27, "12345");
		person2.presentation();
	}
}
