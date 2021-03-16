package library;

public class Book {
	
	private String title;
	private Author auth;
	
	// book constructor
	public Book(String title, Author auth)
	{
		this.title=title;
		this.auth = auth;
	}
	
	// returns the book title
	public String getTitle() {
		return title;
	}
	
	// returns the name of the author of the current book
	public String getAuthorName() {
		return auth.getName();
	}
	
	// returns the birth year of the author of the current book
	public int getAuthorBirthYear() {
		return auth.getBirthYear();
	}
	
	// returns the book title and its author's name
	public String toString() {
		return title + " written by " + auth.toString();
	}
}
