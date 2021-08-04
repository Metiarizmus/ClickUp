package arrays.task11;

/*
Exercise 11: (2) Show that autoboxing doesn't work with arrays.
 */
public class Task11 {
    public static void main(String[] args) {

        //int[] b = new Integer[] {1,1,1}; // doesn't work
        //but here all work
        int[] a = new int[2];
        a[0] = 0;
        a[1] = 1;

        System.out.println(a[0]);
        System.out.println(a[1]);

        Integer[] b = new Integer[2];
        b[0] = 0;
        b[1] = 1;

        System.out.println(b[0] instanceof Integer);

        b[0] = a[0]; //autoboxing


    }
}
