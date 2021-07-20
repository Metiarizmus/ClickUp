package generics.task33;

import java.util.ArrayList;
import java.util.List;

//Exercise 33: (3) Repair GenericCast.java using an ArrayList.
public class Task33 {

    public static void main(String[] args) {
        FixedSizeStack<String> strings =
                new FixedSizeStack<String>();
        for (String s : "A B C D E F G H I J".split(" "))
            strings.push(s);

        for (int i = 0; i < strings.count(); i++) {
            String s = strings.pop();
            System.out.print(s + " ");
        }
    }
}

class FixedSizeStack<T> {

    private List<T> storage = new ArrayList<>();

    public int count() {
        return storage.size();
    }

    public void push(T item) {
        storage.add(item);
    }

    public T pop() {
        return storage.remove(storage.size()-1);
    }

}