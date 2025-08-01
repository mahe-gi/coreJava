package basicPrograms;
class ProductOfNumbers1To5 
{
	public static void main(String[] args) 
	{
		int product = 1;
		/*for (int i = 1;i<=5 ;i++ )
		{
			product = product * i;
		}*/
		
		int i = 1;
		while (i<=5)
		{
			product = product * i;
			i++;
		}
		
		
		System.out.println(product);
	}
}
