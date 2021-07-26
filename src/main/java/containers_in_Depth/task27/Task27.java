package containers_in_Depth.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Exercise 27: (3) Modify the hashCode( ) in CountedString.java by removing the combination with id,
 and demonstrate that CountedString still works as a key. What is the problem with this approach?
 */
public class Task27 {
    public static void main(String[] args) {

        /*
        Both hashCode( ) and equals( ) produce results based on both fields; if they were just based on the String alone or the id alone,
        there would be duplicate matches for distinct values.
         */

        Map<CountedString, Integer> map = new HashMap<>();
        CountedString[] cs = new CountedString[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString("hi");
            map.put(cs[i], i); // Autobox int -> Integer
        }
        System.out.println(map);
        for (CountedString cstring : cs) {
            System.out.println("Looking up " + cstring);
            System.out.println(map.get(cstring));
        }

    }
}

class CountedString {
    private static List<String> created = new ArrayList<>();
    private String s;
    private int id = 0;

    public CountedString(String str) {
        s = str;
        created.add(s);
// id is the total number of instances
// of this string in use by CountedString:
        for (String s2 : created)
            if (s2.equals(s))
                id++;
    }

    public String toString() {
        return "String: " + s + " id: " + id +
                " hashCode(): " + hashCode();
    }

    public int hashCode() {
// The very simple approach:
// return s.hashCode() * id;
// Using Joshua Bloch’s recipe:
        int result = 17;
        result = 37 * result + s.hashCode();
        //result = 37 * result + id;
        return result;
    }

    public boolean equals(Object o) {
        return o instanceof CountedString &&
                s.equals(((CountedString) o).s) &&
                id == ((CountedString) o).id;
    }
}