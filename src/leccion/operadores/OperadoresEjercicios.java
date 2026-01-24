/*
 * Ejercicios
 * En esta clase desarrollamos diferentes ejercicios basado en operadores
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 23 ene. 2026
 */

package leccion.operadores;

public class OperadoresEjercicios {

	public static void main(String[] args) {
		
		// 1. Crea una variable con el resultado de cada operación aritmética.

		double nAritmetico = 20;
		
		System.out.println(nAritmetico + 20);
		System.out.println(nAritmetico - 20);
		System.out.println(nAritmetico * 20);
		System.out.println(nAritmetico / 20);
		System.out.println(nAritmetico % 20);
		
        // 2. Crea una variable para cada tipo de operación de asignación.

		double nAsignacion = 40;
		nAsignacion = nAritmetico;
		System.out.println(nAsignacion);
		nAsignacion = nAritmetico * 2;
		System.out.println(nAsignacion);
		nAsignacion = nAritmetico / 2;
		System.out.println(nAsignacion);
		nAsignacion = nAritmetico + 2;
		System.out.println(nAsignacion);
		nAsignacion = nAritmetico - 2;
		System.out.println(nAsignacion);
		
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
		System.out.println("nAsignacion = " + nAsignacion);
		System.out.println("nAritmetico = " + nAritmetico);

		System.out.println(nAsignacion < nAritmetico);
		System.out.println(nAsignacion != nAritmetico);
		System.out.println(nAsignacion == 18);
		
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

		System.out.println(nAritmetico < nAsignacion);
		System.out.println(nAritmetico == nAsignacion);
		System.out.println(nAritmetico == 40);
        // 5. Utiliza el operador lógico and.

		System.out.println(49 > 40 && 53 > 20);
		
        // 6. Utiliza el operador lógico or.

		System.out.println(75 == 50 || 25 < 45);
		
        // 7. Combina ambos operadores lógicos.

		System.out.println((456 == 4563 && 856 >= 12) || 458 > 10);
		
        // 8. Añade alguna negación.

		System.out.println(20 != 552);
		
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
		
		System.out.println(nAritmetico++);
		System.out.println(nAritmetico);
		System.out.println(--nAritmetico);
		System.out.println(++nAritmetico);
		
        // 10. Combina operadores aritméticos, de comparación y lógicos.
		
		System.out.println((nAritmetico + 20) >= nAsignacion && nAritmetico > 20);
		
	}
	
}
