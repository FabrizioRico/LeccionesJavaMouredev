/*
 * Condicionales
 * En esta clase exploramos las condicionales if-else y switch
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 27 ene. 2026
 */

package leccion.n04_condicionales;

public class Condicionales {

	public static void main(String[] args) {

		// Condicionales

		var age = 18;

		System.out.println(age >= 18);

		// If-Else (Mejor para rangos, operaciones condicionales, logicas)
		if (age > 18) {
			System.out.println("El usuario es mayor de edad");
		} else if (age == 18) {
			System.out.println("El usuario acaba de cumplir 18 años");
		} else {
			System.out.println("El usuario es menor de edad");
		}

		// Switch (Mejor para valores fijos. Ejemplo: dias, estados, opciones)
		var day = 1;

		switch (day) {
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
			System.out.println("Ese dia no existe");
			break;
		}

	}
}
