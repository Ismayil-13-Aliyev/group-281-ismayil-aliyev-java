package classwork_12;

public class Book {
	String autor;
	String title;
	int year;
	boolean isAveylable = true;
	
	public void borrow () {
		if (isAveylable == true) {
			System.out.println("Mojno vzat");
		} else {
			System.out.println("Nelza");
		}
	}
	
	public void returnBook() {
		System.out.println("Ya vernul knigu");
	}
	
	public void getInfo() {
		System.out.println("Autor: " + autor + ", title: " + title + ", year: " + year);
	}
}
