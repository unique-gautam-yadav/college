public class ArrayQueue {

    private int[] elements;
    private int size;
    private int front;
    private int rear;

    public ArrayQueue(int size) {
        elements = new int[size];
        front = rear = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return front == 0 && rear == size - 1;
    }

    public void enqueue(int data) {
        if (isEmpty()) {
            elements[++rear] = data;
            front++;
            return;
        }

        if (isFull()) {
            System.out.println("is Full");
            return;
        }

        elements[++rear] = data;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("empty");
            return;
        }

        if (front == rear) {
            System.out.println(elements[front]);
            front = rear = -1;
            return;
        }

        System.out.println(elements[front++]);

        for (int i = front; i <= rear; i++) {
            elements[i - 1] = elements[i];
        }
        rear--;
        front--;

    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("khaali h");
            return;
        }

        System.out.println(elements[front]);
    }

    public void display() {
        System.out.println();
        if (isEmpty()) {
            System.out.println("empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(elements[i] + "  ");
        }
        System.out.println();
        System.out.println();
    }
}
