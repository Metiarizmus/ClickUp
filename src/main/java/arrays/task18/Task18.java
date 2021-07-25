package arrays.task18;

import java.util.Arrays;

/*
Exercise 18: (3) Create and fill an array of BerylliumSphere. Copy this array to a new array and show that it’s a shallow copy.
 */
public class Task18 {
    public static void main(String[] args) {

        BerylliumSphere[] a = new BerylliumSphere[] {new BerylliumSphere(), new BerylliumSphere()};
        BerylliumSphere[] b = new BerylliumSphere[] {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};

        System.arraycopy(a,0,b,a.length,b.length/2);

        System.out.println(Arrays.toString(b));

    }
}

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Sphere " + id; }
}