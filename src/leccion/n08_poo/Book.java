/*
 * Book
 * 
 * Creado por: Fabrizio Risco Alva
 * Creado en: 10 feb. 2026
 */

package leccion.n08_poo;

public class Book {
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void presentation() {
		System.out.println(title + " por " + author);
	}
}
