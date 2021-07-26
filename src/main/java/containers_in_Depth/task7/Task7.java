package containers_in_Depth.task7;

import containers_in_Depth.task3.Countries;

import java.util.*;

/*
Exercise 7: (4) Create both an ArrayList and a LinkedList, and fill each using the Countries.names( ) generator.
 Print each list using an ordinary Iterator, then insert one list into the other by using a Listlterator,
 inserting at every other location. Now perform the insertion starting at the end of the first list and moving backward.
 */
public class Task7 {
    public static void main(String[] args) {

        ArrayList<String> arr = (ArrayList<String>)Countries.names(4);
        LinkedList<String> link = new LinkedList<>(Countries.names(4));

        Iterator itArr = arr.iterator();
        Iterator itLink = link.iterator();

        System.out.println("Array:");
        while (itArr.hasNext()) {
            System.out.print(itArr.next() + ", ");
        }

        System.out.println();

        System.out.println("Link:");
        while (itLink.hasNext()) {
            System.out.print(itLink.next() + ", ");
        }

        System.out.println("");

        ListIterator listItLink = link.listIterator();

        System.out.println("Back insert");
        ListIterator listItArrBack = arr.listIterator(arr.size()-1);

        while(listItLink.hasNext()) {
            listItArrBack.add(listItLink.next());
            listItArrBack.previous();
        }
        System.out.println("\n");
        System.out.println(arr.toString());



    }
}
