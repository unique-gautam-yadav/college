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

            // Node temp = head;
            //
            // while (temp.next != null){
            // temp = temp.next;
            // }
            //
            // temp.next = new Node(data);

            tail.next = new Node(data);
            tail = tail.next;
        }
    }

    public void addFirst(int data) {
        Node p = new Node(data);

        if (head == null) {
            head = p = tail;
        } else {
            p.next = head;
            head = p;
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

    public void delete(int data) {

        Node temp = head;
        while (temp != null) {
            if (temp.data == data)
                temp = temp.next;
        }

    }

    public void deleteAt(int index) {
        if (index <= 0) {

        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void insertAt(int index, int data) {
        if (index <= 0) {
            this.addFirst(data);
        } else {

            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node n = new Node(data);
            n.next = temp.next;
            temp.next = n;
        }
    }

    public int at(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int contains(int data) {
        int index = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == data)
                return index;

            temp = temp.next;
            index++;
        }
        return -1;
    }

    public int mid() {

        if (head == null) {
            return -1;
        }

        Node s = head;
        Node f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s.data;
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

    public void sort() {
        Node c = head;
        while (true) {

            if (c.next == null) {
                break;
            }

            if (c.data < c.next.data) {
                int t = c.data;
                c.data = c.next.data;
                c.next.data = t;
            }
            c = c.next;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();

        // ls.head = new Node("First Data");
        // ls.head.next = new Node("Helo");

        // ls.addLast("A");
        // ls.addLast("B");
        // ls.addLast("C");

        ls.addLast(50);
        ls.addLast(80);
        ls.addLast(90);
        ls.addLast(900);
        ls.addLast(5);

        // ls.insertAt(3, "Z");
        // ls.deleteAt(3);
        // ls.delete("D");

        // System.out.println(ls.contains("A"));
        // System.out.println(ls.at(1));

        // ls.display();
        // System.out.println(ls.mid());
        ls.display();

        ls.sort();
        ls.display();
    }
}