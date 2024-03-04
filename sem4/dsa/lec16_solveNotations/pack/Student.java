package pack;

public class Student {
    String name;
    int age;
    double cpi;

    public Student(String name, int age, double cpi) {
        this.name = name;
        this.age = age;
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "(name : " + this.name + ", age : " + this.age + ", cpi : " + this.cpi + ")";
    }
}
