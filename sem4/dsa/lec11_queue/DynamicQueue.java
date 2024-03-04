public class DynamicQueue {
    Node front;
    Node rear;

    public boolean isEmpty() {
        return rear == null;
    }

    public void enqueue(int data) {
        Node p = new Node(data);

        if (isEmpty()) {
            front = rear = p;
            return;
        }

        Node temp = rear;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = p;
    }

    public void dequeue() {
        if (this.isEmpty()) {
            System.out.println("HE");
            return;

        }

        System.out.println(front.getData());
        front = front.next;

    }

    public void peek() {
        if (this.isEmpty()) {
            System.out.println("HE");
            return;

        }

        System.out.println(front.getData());
    }

    public void display() {
        if (this.isEmpty()) {
            System.out.println("HE");
            return;

        }

        Node temp = front;

        while (temp.next != null) {
            System.out.print(temp.getData() + "  ");
            temp = temp.next;
        }

        System.out.println(temp.getData());
    }
}

class Node {
    private int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }
}