package Constructor;


class User
{
	public String title;
	public String lastName;
	public String foreName;
	public String address;
	public User(String title, String lastName, String foreName)
	{
		this.title = title;
		this.lastName = lastName;
		this.foreName = foreName;
	}
	public User(String title, String lastName, String foreName, String address)
	{
		this(title,lastName,foreName);
		this.address = address;
	}
}

public class Constructors 
{
	public static void main(String[] args) 
	{
		User shashi = new User("Mr","Dhar","Shashi","Hyderabad");
		User rohit = new User("Mr","singh","Rohith");
		System.out.println(shashi.address);
		
	}
}