package basicPrograms;
class PalindromesFrom1To1000 
{
	public static void main(String[] args) 
	{
		for (int num = 1;num<=1000 ;num++ )
		{
			//step-1 : reverse the num, using temp value.
			int temp = num;
			int reverse = 0;
			while (temp!=0)
			{
				int ld = temp%10;
				reverse = reverse*10 + ld;
				temp = temp/10;
			}
			
			
			//step-2 : if reverse and num are same, then num is palindrome. print num.
			if (reverse==num)
			{
				System.out.println(num);
			}
		}
	}
}