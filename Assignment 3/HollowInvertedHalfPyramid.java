class HollowInvertedHalfPyramid
{
	public static void main(String args[])
	{
		for(int k=1; k<=6; k++)
			System.out.print("* ");
		System.out.println();
		for(int i=5; i>=1; i--)
		{
			System.out.print("*");
			for(int y=1; y<=2*i-3; y++)
				System.out.print(" ");
			if(i!=1)
			System.out.print("*");
		System.out.println();
		}
	}
	
}


/*
O/P:
* * * * * *
*       *
*     *
*   *
* *
*
*/