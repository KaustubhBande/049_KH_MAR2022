class Star9
{
	public static void main(String args[])
	{
		for(byte i=1; i<=5; i++)
		{
			for(byte j=4; j>=i; j--)
				System.out.print(" ");
			for(byte k=1; k<=i; k++)
				System.out.print("*");
			System.out.println();
		}
		for(byte i=1; i<=4; i++)
		{
			for(byte j=1; j<=i; j++)
				System.out.print(" ");
			for(byte k=4; k>=i; k--)
				System.out.print("*");
			System.out.println();
		}
	}
}


    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *