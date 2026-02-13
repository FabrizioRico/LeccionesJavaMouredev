/*
 * Worker
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 11 feb. 2026
 */

package leccion.n08_poo;

public class Worker {
	String name;
	double salary;
	
	public Worker(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void salaryPresentation() {
		System.out.println("El empleado " +name+ " figura con el salario de " +salary+ " soles");
	}
}
