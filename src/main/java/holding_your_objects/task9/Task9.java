package holding_your_objects.task9;


import java.util.Iterator;


/*
Exercise 9: (4) Modify innerclasses/Sequence.java so that Sequence works with an Iterator instead of a Selector.
*/
public class Task9 {
    public static void main(String[] args) {

        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        Iterator<Object> ite = sequence.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }


    }
}


class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
        System.out.println("its sequence");
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    public Iterator<Object> iterator() {
        return new SequenceIterator();
    }

    private class SequenceIterator implements Iterator<Object> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < items.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return items[index++];
            }
            return null;
        }
    }
}



