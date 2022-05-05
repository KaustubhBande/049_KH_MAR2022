import java.util.*;

class LinkedList{
	Node head = null;
	Node head2 = null;
	void add(int data){
		Node temp = head;
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}
	void reverse(int size){
		Node temp = head;
		Node n = null;
		for(int i=1; i<=size; i++){
			temp = head;
			n = null;
			if(i == 1){
				while(temp.next != null){
					n = temp;
					temp = temp.next;
				}
				head2 = temp;
				temp.next = n;
			}
			else{
				while(temp.next.next != temp){
					n = temp;
					temp = temp.next;
				}
				temp.next = n;
			}
		}
		head = null;
	}
	void reverse(){
		
	}
	void display(){
		Node temp = head2;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class LinkedListDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		int testCase = sc.nextInt();
		int size = sc.nextInt();
		for(int i=0; i<size; i++){
			int input = sc.nextInt();
			list.add(input);
		}
		// list.display();
		list.reverse(size);
		list.display();
	}
}