package basicPrograms;



//WAPTP whether a person is eligible for writing IAS exam or not.take age from user.(age>=21 &&age<=32)

import java.util.Scanner;
class  IASeligibility
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		if (age>=21&&age<=32)
		{
			System.out.println("you are eligible for writting IAS exam");
		}
		else
		{
			System.out.println("you are not eligible for writting IAS exam");
		}
	}
}