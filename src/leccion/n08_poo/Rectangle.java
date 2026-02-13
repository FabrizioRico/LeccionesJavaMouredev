/*
 * Rectangle
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 11 feb. 2026
 */

package leccion.n08_poo;

public class Rectangle {
	
	double height;
	double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public void basicCalculations() {
		
		var perimeter = height*2 + width*2;
		var area = height * width;
		
		System.out.println("El perimetro es "+ perimeter + " y el area es " +  area);
	}
}
