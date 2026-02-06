/*
 * Funciones
 * En esta clase exploramos...
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 6 feb. 2026
 */

package leccion.n07_funciones;

import java.util.ArrayList;
import java.util.Arrays;

public class Funciones {

	//FUnciones
	
	public static void main(String[] args) {
		
		var users = new ArrayList<>(Arrays.asList("perryelperruno@hotmail.com", "fabrizioriscoalva05@gmail.com"));
		var state = sendEmailWithState("fabrizioriscoalva05@gmail.com");
		
		for (int index = 0; index < 5; index++) {
			sendEmail();
			sendEmailToUser("PerryDios");
			sendEmailToUser("Fabrizio Risco Alva", "fabrizioriscoalva05@gmail.com");
			sendEmailToUser(users);
			System.out.println(state);
			System.out.println(sendEmailWithState(""));
		}
	
	
		
		
	}
	
	
	//Funcion sin parametros
	public static void sendEmail() {
		System.out.println("El email ha sido enviado");
	}
	
	
	//Función con parametros
	//Estamos haciendo sobrecarga a una funcion
	public static void sendEmailToUser(String user) {
		System.out.println("Se envio el email al usuario " + user);
	}
	
	public static void sendEmailToUser(String user, String email) {
		System.out.println("Se envio el email a " + user + " (" + email + ")");
	}
	
	public static void sendEmailToUser(ArrayList<String> emails) {
		for (String email: emails) {
			sendEmailToUser(email);
			System.out.println("Se ha enviado el email a los usuarios " + email);
		}
	}
	
	//Funcion con retorno
	//No se puede hacer sobrecarga si cambiamos el tipo de dato de la funcion original
	public static boolean sendEmailWithState(String email) {
		if (email.isEmpty()) {
			return false; 
		}
		System.out.println("Se ha enviado el email correctamente a " + email);
		
		return true;
	}
}
