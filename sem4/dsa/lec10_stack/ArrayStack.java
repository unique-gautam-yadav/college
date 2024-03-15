public class ArrayStack {
    private int top;
    private int size;
    private int[] elements;

    public ArrayStack(int size) {
        this.top = -1;
        this.size = size;
        elements = new int[size];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top >= size - 1;
    }

    public boolean push(int data) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return false;
        }
        elements[++top] = data;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return Integer.MAX_VALUE;
        }
        System.out.println(elements[top]);
        return elements[top--];
    }

    public int peek() {
        if (top <= 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        System.out.println(elements[top]);
        return elements[top];
    }

    public void display() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
