package basicPrograms;
import java.util.Scanner;
class  PalindromeOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (temp!=0)
		{
			int ld = temp%10;
			
			sum = sum*10+ld;
			
			temp = temp/10;
		}
		System.out.println("reverse of "+num+" is : "+sum);
		if (sum==num)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not a palindrome number");
		}
	}
}