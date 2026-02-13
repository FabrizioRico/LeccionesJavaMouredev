/*
 * ClassesEjercicios
 * En esta clase resolvemos algunos ejercicios relacionados a objetos y clases
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 10 feb. 2026
 */

package leccion.n08_poo;

import java.util.ArrayList;

public class ClassesEjercicios {
	
	public static void main(String[] args) {
		// 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
		
//		var book = new Book();
//		
//		var author = book.author = "Mario Vargas Llosa";
//		var title = book.title = "Pantaleón y las visitadoras";
//		
//		book.presentation(title, author);
		
		
        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
		var dog = new Dog();
		
		dog.bark();
		
		
        // 3. Añade un constructor a la clase Book que reciba title y author.
		/*A partir de acá. voy a usar constructores aunque no me lo diga. Porque creo que deberia ser asi no?*/
		
		/*VER CLASE Book.java*/
		
		
        // 4. Crea una clase Car con atributos brand y model y un método showData().
		var car = new Car("Volkswagen", "Beetle 2015");
		
		car.showData();
		
		
        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
		var student = new Student(100);
		
		student.isAproved();
		
		
        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
		var bankAccount = new BankAccount(97.3);
		
		System.out.println(bankAccount.newDeposit(1003));
		
		
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
		var rectangle = new Rectangle(20, 80);
		
		rectangle.basicCalculations();
		
		
        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
		var worker = new Worker("Fabrizio Risco Alva", 1400);
		
		worker.salaryPresentation();
		
        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
		var person1 = new Person("Fabrizio Risco Alva", 20, "0001");
		var person2 = new Person("Gabriel Andrade Ramirez", 22, "0002");
		var person3 = new Person("Megan Espinoza Luna", 21, "0003");
		
		ArrayList<Person> listOfPersons = new ArrayList<Person>();
		
		listOfPersons.add(person1);
		listOfPersons.add(person2);
		listOfPersons.add(person3);
		
		/*añadi un toString en la clase para poder imprimir el contenido*/
		System.out.println(listOfPersons);
		
		for (Person person : listOfPersons) {
			System.out.println(person);
		}
		
        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
		var product = new Product(20000);
		
		product.Discount(50);
		
		
	}
}
