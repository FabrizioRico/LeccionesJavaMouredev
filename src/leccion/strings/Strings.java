/*
 * Strings
 * En esta clase exploramos la clase String y sus diferentes operaciones
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 23 ene. 2026
 */

package leccion.strings;

public class Strings {

	public static void main(String[] args) {
		
		//Cadenas de texto
		
		String name = "Fabrizio";
		var surname = new String("Risco");
		
		//Operaciones basicas
		
		//Concatenacion
		System.out.println(name + " " + surname);
		
		//Longitud
		System.out.println(name.length());
		
		//Caracter en
		System.out.println(name.charAt(5));
	}
	
}
