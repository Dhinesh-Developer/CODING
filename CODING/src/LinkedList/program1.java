package com.LinkedList;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class program1 {
	public static Node removeNthNode(Node head,int n) {
		Node temp = new Node(0);
		temp.next= head;
		Node first = temp;
		Node second = temp;
		for(int i=0;i<n;i++) {
			first = first.next;
		}
		while(first!=null) {
			first =first.next;
			second = second.next;
		}
		second.next = second.next.next;
		
		return temp.next;
		
	}
	
	public static Node middleOfLL(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast = slow.next.next;
		}
		return slow;
	}
	public static Node mergeTwoSortedList(Node l1,Node l2) {
		Node dummy = new Node(0);
		Node temp = dummy;
		
		while(l1.next!=null && l2.next!=null) {
			if(l1.data <= l2.data) {
				temp.next=l1;
				l1=l1.next;
			}else {
				temp.next=l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}
		if(l1!=null) temp.next=l1;
		if(l2!=null) temp.next=l2;
		
		return dummy.next;
	}
	public static boolean detectLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) return true;
		}
		return false;
	}
	public static Node reverseLL(Node head) {
		Node prev =null;
		Node temp= head;
		Node next = null;
		
		while(temp!=null) {
			next = temp.next;
			temp.next=prev;
			prev=temp;
			temp=next;
		}
		return prev;
	}
	public static void printLL(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
//		Node head = new Node(1);
//		head.next = new Node(2);
//		head.next.next = new Node(3);
//		head.next.next.next = head.next;
//		head.next.next.next = new Node(4);
//		printLL(head);
//		head = reverseLL(head);
//		printLL(head);
//		System.out.println(detectLoop(head));
		
		/*
		 * Node l1 = new Node(1);
		l1.next = new Node(3);
		l1.next.next = new Node(5);
		
		Node l2 = new Node(2);
		l2.next = new Node(4);
		l2.next.next = new Node(6);
		 */
	//	Node res = mergeTwoSortedList(l1, l2);
		Node l1 = new Node(1);
		l1.next = new Node(2);
		l1.next.next = new Node(3);
		
		l1.next.next.next= new Node(4);
		l1.next.next.next.next = new Node(5);
		
		
		printLL(l1);
		Node res = middleOfLL(l1);
		System.out.println(res.data);
		Node res1 = removeNthNode(l1, 3);
		printLL(res1);
	}

}
