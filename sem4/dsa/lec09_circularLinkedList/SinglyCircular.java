public class SinglyCircular {
    CircularNode head;
    // CircularNode tail;

    public void addFirst(int data) {
        CircularNode nNode = new CircularNode(data);
        if (head == null) {
            head = nNode;
            head.next = head;
            return;
        }

        CircularNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        nNode.next = head;
        head = nNode;
        temp.next = head;
    }

    public void deleteMid() {
        CircularNode slow = head;
        CircularNode fast = head;
        CircularNode p = head;

        do {
            fast = fast.next.next;
            p = slow;
            slow = slow.next;
        } while (fast != head && fast.next != head);

        p.next = p.next.next;
    }

    public void addLast(int data) {
        CircularNode nNode = new CircularNode(data);
        if (head == null) {
            head = nNode;
            head.next = head;
            return;
        }

        CircularNode temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        nNode.next = head;
        temp.next = nNode;

    }

    public void display() {

        CircularNode temp = head;

        while (temp.next != head) {
            System.out.print(temp.getData() + "  ");
            temp = temp.next;
        }

        System.out.println(temp.getData());

    }

}
