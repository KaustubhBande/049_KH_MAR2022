class Star5
{
	public static void main(String args[])
	{
		for(byte i=1; i<=5; i++)
		{
			for(byte k=4; k>=i; k--)
				System.out.print(" ");
			for(byte j=1; j<=(2*(i-1)+1); j++)
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