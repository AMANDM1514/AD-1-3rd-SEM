class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class FixedLinkedList {

    public static void fixLists(LinkedList A, LinkedList B) {
        Node prevA = null, currA = A.head;
        Node prevB = null, currB = B.head;

        Node oddInA = null, evenInB = null;

        while (currA != null) {
            if (currA.data % 2 != 0) {
                oddInA = currA;
                break;
            }
            prevA = currA;
            currA = currA.next;
        }

        while (currB != null) {
            if (currB.data % 2 == 0) {
                evenInB = currB;
                break;
            }
            prevB = currB;
            currB = currB.next;
        }

        if (oddInA != null && evenInB != null) {
            if (prevA != null) {
                prevA.next = oddInA.next;
            } else {
                A.head = oddInA.next;
            }

            if (prevB != null) {
                prevB.next = evenInB.next;
            } else {
                B.head = evenInB.next;
            }

            oddInA.next = B.head;
            B.head = oddInA;

            evenInB.next = A.head;
            A.head = evenInB;
        }
    }

    public static void main(String[] args) {
        LinkedList A = new LinkedList();
        LinkedList B = new LinkedList();

        A.add(2);
        A.add(4);
        A.add(7); 

        B.add(1);
        B.add(3);
        B.add(6); // Even element in odd list

        System.out.println("Before fixing:");
        System.out.print("List A: ");
        A.display();
        System.out.print("List B: ");
        B.display();

        fixLists(A, B);

        System.out.println("\nAfter fixing:");
        System.out.print("List A: ");
        A.display();
        System.out.print("List B: ");
        B.display();
    }
}
