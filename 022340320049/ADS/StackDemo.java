class Stack{
	int max;
	int top1, top2;
	int bottom1, bottom2;
	int[] a;
	Stack(int[] a, int max, int top){
		this.a = a;
		this.max = max;
		this.top = top;
	}
	
	void push1(int data){
		if((bottom2 - bottom1) >= 1){
			for(int i=bottom1; i>0; i--){
				a[bottom1+1] = a[bottom1];
			}
			top1++;
			a[top1] = data;
		}
	}
	
}

class StackDemo{
	public static void main(String[] args){
		int[] a = new int[10];
		int n = a.length;
		Stack s1 = new Stack(a, n, -1);
		Stack s2 = new Stack(a, n, n);
	}
}