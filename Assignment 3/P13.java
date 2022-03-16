class P13
{
	public static void main(String args[])
	{
		byte b=64;
		for(byte i=1; i<=5; i++)
		{
			for(byte j=4; j>=i; j--)
				System.out.print(" ");
			for(byte k=1; k<=i; k++)
				System.out.print((char)(i+b)+" ");
			System.out.println();
		}
	}
}


    A
   B B
  C C C
 D D D D
E E E E E