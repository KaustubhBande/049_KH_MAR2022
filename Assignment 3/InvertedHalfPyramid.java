class InvertedHalfPyramid
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int y=5; y>=i; y--)
				System.out.print("*");
			System.out.println();
		}
	}
	
}


/*
O/P:
*****
****
***
**
*
*/