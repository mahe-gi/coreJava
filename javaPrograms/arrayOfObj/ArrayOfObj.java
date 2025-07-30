package arrayOfObj;



public class ArrayOfObj {
	public static void main(String[] args) {
//		main starting
		
		
//		creating array of objects 
		Student[] a = {new Student("Mahesh",71,24),new Student("Pandu",72,22),new Student("Ganesh",73,23)};
		
//		printing the display method from each object
		for(Student std : a) {
			std.display()	;
		}
		
		
//		creating User Class 
		User[] usr = {new User("mahesh","bro","+919908835692"),new User("pandu","pandi","+843134"),new User("gani","brooo","+918835692")};
		
//		printing using for of loop userName 
		for(User u:usr) {
			System.out.println(u.userName);
			
			
		}
		Book[] book = {new Book("the Four Agreement","Miguel ruiz",2000,2),new Book("Attitude is everything","Mahesh",1999,1)};
		
		for(Book b:book) {
			
			System.out.println(b.author);
			
		}
	
		
		
		
		
		
		
		
//	main ending	
	}
	
	
	
	
}

