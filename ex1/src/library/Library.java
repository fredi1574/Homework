package library;

public class Library {

	private Book[] library;
	
	// library constructor
	public Library(int size)
	{
		library = new Book[size];
	}
	
	//assigns a title, author and a catalogue number to a 'book' object 
	public void setBook (int bookNum, String title, Author auth)
	{
		Book book = new Book(title,auth);
		library[bookNum] = book;
	}
	
	// returns the book object under the chosen catalogue number
	public Book getBook(int bookNum)
	{
		return library[bookNum];
	}
}
