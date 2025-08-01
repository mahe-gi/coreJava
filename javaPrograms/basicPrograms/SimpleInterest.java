package basicPrograms;

//WAPTP simple interest.take principle, rate of interest and time from user.

import java.util.Scanner;
class  SimpleInterest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal amount : ");
		double p = sc.nextDouble();
		System.out.println("Enter rate of interest ");
		double r = sc.nextDouble();
		System.out.println("Enter time duration");
		double t = sc.nextDouble();
		System.out.println("simple interest : "+(p*t*r)/100);
	}
}