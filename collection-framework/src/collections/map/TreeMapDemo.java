package collections.map;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(500, "Amit");
        map.put(100, "Rahul");
        map.put(200, "Jai");
        map.put(400, "Amit");

        map.forEach((k, v) -> System.out.println(k + " " + v));

        //Reverse Order
        System.out.println("Reverse Order:");
        Map<Integer, String> newMap = new TreeMap<>(Collections.reverseOrder());
        newMap.put(500, "Amit");
        newMap.put(100, "Rahul");
        newMap.put(200, "Jai");
        newMap.put(400, "Amit");

        newMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
} 