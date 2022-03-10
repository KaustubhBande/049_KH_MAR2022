class P10
{
	public static void main(String args[])
	{
		byte b=64;
		for(byte i=1; i<=5; i++)
		{
			for(byte j=4; j>=i; j--)
				System.out.print(" ");
			for(int k=6-i; k<=5;k++)
				System.out.print((char)(b+k)+" ");
			System.out.println();
		}
	}
}


    E
   D E
  C D E
 B C D E
A B C D E