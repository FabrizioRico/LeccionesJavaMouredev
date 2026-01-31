/*
 * CondicionalesEjercicios
 * En esta clase realizamos ejercicios relacionados a condicionales
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 27 ene. 2026
 */

package leccion.n04_condicionales;

import java.lang.invoke.VarHandle;

public class CondicionalesEjercicios {

	public static void main(String[] args) {

		// 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a
		// 18).
		var userAge = 18;

		if (userAge >= 18) {
			System.out.println("Tiene edad para votar");
		} else {
			System.out.println("No tiene edad para votar");
		}

		// 2. Declara dos números y muestra cuál es mayor, o si son iguales.
		var n1 = 80;
		var n2 = 80;

		if (n1 > n2) {
			System.out.println("n1 es mayor que n2");
		} else if (n1 < n2) {
			System.out.println("n2 es mayor que n1");
		} else {
			System.out.println("Ambos numeros son iguales");
		}

		// 3. Dado un número, verifica si es positivo, negativo o cero.
		var nAritmetico = -0.1;

		if (nAritmetico > 0) {
			System.out.println("Es positivo");
		} else if (nAritmetico <= -0) {
			System.out.println("Es un numero negativo");
		} else {
			System.out.println("Es cero");
		}

		// 4. Crea un programa que diga si un número es par o impar.
		var nParImpar = 7;

		if ((nParImpar % 2) == 0) {
			System.out.println("Es un numero par");
		} else {
			System.out.println("Es un numero impar");
		}

		// 5. Verifica si un número está en el rango de 1 a 100.
		var nRango = 1;

		if (nRango >= 1 && nRango <= 100) {
			System.out.println("Esta entre 1 y 100");
		} else {
			System.out.println("Esta fuera del rango");
		}

		// 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con
		// switch.
		var dayOfWeek = 5;

		switch (dayOfWeek) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Este dia de la semana no existe");
			break;
		}

		// 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
		// "Suspenso" según la nota (0-100).
		var grade = 80;

		if (grade >= 90) {
			System.out.println("Sobresaliente");
		} else if (grade < 90 && grade >= 65) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Suspendido");
		}

		// 8. Escribe un programa que determine si puedes entrar al cine: debes tener al
		// menos 15 años o ir acompañado.
		var age = 16;
		var hasCompany = true;

		if (age > 15 || hasCompany) {
			System.out.println("Puedes ingresar");
		} else {
			System.out.println("No puede ingresar");
		}

		// 9. Crea un programa que diga si una letra es vocal o consonante.
		char word = 'e';

		switch (word) {
		case 'a':
			System.out.println("Es una vocal");
			break;
		case 'e':
			System.out.println("Es una vocal");
			break;
		case 'i':
			System.out.println("Es una vocal");
			break;
		case 'o':
			System.out.println("Es una vocal");
			break;
		case 'u':
			System.out.println("Es una vocal");
			break;
		default:
			System.out.println("Es una consonante");
			break;
		}
		// 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
		var a = 1;
		var b = 2;
		var c = 3;

		if (a > b && a > c) {
			System.out.println("a es la mayor de las 3");
		} else if (b > a && b > c) {
			System.out.println("b es la mayor de las 3");
		} else {
			System.out.println("c es la mayor de las 3");
		}

	}
}
