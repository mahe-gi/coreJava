package basicPrograms;

//WAPTP area of circle. take radius from user.(formula used : 3.14*r*r).

import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of a circle ");
		double r = sc.nextDouble();
		System.out.println("Area is : "+3.14*r*r);
	}
}
