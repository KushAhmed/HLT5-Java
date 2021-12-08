
public class Book {

	// variable -> attribute
	String title;
	String author;
	String number_of_pages;
	String publisher;

	// methods

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getNumberOfPages() {
		return number_of_pages;
	}
	public void setNumberOfPages(String number_of_pages) {
		this.number_of_pages = number_of_pages;
	}

	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	// Main method- to run program
	public static void main(String[] args) {
		
		// create object of class Book
		Book b1 = new Book(); // creating object using constructor

		//using set method setting Book's attribute
		b1.setTitle("Java All–in–One For Dummies");
		b1.setAuthor("Doug Lowe");
		b1.setNumberOfPages("960");
		b1.setPublisher("For Dummies");

		System.out.println("Book Information");
		System.out.println("================");

		// Display Book information using String -> b1
		System.out.println("Book Title : "+b1.getTitle());
		System.out.println("Book Author : "+b1.getAuthor());
		System.out.println("Number of Pages : "+b1.getNumberOfPages());
		System.out.println("Publisher : "+b1.getPublisher());
	}

}
