class Star6
{
	public static void main(String args[])
	{
		for(byte i=1; i<=5; i++)
		{
			for(byte j=1; j<i; j++)
				System.out.print(" ");
			for(byte k=9; k>=(2*(i-1)+1); k--)
				System.out.print("*");
			System.out.println();
		}
	}
}


*********
 *******
  *****
   ***
    *