package concurrency.task5;

/*
Exercise 5: (2) Modify Exercise 2 so that the task is a Callable that sums the values of all the Fibonacci numbers.
Create several tasks and display the results.
 */

import concurrency.task2.Fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Task5 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future<int[]>> futures = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            futures.add(exec.submit(new MyCallable1(5)));
        }

        for (Future<int[]> q : futures) {
            try {
                System.out.println(Arrays.toString(q.get()));
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                exec.shutdown();
            }
        }
    }
}

class MyCallable1 implements Callable<int[]> {
    private int n;

    public MyCallable1(int n) {
        this.n = n;
    }

    @Override
    public int[] call() throws Exception {
        Fibonacci f = new Fibonacci(n);
        return f.printFib();
    }
}
