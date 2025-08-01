package Classes;
class Pizza
{
	public String name;
	public String size;
	public double price;
	public int pieces = 8;
	
	public Pizza(String name,String size,double price)
	{
		this.name = name;
		this.size = size;
		this.price = price;
	}
	public void orderPizza()
	{
		System.out.println("Pizza ordered.....\nOrder details : ");
		System.out.println("Pizza name : "+name);
		System.out.println("Pizza size : "+size);
		System.out.println("Price : "+price);
		System.out.println("Number of pieces : "+pieces);
	}
	public void eatPieces(int n)
	{
		System.out.println("number of pieces consumed : "+n);
		System.out.println("Number of pieces left : "+(pieces-n));
	}
	public void ParcelPizza(String address)
	{
		System.out.println("Pizza parcel confirmed.....\nOrder details : ");
		System.out.println("Pizza name : "+name);
		System.out.println("Pizza size : "+size);
		System.out.println("Price : "+price);
		System.out.println("Number of pieces : "+pieces);
		System.out.println("Adresss details : "+address);
	}
}
public class PizzaMainClass
{
	public static void main(String[] args) 
	{
		Pizza chickenPizza = new Pizza("Chicken-pizza","medium",350);
		chickenPizza.orderPizza();
		chickenPizza.eatPieces(3);
		chickenPizza.ParcelPizza("NiT, Ameerpet");
		
	}
}
