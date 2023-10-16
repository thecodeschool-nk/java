package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(100, "Amit");
        map.put(200, "Rahul");
        map.put(300, "Jai");
        map.put(400, "Amit");
        map.put(100, "Akash");
        map.put(null, null);
        map.put(1000, null);

        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Java 8 way
//        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
} 