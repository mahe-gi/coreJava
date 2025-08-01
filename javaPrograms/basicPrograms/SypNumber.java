package basicPrograms;
import java.util.Scanner;
class  SypNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;
		while (num!=0)
		{
			//step-1 : take last digit from num
			int ld = num%10;
			
			//step-2 : add last digit to sum
			sum = sum+ld;
			
			//step-3 : multiply last digit with product
			product = product*ld;
			
			//step-4 : remove last digit from num
			num = num/10;
		}
		
		System.out.println("Sum of digits : "+sum);
		System.out.println("product of digits : "+product);
		
		if (sum==product)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("not a Spy number");
		}
		
	}
}