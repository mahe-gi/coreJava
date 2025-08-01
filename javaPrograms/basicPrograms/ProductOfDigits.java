package basicPrograms;
import java.util.Scanner;
class  ProductOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int product = 1;
		//  run while loop to iterate through all the digits
		while (num!=0)
		{
			//step-1 : take last digit from num  
			int ld = num % 10;
			
			//step-2 : multiply the last digit to product 
			product = product*ld;
			
			
			//step-3 : remove last digit from num
			num = num/10;
		}
		
		System.out.println("Product of digits is : "+product);
	}
}
