package concurrency.task2;

import enumerated_types.task2.Generator;

import java.util.Arrays;

/*
Exercise 2: (2) Following the form of generics/Fibonacci.java, create a task that produces a sequence of n Fibonacci numbers,
 where n is provided to the constructor of the task.
 Create a number of these tasks and drive them using threads.
*/
public class Task2 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread1(20));
        Thread t2 = new Thread(new MyThread2(20));
        t1.start();
        t2.start();
    }
}

class MyThread1 implements Runnable {
    private int n;

    public MyThread1(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        Fibonacci f = new Fibonacci(n);
        System.out.println(Arrays.toString(f.printFib()));
    }
}

class MyThread2 implements Runnable {
    private int n;

    public MyThread2(int n) {
        this.n = n;
    }
    @Override
    public void run() {
        Fibonacci f = new Fibonacci(n);
        System.out.println(Arrays.toString(f.printFib()));
    }
}