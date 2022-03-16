class P8_2
{
	public static void main(String args[])
	{
		for(byte i=1; i<=5; i++)
		{
			for(byte j=4; j>=i; j--)
				System.out.print(" ");
			for(byte k=5; k>5-i; k--)
				System.out.print(k+" ");
			System.out.println();
		}
	}
}


/*
    5
   5 4
  5 4 3
 5 4 3 2
5 4 3 2 1
*/