package concurrency.task1;

/*
Exercise 1: (2) Implement a Runnable. Inside run( ), print a message, and then call yield( ).
Repeat this three times, and then return from run( ).
Put a startup message in the constructor and a shutdown message when the task terminates.
Create a number of these tasks and drive them using threads.
*/
public class Task1 {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        Thread t1 = new Thread(new MyThread());
        t.start();
        Thread t2 = new Thread(new MyThread1());
        t1.start();
        t2.start();

        System.out.println("waiting all");
    }
}

class LiftOff implements Runnable {
    protected int countDown = 3; // Default
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
        System.out.println("start countDown = " + countDown);
    }


    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }

    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }

        System.out.println("\nend countDown = " + countDown);
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println(i + " trees");
        }
    }
}

class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 2; i >= 0; i--) {
            System.out.println(i + " mikes");
        }
    }
}