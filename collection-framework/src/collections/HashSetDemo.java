package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String args[]){

        Set<String> set=new HashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        System.out.println(set.size());

        /*Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

        set.stream()
                .forEach(e -> System.out.println(e));
    }
}