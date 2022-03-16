class P2
{
	public static void main(String args[])
	{
		char c=64;
		for(byte i=1;i<=5;i++)
		{
			for(byte j=1;j<=i;j++)
			System.out.print((char)(j+c)+" ");
		System.out.println();	
		}
		
	}
}


/*
O/P:
A
A B
A B C
A B C D
A B C D E

*/