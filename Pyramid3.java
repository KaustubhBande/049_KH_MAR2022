class Pyramid3
{
	public static void main(String args[])
	{
		for(byte i=1; i<=9; i++)
		{
			for(byte k=9; k>i; k--)
				System.out.print(" ");
			for(byte j=1; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}


        *
       * *
      * * *
     * * * *
    * * * * *
   * * * * * *
  * * * * * * *
 * * * * * * * *
* * * * * * * * *