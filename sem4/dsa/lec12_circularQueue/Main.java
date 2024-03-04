public class Main {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());

        System.out.println();

        q.display();
    }
}