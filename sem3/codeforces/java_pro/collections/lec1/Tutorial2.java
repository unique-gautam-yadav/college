package java_pro.collections.lec1;

import java.util.*;

public class Tutorial2 {
    // public static void main(String[] args) {

    //     LinkedList<Integer> linked = new LinkedList<Integer>();

    //     linked.add(20);
    //     linked.add(21);
    //     linked.add(null);
    //     linked.add(124);

    //     System.out.println(linked);

    //     for (int i = 0; i < linked.size(); i++) {
    //         System.out.print(linked.get(i) + " _ ");
    //     }

    //     for (Integer object : linked) {
    //         System.out.println(object);
    //     }

    //     // arList.add("it");

    //     Iterator<Integer> it = linked.iterator();

    //     while (it.hasNext()) {
    //         System.out.println(it.next());
    //     }

    //     System.out.println();

    // }

    public static void main(String[] args) {
    LinkedList<Student> studentsLinkedList = new LinkedList<Student>();

    studentsLinkedList.add(new Student("Gautam ", "B Tech"));
    studentsLinkedList.add(new Student("Gautam2 ", "B Tech"));
    studentsLinkedList.add(new Student("Gautam3 ", "B Tech"));
    studentsLinkedList.add(new Student("Gautam4 ", "B Tech"));
    studentsLinkedList.add(new Student("Gautam5 ", "B Tech"));

    System.out.println(studentsLinkedList);

    System.out.println("\n\n");

    for (Student student : studentsLinkedList) {
    System.out.println(student);
    }

    }
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


/// Array List

/*
 * 
 * 
 * ArrayList
 * LikedList
 * 
 * 
 * HashSet
 * LInkedHashSet
 * TreeSet
 * 
 * HashMap
 * LInkedHashMap
 * 
 * 
 * Vector
 * Stack
 * Queue
 * 
 * 
 * 
 * CopyOnWriteArrayList
 * CopyOnWriteArraySet
 * 
 * 
 */