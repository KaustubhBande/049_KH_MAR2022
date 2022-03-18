class String2
{
	public static void main(String [] args)
	{
		String[] a = {"There", "are", "three", "bugs", "and", "nine", "features"};
		for(int i=0; i<a.length; i++)
		{
			switch(a[i])
			{
				case "zero":
				a[i]="one";
				System.out.print(a[i]+" ");
				break;
				case "one":
				a[i]="two";
				System.out.print(a[i]+" ");
				break;
				case "two":
				a[i]="three";
				System.out.print(a[i]+" ");
				break;
				case "three":
				a[i]="four";
				System.out.print(a[i]+" ");
				break;
				case "four":
				a[i]="five";
				System.out.print(a[i]+" ");
				break;
				case "five":
				a[i]="six";
				System.out.print(a[i]+" ");
				break;
				case "six":
				a[i]="seven";
				System.out.print(a[i]+" ");
				break;
				case "seven":
				a[i]="eight";
				System.out.print(a[i]+" ");
				break;
				case "eight":
				a[i]="nine";
				System.out.print(a[i]+" ");
				break;
				case "nine":
				a[i]="ten";
				System.out.print(a[i]+" ");
				break;
				default:
				System.out.print(a[i]+" ");
			}
			
		}
	}
}