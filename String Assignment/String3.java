class String3
{
	public static void main(String[] args)
	{
		char[] a = {'a','b','c','c','d','d','d','e'};
		char[] b = {'a','a','b','b','b','b','a','a','a'};
		for(int i=0; i<a.length; i++)
		{
			if(i==0)
				System.out.print(a[i]);
			else
			{
				char x = a[i];
				char y = a[i-1];
			if(x!=y)
				System.out.print(a[i]);
			}
		}
		System.out.println();	
		for(int i=0; i<b.length; i++)
		{
			if(i==0)
				System.out.print(b[i]);
			else
			{
				char x = b[i];
				char y = b[i-1];
			if(x!=y)
				System.out.print(b[i]);
			}
		}
		
	}
}