package java_pro.collections.lec1;

import java.util.*;

public class Tutorial1 {
    public static void main(String[] args) {

        ArrayList<Integer> arList = new ArrayList<Integer>();

        arList.add(20);
        arList.add(21);
        arList.add(null);
        arList.add(124);

        System.out.println(arList);

        for (int i = 0; i < arList.size(); i++) {
            System.out.print(arList.get(i) + " _ ");
        }

        for (Integer object : arList) {
            System.out.println(object);
        }

        // arList.add("it");

        Iterator<Integer> it = arList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

    }

    // public static void main(String[] args) {
    // ArrayList<Student> studentsArrayList = new ArrayList<Student>();

    // studentsArrayList.add(new Student("Gautam ", "B Tech"));
    // studentsArrayList.add(new Student("Gautam2 ", "B Tech"));
    // studentsArrayList.add(new Student("Gautam3 ", "B Tech"));
    // studentsArrayList.add(new Student("Gautam4 ", "B Tech"));
    // studentsArrayList.add(new Student("Gautam5 ", "B Tech"));

    // System.out.println(studentsArrayList);

    // System.out.println("\n\n");

    // for (Student student : studentsArrayList) {
    // System.out.println(student);
    // }

    // }
}

class Student {
    String name;
    String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student(name: " + this.name + ", course: " + this.course + ")";
    }
}