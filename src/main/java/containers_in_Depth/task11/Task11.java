package containers_in_Depth.task11;

import java.util.PriorityQueue;
import java.util.Random;

/*
Exercise 11: (2) Create a class that contains an Integer that is initialized to a value between o and 100 using
java.util.Random. Implement Comparable using this Integer field.
Fill a PriorityQueue with objects of your class, and extract the values using poll( ) to show
that it produces the expected order.
 */
public class Task11 {
    public static void main(String[] args) {

        PriorityQueue<Test> p = new PriorityQueue<>( Test::compareTo);
        p.add(new Test());
        p.add(new Test());
        p.add(new Test());
        p.add(new Test());
        p.add(new Test());
        p.add(new Test());

        for (int i = 0; i < p.size(); i++) {
            System.out.println(p.poll().getRand());
        }

    }
}

class Test implements Comparable{
    private Integer rand;

    public Test() {
       rand = new Random().nextInt(100);
    }

    public Integer getRand() {
        return rand;
    }

    @Override
    public int compareTo(Object o) {
        return this.rand-((Test)o).rand;
    }

    @Override
    public String toString() {
        return "Test{" +
                "rand=" + rand +
                '}';
    }
}