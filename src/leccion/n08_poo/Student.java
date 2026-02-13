/*
 * Student
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 11 feb. 2026
 */

package leccion.n08_poo;

public class Student {
	
	int score;
	
	public Student(int score) {
		this.score = score;
	}
	
	public void isAproved() {
		if (score >= 60) {
			System.out.println("Ha aprobado el curso satisfactoriamente");
		} else {
			System.out.println("No ha alcanzado el puntaje necesario para aprobar");
		}
	}
}
