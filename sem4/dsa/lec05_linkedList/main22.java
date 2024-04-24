import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class main {

    public static boolean searchValue(Node head, int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int searchValue = scanner.nextInt();
        if (searchValue(head, searchValue)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}