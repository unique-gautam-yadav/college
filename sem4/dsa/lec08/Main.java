
public class Main {
    public static void main(String[] args) {
        DoublyLinkedListC l = new DoublyLinkedListC();

        l.addFirst(0);
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(10);
        l.addFirst(12);

        l.display();
        l.deleteAt(3);

        l.display();

    }

}