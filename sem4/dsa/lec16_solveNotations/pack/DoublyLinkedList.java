package pack;

public class DoublyLinkedList {

    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void sortOnCPI() {
        if (isEmpty() || head.next == null) {
            return;
        }

        Node f = head;
        while (f != null) {
            Node current = head;
            while (current.next != null) {
                if (current.data.cpi < current.next.data.cpi) {
                    Student temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
                current = current.next;
            }
            f = f.next;
        }
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
