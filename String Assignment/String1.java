import java.util.Scanner;
class String1
{
	public static void main(String[] args)
	{
		int v=0;
		int c=0;
		int n=0;
		int o=0;
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter String");
			String S = scan.nextLine();
			//System.out.println(S);
			S=S.toLowerCase();
			for(int x=0; x<S.length(); x++)
			{
				char a = S.charAt(x);
				if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
					v++;
				else if('a'<=a && a<='z')
					c++;
				else if('0'<=a && a<='9')
					n++;
				else
					o++;
			}
			System.out.println("Vowel = "+v);
			System.out.println("Consonant = "+c);
			System.out.println("Numbers = "+n);
			System.out.println("Others = "+o);
	}
}