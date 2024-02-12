public class DEQueueArray {
    int max;
    int f;
    int r;
    Integer[] elements;

    public DEQueueArray(int size) {
        elements = new Integer[size];
        max = size;
        f = r = -1;
    }

    public boolean isFull() {
        return f == (r + 1) % max;
    }

    public boolean isEmpty() {
        return f == -1 && r == -1;
    }

    public void addLast(int data) {
        if (isFull()) {
            return;
        }
        if (isEmpty()) {
            f = r = 0;
            elements[0] = data;
            return;
        }

        if (r == max - 1) {
            r = 0;
        } else {
            r++;
        }

        elements[r] = data;
    }

    public void addFirst(int data) {
        if (isFull()) {
            return;
        }
        if (isEmpty()) {
            f = r = 0;
            elements[0] = data;
            return;
        }

        if (f == 0) {
            f = max - 1;
        } else {
            f--;
        }

        elements[f] = data;
    }

    public int deleteFirst() {
        if (isEmpty()) {
            return Integer.MAX_VALUE;
        }

        if (f == r) {
            int v = elements[f];
            f = -1;
            r = -1;
            return v;
        }

        int data = elements[f];

        if (f == max - 1) {
            f = 0;
        } else {
            f++;
        }

        System.out.println(data);

        return data;
    }

    public int deleteLast() {
        if (isEmpty()) {
            return Integer.MAX_VALUE;
        }

        if (f == r) {
            int v = elements[f];
            f = -1;
            r = -1;
            return v;
        }

        int data = elements[r];

        if (r == 0) {
            r = max - 1;
        } else {
            r--;
        }

        System.out.println(data);

        return data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("EMPT");
        }

        int t1 = f;
        int t2 = r;

        while (t1 != t2) {
            System.out.print(elements[t1] + "  ");
            t1 = (++t1) % max;
        }
        System.out.println(elements[t1]);
    }
}
