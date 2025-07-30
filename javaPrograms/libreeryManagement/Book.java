package libreeryManagement;

public class Book {
	
	public String title;
	public String author;
	public int year;
	public double price;
	public static int quantity = 4;
	public Book(String title, String author, int year, double price) 
	{
		this.title = title;
		this.author = author;
		this.year = year;
		this.price = price;
	}
	

}
