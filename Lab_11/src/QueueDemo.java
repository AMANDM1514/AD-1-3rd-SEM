public class QueueDemo {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        private Node front, rear;

        public Queue() {
            this.front = this.rear = null;
        }
        public void add(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                System.out.println("Added: " + data);
                return;
            }
            rear.next = newNode;
            rear = newNode;
            System.out.println("Added: " + data);
        }
        public int remove() {
            if (front == null) {
                System.out.println("Queue is empty. Cannot remove.");
                return -1;
            }
            int removedData = front.data;
            front = front.next;

            if (front == null) {
                rear = null;
            }
            System.out.println("Removed: " + removedData);
            return removedData;
        }

        public int peek() {
            if (front == null) {
                System.out.println("Queue is empty. Cannot peek.");
                return -1;
            }
            return front.data;
        }


        public boolean isEmpty() {
            return front == null;
        }

        public void display() {
            if (front == null) {
                System.out.println("Queue is empty.");
                return;
            }
            Node temp = front;
            System.out.println("Queue contents:");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.display();
        System.out.println("Peeked: " + queue.peek());

        queue.remove();
        queue.remove();

        queue.display();

        System.out.println("Peeked: " + queue.peek());

        queue.remove();

        queue.remove();
        queue.peek();
    }
}
