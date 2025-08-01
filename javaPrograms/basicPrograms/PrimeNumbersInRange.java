package basicPrograms;
class PrimeNumbersInRange 
{
	public static void main(String[] args) 
	{
		for (int n = 2;n<=100 ;n++ )
		{
			//step-1 : count factors of n.
			int count = 0;
			for (int i = 1;i<=n ;i++ )
			{
				if (n%i==0)
				{
					count++;
				}
			}
			//step-2 : if count is 2, then n is prime. so print n.
			if (count==2)
			{
				System.out.println(n);
			}
		}
	}
}