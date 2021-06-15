package controlling_execution.Task9;

import java.util.Scanner;

/*
A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on,
 where each number (from the third on) is the sum of the previous two. Create a method that takes an integer as an argument
 and displays that many Fibonacci numbers starting from the beginning, e.g., If you run java Fibonacci 5
 (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
 */
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711,
public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        for (int q : pritnFibonacci(end)){
            System.out.println(q);
        }

    }

    static int[] pritnFibonacci(int end){

        if (end < 2){
            System.err.println("you need to enter a number from two");
        }

        int[] n = new int[end];

        n[0]=1;
        n[1]=1;
        for (int i = 2; i <end; i++) {
            n[i] = n[i-1]+n[i-2];
        }
        return n;
    }

}
