class Star15
{
	public static void main(String args[])
	{
		for(byte i=1; i<=4; i++)
		{
			System.out.print("*");
			for(byte j=1; j<i-1; j++)
				System.out.print(" ");
			if(i!=1)
				System.out.print("*");
			System.out.println();
		}
		for(byte k=1;k<=5; k++)
			System.out.print("*");
	}
}


*
**
* *
*  *
*****