package containers_in_Depth.task3;

import java.util.*;

/*
Exercise 3: (1) Using Countries, fill a Set multiple times with the same data and verify
that the Set ends up with only one of each instance. Try this with HashSet, LinkedHashSet, and TreeSet.
 */
public class Task3 {
    public static void main(String[] args) {

        Set hashSet = new HashSet();
        Set linkedHashSet = new LinkedHashSet();
        Set treeSet = new TreeSet();

        for (String[] q : Countries.DATA){
            for (String qq : q){
                hashSet.add(qq);
                hashSet.add(qq);
                linkedHashSet.add(qq);
                linkedHashSet.add(qq);
                treeSet.add(qq);
                treeSet.add(qq);
            }
        }

        //there are no copies in the set
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
