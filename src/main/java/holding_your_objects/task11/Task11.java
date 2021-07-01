package holding_your_objects.task11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/*
Exercise 11: (2) Write a method that uses an Iterator to step through a Collection and print the toString( ) of each object in the container.
Fill all the different types of Collections with objects and apply your method to each container.
*/
public class Task11<E> {
    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            c.add(i);
        }

        Task11<Integer> t = new Task11<>();
        t.step(c);

    }

    void step(Collection<E> c) {
        Iterator<E> it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
