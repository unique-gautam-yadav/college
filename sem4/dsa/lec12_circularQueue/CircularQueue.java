public class CircularQueue {
    int r;
    int f;
    int size;
    int[] elements;

    public CircularQueue(int size) {
        r = -1;
        f = -1;
        this.size = size;
        elements = new int[size];
    }

    public boolean isFull() {
        return f == (r + 1) % size;
    }

    public boolean isEmpty() {
        return f == -1 && r == -1;
    }

    public void enqueue(int data) {
        if (isFull())
            return;

        if (isEmpty()) {
            f = 0;
            r = 0;
            elements[r] = data;
            return;
        }
        r++;
        r = r % size;
        elements[r] = data;
        return;
    }

    public int dequeue() {

        if (isEmpty()) {
            return Integer.MAX_VALUE;
        }

        if (f == r) {
            int v = elements[f];
            f = -1;
            r = -1;
            return v;
        }

        int val = elements[f];

        f = (++f) % size;

        return val;
    }

    public int peak() {
        if (isEmpty()) {
            return Integer.MAX_VALUE;
        }

        return elements[f];
    }

    public void display() {
        if (isEmpty()) {
            return;
        }

        int t1 = f;
        int t2 = r;

        while (t1 != t2) {
            System.out.print(elements[t1] + "  ");
            t1 = (++t1) % size;
        }

        System.out.println(elements[t1]);
    }

}
