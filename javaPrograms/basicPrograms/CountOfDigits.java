package basicPrograms;
import java.util.Scanner;
class  CountOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int count = 0;
		//take a loop to count the digits until the number becomes zero
		while (num!=0)
		{
			//step-1 : increment the count
			count++;
			
			
			//step-2 : remove last digit from num
			num = num/10;
		}
		
		
		System.out.println("Count of digits is : "+count);
	}
}