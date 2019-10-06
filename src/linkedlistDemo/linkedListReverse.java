package linkedlistDemo;

public class linkedListReverse {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public void printList(Node node) {
		while(node!=null) {
			System.out.println(node.data+" ");
			node=node.next;
		}
	}
	public Node reverse(Node node) {
		Node previous=null;
		Node current=node;
		Node next= null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		node=previous;
		return node;
	}
	public static void main(String[] args) {
		linkedListReverse list = new linkedListReverse();
		list.head = new Node(85);
		list.head.next=new Node(15);
		list.head.next.next=new Node(4);
		list.head.next.next.next=new Node(20);
		System.out.println("given linked list is");
		list.printList(head);
		head=list.reverse(head);
		System.out.println("reverse linked list is");
		list.printList(head);
	}

}
