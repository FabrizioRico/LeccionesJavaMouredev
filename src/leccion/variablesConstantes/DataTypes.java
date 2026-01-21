/*
 * DataTypes
 * En esta clase exploramos los diversos tipos de dato que hay en java
 * 
 * Creado por Fabrizio Risco Alva
 * Creado en: 20/01/26
 */

package leccion.variablesConstantes;

public class DataTypes {

	public static void main(String[] args) {
		
		//Tipos de datos primitivos
		
		int myInt = 6;
		System.out.println(myInt);
		
		double myDouble = 7.69;
		System.out.println(myDouble);
		
		char myChar = 'a';									//cualquier caracter
		System.out.println(myChar);
		
		boolean myBoolean = true;
		System.out.println(myBoolean);
		
		
		/*float (mas corto que double, menos preciso, para ahorrar memoria, f al final del numero 67.8f)
		 * long (mas largo que int, para contadores grandes) 
		 * byte (enteros mas pequeños, consume poca memoria)
		 */
		
		//Primitivos son mas rapidos pero no tienen metodos y no acepta null
		
		
		//Tambien se les conoce como wrappers, objetos o clases, estos si tienen metodos y pueden aceptar null
		
		Boolean myBooleanClass = false;
		System.out.println(myBooleanClass);
		
		String myStringClass = "Cadenita";
		System.out.println(myStringClass);
		
		Integer myIntClass = 69;
		System.out.println(myIntClass);
		
		//Como saber de que tipo de dato es una clase
		System.out.println(myStringClass + myStringClass.getClass().getSimpleName());
		
	}
}
