/*
 * StringsEjercicios
 * En esta clase realizamos ejercicios relacionados a la clase String
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 26 ene. 2026
 */

package leccion.strings;

public class StringsEjercicios {
	
    public static void main(String[] args) {

    	String ArtistName = "Alice In Chains";
    	String AlbumName = "Dirt";
    	Integer YearOfRelease = 1992;
    	
        // 1. Concatena dos cadenas de texto.

    	
    	System.out.println(ArtistName + " | " + AlbumName);
    	
        // 2. Muestra la longitud de una cadena de texto.
    	System.out.println(ArtistName.length());
    	
        // 3. Muestra el primer y último carácter de un string.
    	System.out.println(ArtistName.charAt(0) + " " + ArtistName.charAt(ArtistName.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
    	System.out.println(ArtistName.toUpperCase() + " " + AlbumName.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
    	System.out.println(AlbumName.toLowerCase().contains("dirt"));
    	
        // 6. Formatea un string con un entero.
    	System.out.println(String.format("%s se lanzo en el año %d", AlbumName, YearOfRelease));
    	
        // 7. Elimina los espacios en blanco al principio y final de un string.
    	System.out.println(AlbumName + " -es considerado uno de los mejores albumes del Grunge ".trim());
    	
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
    	System.out.println("El genero Grunge es un genero originado en Seattle a finales de los años 80".replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
    	System.out.println(ArtistName.equals(AlbumName));
    	
        // 10. Comprueba si dos strings tienen la misma longitud.
    	System.out.println(ArtistName.length() == ArtistName.length());
    }
}
