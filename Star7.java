class Star7
{
	public static void main(String argap[])
	{
		for( byte i=1; i<=5; i++)
		{
			for(byte j=4; j>=i; j--)
				System.out.print(" ");
			for(byte k=1; k<=(2*(i-1))+1; k++)
				System.out.print("*");
			System.out.println();
		}
		for( byte l=1; l<=4; l++)
		{
			for(byte m=1; m<=l; m++)
				System.out.print(" ");
			for(byte n=7; n>=(2*(l-1))+1; n--)
				System.out.print("*");
			System.out.println();
		}
	}
}


    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *