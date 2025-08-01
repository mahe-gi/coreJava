package patterns;


//
//10 11 12 13 14
//15 16 17 18 19
//20 21 22 23 24
//25 26 27 28 29
//30 31 32 33 34

class Pattern4 
{
	public static void main(String[] args) 
	{
		int x = 10;
		for (int i = 1;i<=5 ;i++ )
		{
			for (int j = 1;j<=5 ;j++ )
			{
				System.out.print(" "+x+" ");
				x++;
			}
			System.out.println();
		}
	}
}
