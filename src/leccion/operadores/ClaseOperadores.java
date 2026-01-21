package leccion.operadores;

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
		
		
		//Asignacion
		a = b;
		System.out.println(a);
		
		a = b * 2;
		System.out.println(a);
		
		a += 1;					//a = a +1; se puede hacer con los otros operadores aritmeticos
		System.out.println(a);
		
		
	}
	
}
