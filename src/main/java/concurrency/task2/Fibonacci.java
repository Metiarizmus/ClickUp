package concurrency.task2;

public class Fibonacci  {
    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public int[] printFib() {
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }
}