import java.util.*;

class Sorting{
	static void print(int[] a1){
		for(int i=0; i<a1.length; i++){
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a1 = new int[size];
		sc.nextLine();
		String str = sc.nextLine();
		String[] s1 = str.split(" ");
		for(int i=0; i<size; i++){
			s1[i] = s1[i].trim();
			a1[i] = Integer.parseInt(s1[i]);
		}
		int current = a1[size - 1];
		int j = a1.length - 2;
		while(j >= 0 && a1[j] > current){
			a1[j+1] = a1[j];
			print(a1);
			j--;
		}
		a1[j+1] = current;
		print(a1);
	}
}