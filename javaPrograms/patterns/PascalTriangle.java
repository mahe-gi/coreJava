package patterns;


class PascalTriangle 
{
	public static void main(String[] args) 
	{
		int space = 5;
		int pair = 1;
		for (int i = 1;i<=6 ;i++ )
		{
			for (int a = 1;a<=space ;a++ )
			{
				System.out.print(" ");
			}
			int x = 1;
			int num = i-1;
			int den = 1;
			for (int b = 1;b<=pair ;b++ )
			{
				System.out.print(x+" ");
				x = ((x*num)/den);
				num--;
				den++;
			}
			space--;
			pair++;
			System.out.println();
		}
	}
}



