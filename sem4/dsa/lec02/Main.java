/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Test obj = new Test(); // we can access m1() m2() and m3()

        obj.m1();
        obj.m2();
        obj.m3();

        Int2 obj1 = new Test(); // we can access m1() and m2();

        obj1.m1();
        obj1.m2();

        Int1 obj2 = new Test(); // we can access only m1()

        obj2.m1();
    }
}