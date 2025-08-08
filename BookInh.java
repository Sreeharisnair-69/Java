/*
Name: Sreehari Sreekumar Nair
Date: 08 August 2025
Purpose: Use inheritence property to prit details of E-Book and Printed Book. 
*/
class Books{
	String title;
	String author;
	double price;
	
	Books(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public void displayDetails(){
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("Price: "+ price);
	}
}

class Ebook extends Books{
	double fileSizeMB;
	
	Ebook(String title,String author,double price,double fileSizeMB){
		super(title,author,price);
		this.fileSizeMB=fileSizeMB;
	}
	
	public void displayDetails(){
		super.displayDetails();
		System.out.println("File Size (MB): "+ fileSizeMB +"\n");
		
	}
}

class PrintedBook extends Books{
	int numberOfPages;
	
	PrintedBook(String title,String author,double price,int numberOfPages){
		super(title,author,price);
		this.numberOfPages=numberOfPages;
	}
	
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Number Of Pages: "+ numberOfPages);
		
	}
}

public class BookInh {
	public static void main(String[] args) {
		Ebook eb = new Ebook("Ebook title","Ebook author",9.99,250.4);
		eb.displayDetails();
		
		PrintedBook pb = new PrintedBook("Printed book title","Printed book author",99.99,170);
		pb.displayDetails();
	}

}
