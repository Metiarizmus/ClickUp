package controlling_execution.Task5;
/*
Repeat Exercise 10 from the previous chapter, using the
ternary operator and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).
 */
/*
Write a program with two constant values, one with alternating binary ones and zeroes, with a zero in the least-significant
digit, and the second, also alternating, with a one in the least-significant digit (hint: It’s easiest to use hexadecimal
constants for this). Take these two values and combine them in all possible ways using the bitwise operators,
and display the results using Integer.toBinaryString( )
*/
public class Task5 {
    public static void main(String[] args) {

        int a = 0x101010;
        int b = 0x010101;

        System.out.println("a&b ");
        printTernary(a&b);
        System.out.println("a|b ");
        printTernary(a|b);
        System.out.println("a^b ");
        printTernary(a^b);

    }

    static void printTernary(int number) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((number & pow2(i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

     static int pow2(int x) {
        int y = 1;
        for (int i = 0; i < x; i++) {
            y *= 2;
        }
        return y;
    }

}
