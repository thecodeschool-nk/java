package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
//        iteratorWay();

        genericWay();
    }

    private static void genericWay() {
        List<Object> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add("Five");
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println("size: " + numbers.size());

        /*for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }*/

        /*for (int num : numbers) {
            System.out.println(num);
        }*/

        numbers.stream()
//                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.println(num));

        numbers.remove(4);

        System.out.println("size: " + numbers.size());

        System.out.println(numbers.contains("Five"));
    }

    private static void iteratorWay() {
        List numbers = new LinkedList();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(false);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add("Eight");
        numbers.add(9);
        numbers.add(10);

        Iterator iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Object object = iterator.next();
//            System.out.println((int) object);
            if (object instanceof String) {
                System.out.println((String) object);
            } else if (object instanceof Integer) {
                System.out.println((int) object);
            } else if (object instanceof Boolean) {
                System.out.println((boolean) object);
            }

        }
    }
}
