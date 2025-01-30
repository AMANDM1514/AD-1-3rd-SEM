public class StackDemo {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
        private Node top;

        public Stack() {
            top = null;
        }
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
            System.out.println("Pushed: " + data);
        }
        public int pop() {
            if (top == null) {
                System.out.println("Stack is empty. Cannot pop.");
                return -1; 
            }
            int poppedData = top.data;
            top = top.next;
            System.out.println("Popped: " + poppedData);
            return poppedData;
        }
        public int peek() {
            if (top == null) {
                System.out.println("Stack is empty. Cannot peek.");
                return -1; 
            }
            return top.data;
        }
        public boolean isEmpty() {
            return top == null;
        }
        public void display() {
            if (top == null) {
                System.out.println("Stack is empty.");
                return;
            }
            Node temp = top;
            System.out.println("Stack contents:");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Peeked: " + stack.peek());

        stack.pop();
        stack.pop();

        stack.display();

        System.out.println("Peeked: " + stack.peek());

        stack.pop();

        // Attempt to pop or peek on an empty stack
        stack.pop();
        stack.peek();
    }
}
