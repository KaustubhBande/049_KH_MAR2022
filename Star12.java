class Star12
{
	public static void main(String args[])
	{
		for(byte i=1; i<=5; i++)
		{
			for(byte j=5; j>=i; j--)
				System.out.print("*");
			System.out.println();
		}
		for(byte i=2; i<=5; i++)
		{
			for(byte j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}


*****
****
***
**
*
**
***
****
*****