public class DynamicStack {

    Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node p = new Node(data);
        if (isEmpty()) {
            top = p;
            return;
        }

        p.next = top;
        top = p;
        return;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return Integer.MAX_VALUE;
        }
        int d = top.getData();
        System.out.println(d);
        top = top.next;
        return d;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return Integer.MAX_VALUE;
        }
        System.out.println(top.getData());
        return top.getData();
    }

    public void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.getData() + "  ");
            temp = temp.next;
        }
        System.out.println();
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