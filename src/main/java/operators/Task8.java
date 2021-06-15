package operators;
/*
Show that hex and octal notations work with long values. Use Long.toBinaryString( ) to display the results
 */
public class Task8 {
    public static void main(String[] args) {

        long l1 = 0x9F;
        long l2 = 0721;

        System.out.println("l1 " + Long.toBinaryString(l1));
        System.out.println("l2 " + Long.toBinaryString(l2));

    }
}
