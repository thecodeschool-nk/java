package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(100, "Amit");
        map.put(300, "Jai");
        map.put(200, "Rahul");
        map.put(400, "Amit");

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
} 