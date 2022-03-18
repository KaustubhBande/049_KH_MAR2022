class FullHollowPyramid
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=5; k>=i; k--)
				System.out.print(" ");
			System.out.print("*");	
			for(int y=1; y<=2*i-3; y++)
				System.out.print(" ");
			if(i!=1)
			System.out.print("*");
			System.out.println();
			
		}
		for(int l=1; l<=6; l++)
				System.out.print("* ");
	}
	
}


/*
O/P:
     *
    * *
   *   *
  *     *
 *       *
* * * * * *
*/
