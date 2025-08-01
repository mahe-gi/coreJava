package recursion;

public class SumOfDigits {
	
	
	public static int sumOfdigits(int num,int sum) {
		
		if(num==0) {
			return sum;
		}
		
		sum=sum+num%10;
		num/=10;
		
		
		return sumOfdigits(num,sum);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(sumOfdigits(153, 0));
		
	}
	
	

}

