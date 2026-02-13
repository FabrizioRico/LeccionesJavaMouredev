/*
 * Car
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 11 feb. 2026
 */

package leccion.n08_poo;

public class Car {
	String brand;
	String model;
	
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public void showData() {
		System.out.println(model + " de la marca " + brand);
	}
}
