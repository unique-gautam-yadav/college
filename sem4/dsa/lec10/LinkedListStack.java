public class LinkedListStack {
    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node p = new Node(data);
        if (top == null) {
            top = p;
            return;
        }

        p.prev = top;
        top.next = p;
        top = p;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        int d = top.getData();

        Node temp = top;
        top = temp.prev;
        temp.prev = null;
        top.next = null;

        System.out.println(d);
        return d;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }

        System.out.println(top.getData());
        return top.getData();
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("stack underflow");
            return;
        }
        Node temp = top;

        while (temp.prev != null) {
            System.out.print(temp.getData() + "  ");
            temp = temp.prev;
        }
        System.out.println(temp.getData());
    }
}

class Node {
    Node prev;
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