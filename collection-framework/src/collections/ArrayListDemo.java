package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
//        iteratorWay();

        genericWay();
    }

    private static void genericWay() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
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
                .filter(e -> e % 2 == 0)
                .limit(2)
                .forEach(e -> System.out.println(e));

        numbers.remove(4);

        System.out.println("size: " + numbers.size());

        System.out.println(numbers.contains(10));
    }

    private static void iteratorWay() {
        List numbers = new ArrayList();

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
        numbers.add(10.4d);
        numbers.add(new Person());

        Iterator iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
            /*if (object instanceof String) {
                System.out.println((String) object);
            } else if (object instanceof Integer) {
                System.out.println((int) object);
            } else if (object instanceof Boolean) {
                System.out.println((boolean) object);
            }*/

        }
    }
}

class Person {

}