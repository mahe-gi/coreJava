package basicPrograms;


//WAPTP sum of given two numbers.take two numbers from user.

import java.util.Scanner;

public class InputFromUserSum {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		int sum = n1+n2;
		System.out.println("Sum of numbers is "+sum);
	}
}