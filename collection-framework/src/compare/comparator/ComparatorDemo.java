package compare.comparator;

import java.util.ArrayList;
import java.util.Collections;

class ComparatorDemo {
    public static void main(String args[]) {

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        System.out.println("Sorting by Name");

        Collections.sort(al, new NameComparator());

        for (Student st : al) {
            System.out.println(st);
        }

        System.out.println("sorting by Age");

        Collections.sort(al, new AgeComparator());

        for (Student st : al) {
            System.out.println(st);
        }

    }
} 