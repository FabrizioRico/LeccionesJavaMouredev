package leccion.variablesConstantes;

public class VarConsEjercicios {

	public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.

		String name = "Fabrizio Risco Alva";
		System.out.println(name);
		
        // 2. Crea una variable de tipo int y asígnale tu edad.

		int age = 20;
		System.out.println(age);
		
        // 3. Crea una variable double con tu altura en metros.

		double height = 1.75;
		System.out.println(height);
		
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.

		Boolean likesProgramming = true;
		System.out.println(likesProgramming);
		
        // 5. Declara una constante con tu email.

		final String EMAIL = "fabrizioriscoalva05@gmail.com";
		System.out.println(EMAIL);
		
        // 6. Crea una variable de tipo char y guárdale tu inicial.

		char nameInitial = 'F';
		System.out.println(nameInitial);
		
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.

		String location = "Callao";
		System.out.println(location);
		
		location = "San Miguel";
		System.out.println(location);
		
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.

		int a = 30;
		int b = 49;
		
		System.out.println(a + b);
		
        // 9. Imprime el tipo de dos variables creadas anteriormente.

		System.out.println(name + " es tipo " + name.getClass().getSimpleName());
		System.out.println(likesProgramming + " es tipo " + likesProgramming.getClass().getSimpleName());
		
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
		
		Integer RandomNumber;
		RandomNumber = 7;
		
		System.out.println(RandomNumber);
		
    }
	
}
