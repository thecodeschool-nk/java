package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Zenat");
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        //TODO: 1. write reverse comparator to print in reverse order

        //TODO: 2. use stream in place of Iterator
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}  