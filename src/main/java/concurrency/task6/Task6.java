package concurrency.task6;

import java.util.*;
import java.util.concurrent.*;

/*
Exercise 6: (2) Create a task that sleeps for a random amount of time between 1 and 10 seconds,
then displays its sleep time and exits. Create and run a quantity (given on the command line) of these tasks.
*/
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        ExecutorService es = Executors.newFixedThreadPool(n);

        for (int i = 0; i < n; i++) {
            es.execute(new Sleeping());
        }

        es.shutdown();

    }
}

class Sleeping implements Runnable {

    @Override
    public void run() {
        Random random = new Random();
        int rand = random.nextInt(10)+1;
        try {
            TimeUnit.SECONDS.sleep(rand);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("sleep time is " + rand);
    }
}
