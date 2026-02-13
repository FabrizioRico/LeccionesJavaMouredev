/*
 * FuncionesEjercicios
 * En esta clase resolvemos algunos ejercicios relacionados a las funciones
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 6 feb. 2026
 */

package leccion.n07_funciones;

import java.util.ArrayList;

public class FuncionesEjercicios {

	public static void main(String[] args) {
		greeting();
		greetingsTo("Fabrizio");
		System.out.println(minus(5, 8));
		System.out.println(square(9));
		oddOrEven(0);
		System.out.println(isAdult(18));
		System.out.println(lenghtOfString("Fabrizio"));
		
		Integer[] numbers = {10, 5, 15};
		System.out.println(average(numbers));
		System.out.println(factorial(5));
		
		ArrayList<String> artistName = new ArrayList<String>();
		artistName.add("Bryan Ferry");
		artistName.add("Joshua Homme");
		artistName.add("Trent Reznor");
		
		printList(artistName);
		
		
	}
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
		public static void greeting() {
			System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");			
		}
		
		
        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
		public static void greetingsTo(String name) {
			System.out.println("Buenos dias " + name);
		}
		
		
        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
		public static Integer minus(Integer n1, Integer n2) {
			return n1 -= n2;
		}
		
		
        // 4. Crea un método que calcule el cuadrado de un número (n * n).
		public static Integer square(Integer n) {
			return n * n;
		}
		
		
        // 5. Escribe una función que reciba un número y diga si es par o impar.
		public static void oddOrEven(int number) {
			if ((number % 2) == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}
		}

		
        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
		public static boolean isAdult(Integer age){
			if (age >= 18) {
				return true;
			} else {
				return false;
			}
		}
		
		
        // 7. Implementa una función que reciba una cadena y retorne su longitud.
		public static Integer lenghtOfString(String text) {
			var lengthString = text.length();
			return lengthString;
		}
		
		
        // 8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
		public static Integer average(Integer[] numbers) {
			var theSize = numbers.length;
			var theNumbers = 0;
			
			for (Integer integer : numbers) {
				theNumbers += integer;
			}
			return theNumbers / theSize;
		}
		
		
        // 9. Escribe un método que reciba un número y retorna su factorial.
		public static Integer factorial(Integer number) {
			var resultado = 1;
			for (int i = 1; i <= number; i++) {
				resultado *= i;
			}
			return resultado;
		}
		
		
        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
		public static void printList(ArrayList<String> artistName) {
			for (String string : artistName) {
				System.out.println(string);
			}	
		}
		
		
}
