package pack;

public class DoublyLinkedList {

    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Student data) {
        Node np = new Node(data);

        if (isEmpty()) {
            tail = head = np;
            tail.prev = head;
        } else {
            np.next = head;
            head.prev = np;
            np.prev = head.prev;
            head = np;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
