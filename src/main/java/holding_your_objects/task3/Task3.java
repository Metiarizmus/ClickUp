package holding_your_objects.task3;

import java.util.ArrayList;
import java.util.List;

/*
Exercise 3: (2) Modify innerclasses/Sequence.java so that you can add any number of elements to it.
*/
public class Task3 {
    public static void main(String[] args) {
        Sequence<Integer> sequence = new Sequence<>();

        for (int i = 0; i < 10; i++) sequence.add(i);


        Selector<Integer> selector = new SequenceSelector<>();

        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }


    }
}


interface Selector<E> {
    boolean end();

    E current();

    void next();
}

 class Sequence<E> {

    private static List<Object> items = new ArrayList<>();

    public void add(E x) {
            items.add(x);
    }

     public List<Object> getItems() {
         return items;
     }
 }

 class SequenceSelector<E>  implements Selector<E> {

    private Sequence<E> s = new Sequence();

    private int i = 0;

    public boolean end() {
        return i == s.getItems().size();
    }

    public E current() {
        return (E) s.getItems().get(i);
    }

    public void next() {
        if (i < s.getItems().size()) i++;
    }
}