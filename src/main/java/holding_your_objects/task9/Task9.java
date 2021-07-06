package holding_your_objects.task9;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
Exercise 9: (4) Modify innerclasses/Sequence.java so that Sequence works with an Iterator instead of a Selector.
*/
public class Task9 {
    public static void main(String[] args) {

        Sequence sequence = new Sequence();
        for(int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        Iterator<Object> ite = sequence.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }


    }
}


class Sequence<T> {
    private List<T> items = new ArrayList<>();
    private int next = 0;

    public void add(T x) {
        items.add(x);
    }

    public Iterator<Object> iterator() {
        return new SequenceIterator();
    }

    private class SequenceIterator implements Iterator<Object> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < items.size();
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return items.get(index++);
            }
            return null;
        }
    }
}



