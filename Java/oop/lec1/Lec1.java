package oop.lec1;

/*
 * Class
 * StringBuilder
 * Methods in class (Instance Method)
 * Constructors
 */

public class Lec1 {
    public static void main(String[] args) {
        Student s = new Student("Gautam", "Mathura", Course.BTech);
        System.out.println(s.printToJSON());

    }
}

class Student {

    public Student(String name, String address, Course course) {
        super();
        this.name = name;
        this.address = address;
        this.course = course;
    }

    String name;
    String address;
    Course course;

    String printToJSON() {

        StringBuilder st = new StringBuilder();

        st.append("Student (name : ");
        st.append(this.name);
        st.append(", address : ");
        st.append(this.address);
        st.append(", course : ");
        st.append(this.course.toString());
        st.append(")");

        // return "{\n\t\"name\" : \"" + this.name + "\",\n\t\"address\" : \"" +
        // this.address + "\",\n\t\"course\" : \""
        // + this.course.toString() + "\"" + "\n}";

        return st.toString();
    }
}

enum Course {
    Diploma,
    BTech,
    PhD,
}