package arrays.task11;

/*
Exercise 11: (2) Show that autoboxing doesn't work with arrays.
 */
public class Task11 {
    public static void main(String[] args) {

        //int[] b = new Integer[] {1,1,1}; // doesn't work

        //but here all work
        int[] a = new int[3];
        a[0] = new Integer(0);
        a[1] = 1;
        a[2] = new Integer(2);

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
