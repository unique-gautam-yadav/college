public class Main {
    public static void main(String[] args) {
        // CircularQueueLinkedList q = new CircularQueueLinkedList();

        // try {
        // q.enqueue(0);
        // q.enqueue(1);
        // q.enqueue(2);
        // q.enqueue(3);
        // q.enqueue(4);

        // q.dequeue();

        // q.display();
        // } catch (QueueExceptions e) {
        // System.out.println(e.message);
        // }

        DEQueueArray dq = new DEQueueArray(5);

        dq.addFirst(0);
        dq.addFirst(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);

        dq.display();

        dq.deleteLast();

        dq.addFirst(10);

        dq.display();

    }
}