class P11
{
	public static void main(String args[])
	{
		for(byte i=1; i<=5; i++)
		{
			for(byte j=4; j>=i; j--)
				System.out.print(" ");
			for(int k=6-i; k<=5;k++)
				System.out.print("*");
			for(byte l=1; l< i; l++)
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