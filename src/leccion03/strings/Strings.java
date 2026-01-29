/*
 * Strings
 * En esta clase exploramos la clase String y sus diferentes operaciones
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 23 ene. 2026
 */

package leccion03.strings;

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
		
		//Caracter en x posicion
		System.out.println(name.charAt(5));
		System.out.println(name.charAt(name.length() - 1));
		
		//Subcadena (Empieza desde)
		System.out.println(name.substring(2));
		System.out.println(name.substring(1, 3));
		
		//Mayusculas y minusculas
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		//Estas operaciones no cambian el valor original, solo estas operando con ella
		
		//Comprobar si tiene
		System.out.println("Hola mundo".contains("Fabrizio"));
		System.out.println("Hola mundo".contains("undo"));
		System.out.println("Hola mundo".toUpperCase().contains("UNDO"));
		
		//Comparacion
		System.out.println(name.equals("Fabrizio"));
		System.out.println(name.equals("fabrizio"));
		System.out.println(name.equalsIgnoreCase("fabrizio"));
		
		// == VS equals
		var a = "Fabrizio";
		var b = "Fabrizio";
		var c = new String("Fabrizio");
		
		//== compara los objetos y tipos primitivos, tambien int. Mejor para numeros
		System.out.println(a == b);
		System.out.println(a == c);
		//equals compara contenido pero no int. Mejor para texto
		System.out.println(a.equals(c));
		
		//Trim
		System.out.println(" Hola, me llamo Fabrizio ".trim());
		
		//Replace
		System.out.println("Hola, me llamo Fabrizio".replace("Fabrizio", "Fab"));
		
		//Format
		//%s es texto, %d es numero entero, %f es decimales
		var age = 20;
		System.out.println(String.format("Hola me llamo %s. Tengo %d.", name, age));
	}
	
}
