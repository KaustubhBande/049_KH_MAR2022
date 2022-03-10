class P9
{
	public static void main(String args[])
	{
		byte b=64;
		for(byte i=1; i<=5; i++)
		{
			for(byte j=4; j>=i; j--)
				System.out.print(" ");
			for(byte k=1; k<=i; k++)
				System.out.print((char)(b+k)+" ");
			System.out.println();
		}
	}
}


    A
   A B
  A B C
 A B C D
A B C D E