class P8
{
	public static void main(String args[])
	{
		int c=5;
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>i; j--)
				System.out.print(" ");
			
			int ab=c;
			for(int k=1; k<=i
			; k++)
			{
				System.out.print(ab+" ");
				ab++;
			}
			c--;
			System.out.println();
		}
	}
}


/*
class P8
{
	public static void main(String args[])
	{
		for(byte i=1; i<=5; i++)
		{
			for(byte j=4; j>=i; j--)
				System.out.print(" ");
			for(int k=6-i; k<=5;k++)
				System.out.print(k+" ");
			System.out.println();
		}
	}
}
*/


/*
class P8
{
	public static void main(String args[])
	{
		for(byte i=5; i>=1; i--)
		{
			for(byte j=1; j<i; j++)
				System.out.print(" ");
			for(byte k=i; k<=5; k++)
				System.out.print(k+" ");
			System.out.println();
		}
	}
}
*/


/*
O/P:
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5  
*/