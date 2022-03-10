class Pyramid7
{
	public static void main(String args[])
	{
		for(byte i=1; i<=9; i++)
		{
			for(byte j=1; j<i; j++)
				System.out.print(" ");
			for(byte k=9; k>=i; k--)
				System.out.print((10-i)+" ");
			System.out.println();
		}
	}
}


9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1