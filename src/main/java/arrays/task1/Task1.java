package arrays.task1;

import java.util.Arrays;

/*
Exercise 1: (2) Create a method that takes an array of BerylliumSphere as an argument.
 Call the method, creating the argument dynamically. Demonstrate that ordinary aggregate array initialization doesn’t work in this case.
 Discover the only situations where ordinary aggregate array initialization works,
  and where dynamic aggregate initialization is redundant.
 */
public class Task1 {
    public static void main(String[] args) {

        BerylliumSphere[] a = new BerylliumSphere[2];
        BerylliumSphere[] b = {new BerylliumSphere(), new BerylliumSphere()};

        get1(new BerylliumSphere[3]); //aggregate array initialization don't work all objects is null

        get1(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()}); //aggregate array initialization work

        get1(a);//don't work all null
        a=b;
        get1(a); //work

        System.out.println("--------------------");


        test(new int[]{2, 3}); // Dynamic aggregate initialization works
        test(new int[2]); //elements initialized to zero (not null)

        int[] k = {1,2,3};
        test(k);
    }

    static void get1(BerylliumSphere[] b) {
        System.out.println(Arrays.toString(b));
    }

    static void test(int[] ia) {

        System.out.println(Arrays.toString(ia));


    }
}

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}