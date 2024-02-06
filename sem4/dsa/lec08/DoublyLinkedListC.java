public class DoublyLinkedListC {
    Node head;
    Node tail;

    public void addLast(int data) {
        if (head == null) {

            tail = head = new Node(data);

        } else {

            Node p = new Node(data);
            p.prev = tail;
            tail.next = p;
            tail = p;

        }
    }

    public void addFirst(int data) {
        if (head == null) {

            tail = head = new Node(data);

        } else {

            Node p = new Node(data);
            p.next = head;
            head.prev = p;
            head = p;

        }
    }

    public void mid() {
        if (head == null) {
            System.out.println("Null");
        } else if (head == tail) {
            System.out.println(head.data);
        } else {

            // Node h = head;
            // Node t = tail;

            // while (h != t) {
            // System.out.println(h.data + " = " + t.data);
            // h = h.next;
            // t = t.prev;
            // System.out.println(h.data + " = " + t.data);
            // }

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            System.out.println(slow.data);

        }
    }

    public void clear() {
        tail = head = null;
    }

    public void deleteLast() {

        Node t = tail.prev;
        tail.prev = null;
        t.next = null;
        tail = t;

    }

    public void deleteAt(int index) {
        Node p = head;
        Node n = head;

        while (index > 0) {
            p = n.prev;
            n = n.next;
            index--;
        }

        p.next.next = null;
        p.next.prev = null;

        n.prev = p;
        p.next = n;

        // System.out.println(n.data);
        // System.out.println(p.data);
        // n.prev = null;

    }

    public void display() {

        Node temp = head;

        while (temp != tail) {

            System.out.print(temp.data + "  ");
            temp = temp.next;

        }

        System.out.print(temp.data);
        System.out.println();

    }

    public void reverse() {

        Node temp = tail;

        while (temp != head) {

            System.out.println(temp.data);
            temp = temp.prev;

        }

        System.out.println(temp.data);
    }
}
