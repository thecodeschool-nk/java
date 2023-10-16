package compare.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String args[]) {
        Comparable student1 = new Student(1001, "Niraj", 11);

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        Collections.sort(al);
        for (Student st : al) {
            System.out.println(st);
        }
    }
}


class Student implements Comparable<Student> {
    private int rollno;
    private String name;
    private int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student st) {
        if (this.age == st.age)
            return 0;
        else if (this.age > st.age)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}