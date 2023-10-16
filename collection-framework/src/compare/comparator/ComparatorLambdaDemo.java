package compare.comparator;

import java.util.ArrayList;
import java.util.Collections;

class ComparatorLambdaDemo {
    public static void main(String args[]) {

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        System.out.println("Sorting by Name");

        Collections.sort(al, (Student s1, Student s2) -> s1.getName().compareTo(s2.getName()));

        for (Student st : al) {
            System.out.println(st);
        }

        System.out.println("sorting by Age");

        Collections.sort(al, (Student s1, Student s2) -> ((Integer)s1.getAge()).compareTo(s2.getAge()));

        for (Student st : al) {
            System.out.println(st);
        }

    }
} 