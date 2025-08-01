package basicPrograms;


import java.util.Scanner;
class  FactorialOfSingleDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit : ");
		int n = sc.nextInt();
		int product = 1;
		for (int i = n;i>=1 ;i-- )
		{
			product = product * i;
		}
		System.out.println("Factorial value is : "+product);
	}
}
