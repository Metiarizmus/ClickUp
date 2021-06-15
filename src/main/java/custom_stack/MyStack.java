package custom_stack;

import java.util.Iterator;


public class MyStack implements MyStackImpl, Iterable {
    private int size;
    private Object[] array;
    private int top;

    public MyStack(int m) {
        this.size = m;
        array = new Object[size];
        top = -1;
    }


    @Override
    public void addInTop(Object value) {
        array[++top] = value;
    }

    @Override
    public Object deleteTop() {
        return array[top--];
    }

    @Override
    public Object getTop() {
        return array[top];
    }

    @Override
    public Object getAndRemoveTop() {
        return array[top--];
    }

    @Override
    public boolean isEmpty() {
        return (top==-1);
    }



    @Override
    public Iterator<Object> iterator() {

        Iterator<Object> it = new Iterator<>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && array[currentIndex] != null;
            }

            @Override
            public Object next() {
                return array[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }


}
