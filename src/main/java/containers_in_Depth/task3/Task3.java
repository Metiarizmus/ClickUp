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

        long startHash = System.currentTimeMillis();
        hashSet.addAll(Countries.names(10000));
        long endHash = System.currentTimeMillis();

        long starTree = System.currentTimeMillis();
        treeSet.addAll(Countries.names(10000));
        long endTree = System.currentTimeMillis();

        long startLinked = System.currentTimeMillis();
        linkedHashSet.addAll(Countries.names(10000));
        long endLinked = System.currentTimeMillis();

        System.out.println("hashSet: " + (endHash-startHash) + " , treeSet: " + (endTree-starTree) +
                                        " , linkedHashSet: " + (endLinked-startLinked));

        //there are no copies in the set
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
