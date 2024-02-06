interface MyInterface {
    void myMethod();

    int MY_CONSTANT = 42;

    default void defaultMethod() {
        System.out.println("Default implementation");
    }
}

class MyClass implements MyInterface {
    public void myMethod() {
        System.out.println("Implementation of myMethod");
    }
}

public class Program {
    public static void main(String[] args) {

        MyClass myObject = new MyClass();
        myObject.myMethod();
        System.out.println("Constant value: " + MyInterface.MY_CONSTANT);
        myObject.defaultMethod();
    }

}
