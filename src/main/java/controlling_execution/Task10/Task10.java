package controlling_execution.Task10;

import java.util.Arrays;
/*
(5) A vampire number has an even number of digits and is formed by multiplying a pair of numbers containing half
the number of digits of the result. The digits are taken from the original number in any order. Pairs of trailing zeroes are not allowed.
Examples include:
1260 = 21 * 60
1827 = 21 * 87
2187 = 27 * 81
Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
 */
public class Task10 {
    public static void main(String[] args) {
        char[] kChar, checkChar;
        String kStr, checkStr;
        int k;
        for(int i=11; i<100; i++) {
            for(int i1=i; i1<100; i1++) {

                k = i * i1;

                kStr = Integer.toString(k);
                checkStr = Integer.toString(i) + Integer.toString(i1);



                kChar = kStr.toCharArray();
                checkChar = checkStr.toCharArray();

                Arrays.sort(kChar);
                Arrays.sort(checkChar);

                if(Arrays.equals(kChar, checkChar) ) {
                    System.out.println(i + " * " + i1 + " = " + k);
                }
            }
        }

    }
}
