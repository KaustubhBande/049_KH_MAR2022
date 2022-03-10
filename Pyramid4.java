class Pyramid4
{
	public static void main(String args[])
	{
		for(byte i=1; i<=9; i++)
		{
			for(byte j=8; j>=i; j--)
				System.out.print("  ");
			for(byte k=1; k<=i; k++)
				System.out.print(k+" ");
			for (int l=i-1; l>=1; l--)
				System.out.print(l+" ");
			System.out.println();
		}
	}
}


                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1



/*
for(byte i=1; i<=9; i++)
		{
			for(byte k=8; k>=i; k--)
				System.out.print("  ");
			for(byte j=1; j<=(2*(i-1))+1; j++)
			{
				if(j<=i)
				System.out.print(j+" ");
				for(j=i+1; j<=(2*(i-1))+1; j++)
					System.out.print( );
			System.out.println();
		}
*/