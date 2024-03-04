import pack.DoublyLinkedList;
import pack.Student;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList lst = new DoublyLinkedList();

        lst.addFirst(new Student("Gautam", 18, 9.9));
        lst.addFirst(new Student("John", 8, 7.0));
        lst.addFirst(new Student("Ray", 17, 8.9));
        lst.addFirst(new Student("Lastin", 20, 9.7));

        lst.sortOnCPI();
        lst.display();

    }

}

// Notations obj = new Notations();

// String str = "+-234";
// String str2 = "23+4-";

// System.out.println(obj.solvePrefix(str));
// System.out.println(obj.solvePostfix(str2));
