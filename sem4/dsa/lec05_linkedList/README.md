# What I learned

## Singly Linked List

```
class Node{
    String data;
    Node next;

    Node(String data) {
        this.data = data;
    }
}


class LinkedList{
    Node head;
    Node tail;

    public void addLast(String data){
        if(head == null){
            tail = head = new Node(data);
        } else {

            // Node temp = head;
            //
            // while (temp.next != null){
            //     temp = temp.next;
            // }
            //
            // temp.next = new Node(data);

            tail.next = new Node(data);
            tail = tail.next;
        }
    }

    public void addFirst(String data){
        Node p = new Node(data);

        if(head == null){
            head = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


public class Main{
    public static void main(String [] args){
        LinkedList ls = new LinkedList();

        // ls.head = new Node("First Data");
        // ls.head.next = new Node("Helo");

        ls.addLast("A");
        ls.addLast("B");
        ls.addLast("C");
        ls.addFirst("D");
        ls.display(); // D, A, B, C
    }
}
```
