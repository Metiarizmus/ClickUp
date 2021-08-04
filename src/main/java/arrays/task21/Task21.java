package arrays.task21;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Exercise 21: (3) Try to sort an array of the objects in Exercise 18.
Implement Comparable to fix the problem. Now create a Comparator to sort the objects into reverse order.
*/
public class Task21 {

    public static void main(String[] args) {

        BerylliumSphere[] b = new BerylliumSphere[]{new BerylliumSphere(4), new BerylliumSphere(6),
                                                    new BerylliumSphere(1), new BerylliumSphere(8)};


        Arrays.sort(b);

        System.out.println(Arrays.toString(b));

        Arrays.sort(b, Collections.reverseOrder(new Comparator<BerylliumSphere>() {
            @Override
            public int compare(BerylliumSphere o1, BerylliumSphere o2) {
                return o1.compareTo(o2);
            }
        }));

        System.out.println(Arrays.toString(b));

    }
}

//I changed the class a little for comfort
class BerylliumSphere implements Comparable<BerylliumSphere>{

    private int id;

    public BerylliumSphere(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(BerylliumSphere o) {
        return (this.id - o.id);
    }

    public String toString() { return "Sphere " + id; }
}
