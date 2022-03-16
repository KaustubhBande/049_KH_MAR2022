class P18
{
	public static void main(String args[])
	{
		byte b=64;
		for(byte i=1; i<=5; i++)
		{
			for(int j=1; j<=6-i; j++)
				System.out.print((char)(b+j)+" ");
			System.out.println();
				
		}
	}
}


/*
A B C D E
A B C D
A B C
A B
A
*/