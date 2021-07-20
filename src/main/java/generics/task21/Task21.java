package generics.task21;

import java.util.HashMap;
import java.util.Map;

/*
    Exercise 21: (4) Modify ClassTypeCapture.java by adding a Map<String,Class<?>>, a method addType(String typename, Class<?> kind),
    and a method createNew(String typename). createNew( ) will either produce
    a new instance of the class associated with its argument string, or produce an error message.
*/
public class Task21 {
    public static void main(String[] args) {

        ClassTypeCapture capture = new ClassTypeCapture(String.class);

        capture.addType("String", String.class);
        capture.addType("Integer", Integer.class);

        try {
            System.out.println(capture.createNew("String"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        System.out.println("I can find type of Hello: " + capture.f(("Hello")));


    }
}

class Building {
}

class House extends Building {
}

class ClassTypeCapture<T> {
    Class<T> kind;

    private Map<String, Class<?>> map = new HashMap<>();

    public void addType(String typename, Class<?> kind){
        map.put(typename, kind);
    }

    public T createNew(String typename) throws IllegalAccessException, InstantiationException {
        if (map.containsKey(typename)) {
            return (T) map.get(typename).newInstance();
        }else {
            throw new IllegalArgumentException();
        }
    }

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }
}