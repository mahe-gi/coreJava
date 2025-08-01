package basicPrograms;
import java.util.Scanner;
public class ArithemeticUsingSwitch {

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("=========================================");
			System.out.println("	   Arithemetic operations");
			System.out.println("=========================================");
			System.out.println("=======ex format: a + b ========");
			int n1 = sc.nextInt();
			char op = sc.next().charAt(0);
			int n2 = sc.nextInt();
			switch (op)
			{
				case '+':System.out.println("Result : "+(n1+n2));
				break;
				case '-':System.out.println("Result : "+(n1-n2));
				break;
				case '*':System.out.println("Result : "+(n1*n2));
				break;
				case '/':System.out.println("Result : "+(n1/n2));
				break;
				case '%':System.out.println("Result : "+(n1%n2));
				break;
				default : System.out.println("Invalid operator");
			}
			System.out.println("=========================================");
			System.out.println("Thank you...!!");
			System.out.println("=========================================");
		}
	
}
