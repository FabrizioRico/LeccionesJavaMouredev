/*
 * Person
 * En esta clase exploramos un poco mas sobre encapsulamiento
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 9 feb. 2026
 */

package leccion.n08_poo;

public class Person {

	//Atributos - Caracteritcas del objeto
	protected String name;
	private Integer age;
	final private String id;
	
	
	
	//Constructor
	public Person(String name, int age, String id) {
		this.name = name;
		this.setAge(age);
		this.id = id;
	}
	
	//Funciones - funciones del comportamiento del objeto
	public void presentation() {
		System.out.println("Hola, me llamo " + name + " y tengo " + age + " años" + "y mi id es" +id );
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//getter
	public String getId() {
		return id;
	}
	
	public Integer getAge() {
		return age;
	}
	
	//setter
	public Integer setAge(Integer age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Edad no valida");
		}
		return age;
	}
	
}
