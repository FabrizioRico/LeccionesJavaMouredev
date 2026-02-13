/*
 * ProductE
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 13 feb. 2026
 */

package leccion.n08_poo;

public class ProductEX {
	
	private Double price;
	
	public ProductEX(Double price) {
		this.setPrice(price);
	}
	
	public Double getPrice() {
		return price;
	}
	
	public Double setPrice(Double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Este es un precio incorrecto");
		}
		return price;
	}
}
