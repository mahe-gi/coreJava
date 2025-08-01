package basicPrograms;
import java.util.Scanner;
class  ArmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		//task-1 : count digits using temp
		int count = 0;
		while (temp!=0)
		{
			count++;
			temp = temp/10;
		}
		
		
		//task-2 : re-initialise temp variable with num
		temp = num;
		
		
		/*task-3 : find sum of digits using a loop, where each digit is raised to 
		the power count of digits. use temp variable*/
		int sum = 0;
		while (temp!=0)
		{
			//step-1 : take last digit from temp
			int ld = temp%10;
			
			//step-2 : multiply last digit, count times
			int product = 1;
			for (int i = 1;i<=count ;i++ )
			{
				product = product * ld;
			}
			
			
			//step-3 : add the product to sum
			sum = sum+product;
			
			
			//step-4 : remove last digit from temp.
			temp = temp/10;
		}
		
		/*task-4 : compare sum with num, if sum and num are equal, print "Armstrong
		number", else print "Not armstrong number".*/
		if (sum==num)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not an Armstrong number");
		}
	}
}