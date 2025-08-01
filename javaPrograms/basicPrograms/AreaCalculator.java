package basicPrograms;


import java.util.Scanner;



class  AreaCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("	Maruthi area calculator");
		System.out.println("======================================");
		System.out.println("Enter 1 for circle");
		System.out.println("Enter 2 for triangle");
		System.out.println("Enter 3 for rectangle");
		System.out.println("Enter 4 for square");
		System.out.println("Enter 5 for paralellogram");
		System.out.println("Enter 6 for rhombus");
		System.out.println("======================================");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		System.out.println("======================================");
		if (choice==1)
		{
			System.out.println("You have selected circle");
			System.out.println("Enter radius of a circle");
			double r = sc.nextDouble();
			System.out.println("Area of circle is :"+3.14*r*r);
		}
		else if (choice==2)
		{
			System.out.println("You have selected triangle");
			System.out.println("Enter base of a triangle");
			double base = sc.nextDouble();
			System.out.println("Enter height of triangle");
			double th = sc.nextDouble();
			System.out.println("Area of triangle is : "+0.5*base*th);
		}
		else if (choice==3)
		{
			System.out.println("You have selected rectangle");
			System.out.println("Enter length of rectangle");
			double rl = sc.nextDouble();
			System.out.println("Enter breadth of rectangle");
			double rb = sc.nextDouble();
			System.out.println("Area of rectangle is : "+rl*rb);
		}
		else if (choice==4)
		{
			System.out.println("You have selected square");
			System.out.println("Enter side of a square");
			double s = sc.nextDouble();
			System.out.println("Area of square is : "+s*s);
		}
		else if (choice==5)
		{
			System.out.println("You have selected paralellogram");
			System.out.println("Ente base length of a paralellogram");
			double bl = sc.nextDouble();
			System.out.println("Enter vertical height of patralellogram");
			double vh = sc.nextDouble();
			System.out.println("Area of paralellogram is : "+bl*vh);
		}
		else if (choice==6)
		{
			System.out.println("You have selected rhombus");
			System.out.println("Enter first diagonal ");
			double d1 = sc.nextDouble();
			System.out.println("Enter second diagonal ");
			double d2 = sc.nextDouble();
			System.out.println("Area of rhombus is : "+(0.5*(d1+d2))) ;
		}
		else
		{
			System.out.println("Enter valid input");
		}
		
		System.out.println("======================================");
		System.out.println("Thank you.. get lost...!!");
		System.out.println("======================================");
	}
}