package library;

public class Author {

	private String name;
	private int birthYear;

	// Author constructor
	public Author(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	// returns the author's name
	public String getName() {
		return name;
	}

	// returns the author's year of birth
	public int getBirthYear() {
		return birthYear;
	}

	//returns the author's age
	public int getAge(int thisYear) {
		return thisYear - birthYear;
	}

	//prints the authors name and birth year
	public String toString() {
		return name + "(" + birthYear + ")";
	}
}
