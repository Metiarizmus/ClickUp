package containers_in_Depth.task30;

import java.util.*;

/*
Exercise 30: (3) Compare the performance of Collections.sort( ) between an ArrayList and a LinkedList.
 */
public class Task30 {
    public static void main(String[] args) {

        List arr = new ArrayList();
        List link = new LinkedList();

        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            arr.add(r.nextInt(100));
            link.add(r.nextInt(100));
        }

        long arr1, arr2;
        long link1, link2;

        arr1 = System.currentTimeMillis();
        Collections.sort(arr);
        arr2 = System.currentTimeMillis();

        link1 = System.currentTimeMillis();
        Collections.sort(link);
        link2 = System.currentTimeMillis();

        System.out.println("Arr: " + (arr2-arr1));
        System.out.println("Link: " + (link2-link1));
    }
}
