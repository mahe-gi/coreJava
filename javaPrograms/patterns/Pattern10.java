package patterns;

/*
 
        *
      * * * 
    * * * * *
  * * * * * * * 
* * * * * * * * * 
  
 */

class Pattern10 
{
public static void main(String[] args) 
{
int space = 4;
int star = 1;
for (int i = 1;i<=5 ;i++ )
{
	//step-1 : print space using a loop
	for (int a = 1;a<=space ;a++ )
	{
		System.out.print("   ");
	}
	
	//step-2 : print stars using a loop
	for (int b = 1;b<=star ;b++ )
	{
		System.out.print(" * ");
	}
	
	//step-3 : decrement the space variable
	space--;
	
	//step-4 : increase star variable by 2
	star = star + 2;
	
	//step-5 : go to next line
	System.out.println();
}
}
}