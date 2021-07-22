package generics.task40;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
Exercise 40: (3) Add a speak( ) method to all the pets in typeinfo.pets.
Modify Apply.java to call the speak( ) method for a heterogeneous collection of Pet.
*/

public class Task40 {
    public static void main(String[] args) throws NoSuchMethodException {

        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            shapes.add(new Shape());
        }

        Apply.apply(shapes, Shape.class.getMethod("rotate"));
        Apply.apply(shapes, Shape.class.getMethod("speak"));
        Apply.apply(shapes, Shape.class.getMethod("resize", int.class), 5);

        List<Square> squares = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            squares.add(new Square());
        }

        Apply.apply(squares, Shape.class.getMethod("rotate"));
        Apply.apply(squares, Shape.class.getMethod("speak"));
        Apply.apply(squares, Shape.class.getMethod("resize", int.class), 5);
        Apply.apply(new FilledList<Shape>(Shape.class, 10),
                Shape.class.getMethod("rotate"));
        Apply.apply(new FilledList<Shape>(Square.class, 10),
                Shape.class.getMethod("rotate"));
        SimpleQueue<Shape> shapeQ = new SimpleQueue<>();

        for (int i = 0; i < 5; i++) {
            shapeQ.add(new Shape());
            shapeQ.add(new Square());
        }

        Apply.apply(shapeQ, Shape.class.getMethod("rotate"));

    }
}

class Apply {
    public static <T, S extends Iterable<? extends T>>
    void apply(S seq, Method f, Object... args) {
        try {
            for (T t : seq)
                f.invoke(t, args);
        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}

class Shape {
    public void rotate() {
        System.out.println(this + " rotate");
    }

    public void resize(int newSize) {
        System.out.println(this + " resize " + newSize);
    }

    public void speak() {
        System.out.println(this + " speak");
    }

}

class Square extends Shape {
}

class FilledList<T> extends ArrayList<T> {

    public FilledList(Class<? extends T> type, int size) {
        try {
            for (int i = 0; i < size; i++)
// Assumes default constructor:
                add(type.newInstance());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class SimpleQueue<T> implements Iterable<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void add(T t) {
        storage.offer(t);
    }

    public T get() {
        return storage.poll();
    }

    public Iterator<T> iterator() {
        return storage.iterator();
    }
}