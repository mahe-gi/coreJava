package libreeryManagement;

public class LibreryManagement {
	
	
	
				public static Book[] addBook(Book [] books,Book newBook)
				{
					Book [] newList = new Book[books.length+1];
					
					for(int i = 0;i<=books.length-1;i++)
					{
						newList[i] = books[i];
					}
					
					newList[newList.length-1] = newBook;
					
					Book.quantity++;
					
					return newList;
					
				}
				
				
	public static void main(String[] args) 
	{
		Book b1 = new Book("Java Basics", "Alice", 2018, 399.99);
	    Book b2 = new Book("Advanced Java", "Bob",2021, 499.50);
	    Book b3 = new Book("Data Structures in Java", "Alice",2022,450.00);
	    Book b4 = new Book("Intro to OOP", "Charlie", 2019, 350.75);
		Book[] books = {b1,b2,b3,b4};
		
		books = addBook(books,new Book("C language","Robert",2015,389.99));
		
		for(Book book: books)
		{
			System.out.println("Book name : "+book.title);
			System.out.println("Book Author : "+book.author);
			System.out.println("Book published year : "+book.year);
			System.out.println("Book price : "+book.price);
		}
		System.out.println("Total number of books : "+Book.quantity);
	}

}
