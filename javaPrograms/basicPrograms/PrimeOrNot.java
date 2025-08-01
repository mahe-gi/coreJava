package basicPrograms;

import java.util.Scanner;
class PrimeOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		String result = "Prime number";
		for (int i = 2;i<n ;i++ )
		{
			if (n%i==0)
			{
				result = "not prime number";
				break;
			}
		}
		
		System.out.println(result);
	}
}
