package holding_your_objects.task14;

import java.util.LinkedList;
import java.util.ListIterator;

/*
Exercise 14: (3) Create an empty LinkedList<Integer>. Using a Listlterator,
 add Integers to the List by always inserting them in the middle of the List.
 */
public class Task14 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        getIterator(list).add(10);
        getIterator(list).add(20);
        getIterator(list).add(30);
        getIterator(list).add(40);
        getIterator(list).add(50);
        getIterator(list).add(60);

        System.out.println(list);

    }

    static ListIterator<Integer> getIterator(LinkedList<Integer> list) {
        return list.listIterator(list.size() / 2);
    }
}
