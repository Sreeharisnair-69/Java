
class Book {	
	String title;
	String author;
	double price;
	Book(){
		title = "Unknown";
		author = "Not assigned";
		price = 0.0;
	}
	public void printDetails(){
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
}
public class Main{
	public static void main(String[] args) {
		Book book = new Book();
		book.printDetails();
	}

}
