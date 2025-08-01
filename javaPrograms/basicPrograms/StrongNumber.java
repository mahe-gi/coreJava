package basicPrograms;
import java.util.Scanner;
class  StrongNumber
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
			int factorial = 1;
			for (int i = ld;i>=1 ;i-- )
			{
				factorial = factorial * i;
			}
			sum = sum + factorial;
			temp = temp/10;
		}
		System.out.println("sum is : "+sum);
		if (sum==num)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not a Strong number");
		}
	}
}