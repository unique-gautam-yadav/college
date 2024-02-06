
public class Main {
    public static void main(String[] args) {
        SinglyCircular sl = new SinglyCircular();

        sl.addFirst(0);
        sl.addFirst(1);
        sl.addFirst(2);
        sl.addFirst(3);
        sl.addFirst(5);
        sl.addFirst(6);
        sl.display();
        sl.deleteMid();
        sl.display();
    }

}