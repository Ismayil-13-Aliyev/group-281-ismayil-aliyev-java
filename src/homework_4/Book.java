package homework_4;

public class Book {
	String title;
	String autor;
	int year;
	
	public Book(String title, String autor, int year) {
		this.title = title;
		this.autor = autor;
		this.year = year;
	}
	
	public Book(String title, String autor) {
		this.title = title;
		this.autor = autor;
		year = 0;
	}
}
