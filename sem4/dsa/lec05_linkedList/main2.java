import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;
    Node tail;

    public void addLast(int data) {
        if (head == null) {
            tail = head = new Node(data);
        } else {

            tail.next = new Node(data);
            tail = tail.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node p = null;
        Node c = head;
        Node n = c.next;

        while (true) {
            c.next = p;
            p = c;
            c = n;

            if (n == null) {
                break;
            }

            n = n.next;
        }

        head = p;
    }

}

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList ls = new LinkedList();

        for (int i = 0; i < n; i++) {
            ls.addLast(sc.nextInt());
        }
        ls.reverse();
        ls.display();
    }
}