public class LinkedList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	private Node head;
	public LinkedList() {
		this.head = null;
	}
	public void insertAtStart(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public void insertAtPosition(int data, int position) {
		if (position < 1) {
			System.out.println("Position should be 1 or greater.");
			return;
		}
		if (position == 1) {
			insertAtStart(data);
			return;
		}
		Node newNode = new Node(data);
		Node temp = head;
		for (int i = 1; i < position - 1 && temp != null; i++) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Position out of range.");
			return;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	public void deleteAtStart() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		head = head.next;
	}
	public void deleteAtEnd() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}
	public void deleteAtPosition(int position) {
		if (position < 1) {
			System.out.println("Position should be 1 or greater.");
			return;
		}
		if (position == 1) {
			deleteAtStart();
			return;
		}
		Node temp = head;
		for (int i = 1; i < position - 1 && temp != null; i++) {
			temp = temp.next;
		}
		if (temp == null || temp.next == null) {
			System.out.println("Position out of range.");
			return;
		}
		temp.next = temp.next.next;
	}
	public void traverse() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtStart(5);
		list.insertAtPosition(15, 3);
		System.out.println("After insertions:");
		list.traverse();

		list.deleteAtStart();
		list.deleteAtEnd();
		list.deleteAtPosition(2);
		System.out.println("After deletions:");
		list.traverse();

		
		list.reverse();
		System.out.println("After reversing:");
		list.traverse();
	}
}
