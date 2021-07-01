package holding_your_objects.task18;

/*
Exercise 18: (3) Fill a HashMap with key-value pairs. Print the results to show ordering by hash code.
 Extract the pairs, sort by key, and place the result into a LinkedHashMap. Show that the insertion order is maintained.
 */

import java.util.*;

public class Task18 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(5,"five");
        map.put(3,"three");
        map.put(2,"two");
        map.put(-10,"gav");
        map.put(0,"zero");

        System.out.println(map);

        SortedSet<Integer> keys = new TreeSet(map.keySet());
        Map<Integer, String> lk = new LinkedHashMap<>();
        for (Integer key : keys) {
            String value = map.get(key);

            lk.put(key,value);

        }

        System.out.println(lk);
    }
}
