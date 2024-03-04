import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        // int arr[] = new int[50];
        // Student students[] = new Student[100];

        // Random random = new Random();

        // for (int i = 0; i < arr.length; i++) {

        // arr[i] = random.nextInt(5, 30);

        // }
        // for (int i = 0; i < students.length; i++) {

        // students[i] = new Student();
        // students[i].age = random.nextInt(5, 20);
        // students[i].name = " Student " + (i + 1) + "";

        // }

        // int evens[] = Arrays.stream(arr).filter(i -> (i % 2 == 0)).toArray();

        // System.out.println(Arrays.toString(evens));

        // System.out.println(Arrays.toString(Arrays.stream(students).filter(s -> s.age
        // < 18).toArray()));

        // String[] sentences = { "Java test programming", "Python programming", "Java
        // test example program" };

        // Object[] sJava = Arrays.stream(sentences).filter(s ->
        // s.startsWith("Java")).toArray();
        // System.out.println(Arrays.toString(sJava));

        int[] numbers = { 29, 32, 4, 23, 43, 54, 1, 32, 5, 46 };

        int[] increased = Arrays.stream(numbers).map(n -> n * 10).toArray();

        System.out.println(Arrays.toString(increased));

    }

    static String mapper(String p) {
        return p + "Hello";
    };
}

class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student (Name = " + this.name + "  Age = " + this.age + ")\n";

    }
}