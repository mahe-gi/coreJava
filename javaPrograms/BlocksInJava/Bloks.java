package BlocksInJava;

class Demo1
{
	public static int k = 12;
	public double r = 34.5;
	static
	{
		System.out.println("SB of class Demo1");
	}
	
	{
		System.out.println("NSB of class Demo1");
	}
	
	public Demo1()
	{
		System.out.println("Constructor of Demo1");
	}
}
public class Bloks 
{
	public static void main(String[] args) 
	{
		System.out.println(Demo1.k);
		Demo1 ob = new Demo1();
		System.out.println(ob.r);
	}
}