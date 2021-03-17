package library;

public class Book {

    private String title;
    private Author author;

    // book constructor
    public Book(String title, Author auth) {
        this.title = title;
        this.author = auth;
    }

    // returns the book title
    public String getTitle() {
        return title;
    }

    // returns the name of the author of the current book
    public String getAuthorName() {
        return author.getName();
    }

    // returns the birth year of the author of the current book
    public int getAuthorBirthYear() {
        return author.getBirthYear();
    }

    // returns the book title and its author's name
    public String toString() {
        return title + " written by " + author.toString();
    }
}
