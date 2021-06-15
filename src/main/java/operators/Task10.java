package operators;
/*
Write a program with two constant values, one with alternating binary ones and zeroes, with a zero in the least-significant
digit, and the second, also alternating, with a one in the least-significant digit (hint: It’s easiest to use hexadecimal
constants for this). Take these two values and combine them in all possible ways using the bitwise operators,
and display the results using Integer.toBinaryString( )
*/

public class Task10 {
    public static void main(String[] args) {

        int a = 0x101010;
        int b = 0x010101;

        System.out.println("a&b "+Integer.toBinaryString(a&b));
        System.out.println("a|b "+Integer.toBinaryString(a|b));
        System.out.println("a^b "+Integer.toBinaryString(a^b));

    }
}
