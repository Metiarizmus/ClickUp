package arrays.task20;

import java.util.Arrays;

/*
Exercise 20: (4) Demonstrate deepEquals( ) for multidimensional arrays.
*/
public class Task20 {
    public static void main(String[] args) {

        int[][] a = {{1,2,3},{1,2,3}};

        int[][] b = {{1,2,3},{1,2,3}};

        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.deepEquals(a,b));
    }
}
