public class Main {
    public static void main(String[] args) {
        DynamicQueue q = new DynamicQueue();

        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.display();
        // q.dequeue();
        q.dequeue();
        q.display();

        // ArrayQueue q = new ArrayQueue(5);

        // q.enqueue(0);
        // q.dequeue();

        // q.display();
        // q.enqueue(1);
        // q.enqueue(2);
        // q.enqueue(3);
        // q.enqueue(4);

        // q.display();
        // // q.dequeue();
        // q.dequeue();
        // q.display();
        // q.enqueue(10);
        // q.display();

    }
}