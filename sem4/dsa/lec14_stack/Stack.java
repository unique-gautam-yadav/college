public class Stack<T> {
    Node<T> f;
    // Node<T> r;

    public boolean isEmpty() {
        return f == null;
    }

    public void push(T data) {
        Node<T> p = new Node<T>(data);
        if (isEmpty()) {
            f = p;
            // f = r = p;
            // f.next = r;
            return;
        } else {
            p.next = f;
            f = p;
        }
    }

    public T peek() {
        T data = f.getData();

        return data;
    }

    public T pop() {
        T data = f.getData();

        f = f.next;

        return data;
    }

    public void display() {
        Node<T> t = f;

        while (true) {
            if (t == null) {
                break;
            }
            System.out.print(t.getData() + "  ");
            t = t.next;
        }
        System.out.println();
    }
}

class Node<T> {
    private T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
