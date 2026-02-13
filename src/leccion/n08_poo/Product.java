/*
 * Product
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 12 feb. 2026
 */

package leccion.n08_poo;

public class Product {
	
	double price;
	
	public Product(double price){
		this.price = price;
	}
	
	public void Discount(double discount) {
		price = price - (price * discount / 100);
		
		System.out.println("El precio con el descuente es de: " +price+ " soles");
	}
}
