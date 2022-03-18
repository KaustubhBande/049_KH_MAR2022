class String4
{
	public static void main(String args[])
	{
		int total=0;
		char[] a = {'a','a','b','b','c','c','d','e','e','f','f'};
		for(int i=0; i<a.length && total<1; i++)
		{
			if(i==0)
			{
				if(a[i] != a[i+1])
				{
				System.out.println(a[i]);
				total++;
				}
			}
			else if(a[i] != a[i-1] && a[i] != a[i+1])
			{
				System.out.println(a[i]);
				total++;
			}
		}
		if(total==0)
			System.out.println("\"Not Found\"");
	}
}