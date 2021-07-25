package arrays.task5;

import java.util.Arrays;

/*
Exercise 5: (1) Demonstrate that multidimensional arrays of nonprimitive types are automatically initialized to null.
 */
public class Task5 {
    public static void main(String[] args) {

        Test[][] t = new Test[2][2];
        System.out.println(Arrays.deepToString(t));

    }
}

class Test {

}