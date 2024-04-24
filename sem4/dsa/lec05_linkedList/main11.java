import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {

    public static ListNode deleteLastNode(ListNode head) {
        if (head == null || head.next == null) {
            return null; // If the list is empty or has only one node
        }

        ListNode prev = null;
        ListNode current = head;

        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        prev.next = null; // Deleting the last node
        return head;
    }

    public static void printLinkedList(ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        head = deleteLastNode(head);
        printLinkedList(head);
    }
}