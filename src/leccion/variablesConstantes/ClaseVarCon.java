/*
 * ClaseVarCon
 * En esta clase experimentamos con variables y constantes. Asimismo Intentamos
 * despejar cualquier duda que tengamos.
 * 
 * Creado por Fabrizio Risco Alva
 * Creado en 19/01/26
 * 
 */

package leccion.variablesConstantes;

public class ClaseVarCon {
	public static void main(String[] args) {
		
		
		//VARIABLES
		
		//variables en ingles por buenas practicas
		String name = "Fabrizio Risco Alva";
		System.out.println(name);
		
		//Se cambia porque es una variable
		name = "Fabrizzio Rico";
		System.out.println(name);
		
		//name = 1; No funcionara porque name ya tiene tipo de dato String
		
		//int es primitivo, consume menos recursos y es mejor para calculos
		int age = 20;
		System.out.println(age);
		
		
		
		//Var lo que hace es que se infiera el tipo de dato
		var country = "Peru";
		System.out.println(country);
		
		var year = 2020;
		System.out.println(year);
		
		
		//CONSTANTES
		//Esta en estado final por lo tanto ya no puede variar
		//Por buenas practicas, el nombre de la constante va en mayuscula, para 
		//diferenciar de lsa variables
		final String EMAIL = "fabrizioriscoalva05@gmail.com";
		//EMAIL = "fabitorico@gmail.com"; 	MAL: No se cambia porque es 
		System.out.println(EMAIL);
		
	}
}
