package basicPrograms;

import java.util.Scanner;
class FactorsOfAGivenNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		for (int i = 1;i<=n ;i++ )
		{
			//if variable i divides n, then i is factor. print i.
			if (n%i==0)
			{
				System.out.println(i);
			}
		}
	}
}