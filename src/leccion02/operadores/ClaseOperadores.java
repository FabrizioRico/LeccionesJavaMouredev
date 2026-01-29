/*
 * ClaseOperadores
 * En esta clase exploramos los operadores aritmeticos, asignacion, comparacion, logicos y unarios
 * 
 * Creado por Fabrizio Risco Alva
 * Creado en: 23/01/2026
 */


package leccion02.operadores;

public class ClaseOperadores {

	public static void main(String[] args) {
		
		//Aritmetica
		double a = 9;
		var b = 5;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		
		//Asignacion. Cada variable tiene historia. 1er op 5. 2da op 10. 3er op 11
		a = b;
		System.out.println(a);
		
		a = b * 2;
		System.out.println(a);
		
		a += 1;					//a = a +1; se puede hacer con los otros operadores aritmeticos
		System.out.println(a);
		
		a -= 1;					
		System.out.println(a);

		a *= 2;					
		System.out.println(a);
		
		a /= 2;					
		System.out.println(a);
		
		a %= 1;					
		System.out.println(a);
		
		
		//Operaciones de comparación o relacionales
		System.out.println(a == b);
		System.out.println(a == 0);
		System.out.println(a != b);						//Distinto de
		System.out.println(a > b);						//mayor que
		System.out.println(a >= b);						//mayor o igual que
		System.out.println(a < b);						//menor que
		System.out.println(a <= b);						//menor o igual qe
		
		
		//Operaciones logicas
		// Y (AND)
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(9 > 5 && 7 == 2);
		
		//O (OR)
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(9 > 5 || 7 == 2);
		
		//No, Negacion (NOT)
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(!(9 > 5) || 7 == 2);
		
		//Operaciones Unarios
		System.out.println(+b);
		System.out.println(-b);
		System.out.println(++b);			//incrementa antes de imprimir
		System.out.println(b++);			//incrementa despues de imprimir
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b--);
		System.out.println(b);
		
	}
	
}
