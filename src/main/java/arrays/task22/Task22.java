package arrays.task22;

import java.util.Arrays;

/*
Exercise 22: (2) Show that the results of performing a binarySearch( ) on an unsorted array are unpredictable.
 */
public class Task22 {
    public static void main(String[] args) {

        int[] array1 = {10, 20, 30, 40};
        int pos1 = Arrays.binarySearch(array1, 20);
        int pos2 = Arrays.binarySearch(array1, 25);
        System.out.println(pos1);
        System.out.println(pos2);

        int[] array2 = {70, 65, 68, 40};
        int pos3 = Arrays.binarySearch(array1, 65);
        System.out.println(pos3);
    }
}
