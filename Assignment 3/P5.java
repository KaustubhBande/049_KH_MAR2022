class P5
{
	public static void main(String args[])
	{
		byte b=64;
		for (byte i=1; i<=5; i++)
		{
			for(byte j=1;j<=i; j++)
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


//without brackets to 'char'
P5.java:9: error: '.class' expected
                                System.out.print(char(i+b)+" ");
                                                     ^
P5.java:9: error: ';' expected
                                System.out.print(char(i+b)+" ");
                                                      ^
P5.java:9: error: not a statement
                                System.out.print(char(i+b)+" ");
                                                       ^
P5.java:9: error: ';' expected
                                System.out.print(char(i+b)+" ");
                                                         ^
4 errors