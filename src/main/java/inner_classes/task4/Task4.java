package inner_classes.task4;

/*
Exercise 4: Add a method to the class Sequence.SequenceSelector that produces the reference to the outer class Sequence.
*/
public class Task4 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        System.out.println();

        Sequence.SequenceSelector q = sequence.new SequenceSelector();
        q.get();

    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
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

     class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }

        public Sequence get(){
            return Sequence.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

}