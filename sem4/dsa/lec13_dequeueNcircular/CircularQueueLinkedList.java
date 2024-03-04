public class CircularQueueLinkedList {
    Node rear;
    Node front;

    public boolean isEmpty() {
        return rear == null || front == null;
    }

    public void enqueue(int data) {
        Node p = new Node(data);

        if (isEmpty()) {
            rear = front = p;
            p.next = rear;
            return;
        }

        rear.next = p;
        rear = p;
    }

    public Integer dequeue() throws QueueExceptions {

        if (isEmpty()) {
            throw new EmptyException("Queue is Empty", 404);
        }
        int data = front.getData();

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
        System.out.println(data);
        return data;
    }

    public Integer peak() {

        if (isEmpty()) {
            return null;
        }

        return front.getData();
    }

    public void display() throws QueueExceptions {
        if (isEmpty()) {
            throw new EmptyException("Queue is Empty", 404);
        }
        Node temp = front;

        while (temp != rear) {
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
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}

abstract class QueueExceptions extends Exception {
    String message;
    int code;

    public QueueExceptions(String message, int code) {
        this.message = message;
        this.code = code;
    }
}

class EmptyException extends QueueExceptions {

    public EmptyException(String message, int code) {
        super(message, code);
    }

}

class FullException extends QueueExceptions {

    public FullException(String message, int code) {
        super(message, code);
    }
}