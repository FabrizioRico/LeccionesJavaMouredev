package leccion00.saludo;

import java.util.Scanner;

public class ClaseSaludoEjercicios {
	
	public static void main(String[] args) {
	
    // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
	
		System.out.println("Fabrizio Omar Risco Alva");				//Imprime un nombre en consola

    // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.

		System.out.println("Hola \n Mundo");						//Imprime un mensaje en dos lineas
	
	
    // 3. Añade un comentario sobre lo que hace cada línea del programa.

    // 4. Crea un comentario en varias líneas.
	
	/*
	 * 
	 * Hola
	 * 
	 */

    // 5. Imprime tu edad, tu color favorito y tu ciudad.
	
	System.out.println("Edad: 20 casi 21" );
	System.out.println("Color favorito: Torch red" );
	System.out.println("Ciudad: Callao" );

    // 6. Explora los diferentes System.XXX.println(); más allá de "out".
	
	System.err.println("Mensaje de error");												//Imprime un mensaje de error en rojo
	
	Scanner scanner = new Scanner(System.in);											//Crea un Scanner que sirve para que detecte la entrada de un dato
	System.out.println("Pon tu nombre: ");
	String nombre = scanner.nextLine();													//Espera a que coloquemos nuestro nombre para avanzar con la linea sigueinte
	System.out.println("Pon tu edad");
	int edad = scanner.nextInt();														//Espera un numero para que avance a la siguiente linea
	System.out.println("Tu nombre es " + nombre + " y tu tienes " + edad + " años");	//imprime los datos que introducimos en la consola en una sola linea
	scanner.close();																	//Cierra el scanner
	
	

    // 7. Utiliza varios println para imprimir una frase.

	System.out.println("Fallas el 100% de los tiros");
	System.out.println("que no lanzas.");
	
    // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

	System.out.println(":-()");
	System.out.println("   *   ");
	System.out.println("  ***  ");
	System.out.println(" ***** ");
	System.out.println("   |   ");

    // 9. Intenta ejecutar el programa sin el método main y observa el error.

	/*
	 * El codigo no se ejecuta ya que main indica que 
	 * es un codigo que puede ser ejecutado
	 * 
	 * El error que aparece es el siguiente
	 * Error: Main method not found in class com.estudio.examples.ClaseSaludoEjercicios, please define the main method as:
   		public static void main(String[] args)
		or a JavaFX application class must extend javafx.application.Application
	 * */
	
    //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

		//Simplemente no ejecuta ya que no se encontro la clase con el mismo nombre del archivo
	}
}
