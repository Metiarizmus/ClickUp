package arrays.task2;

import java.util.Arrays;

/*
Exercise 2: (1) Write a method that takes an int argument and returns an array of that size, filled with BerylliumSphere objects.
 */
public class Task2 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(get(0)));

    }

    static BerylliumSphere[] get(int size) {
        BerylliumSphere[] b = null;

        if (size != 0) {
            b = new BerylliumSphere[size];
            for (int i = 0; i < size; i++) {
                b[i] = new BerylliumSphere();
            }
        }

        return b;
    }

}

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}