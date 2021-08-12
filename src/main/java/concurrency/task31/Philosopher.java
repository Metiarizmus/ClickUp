package concurrency.task31;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Philosopher implements Runnable {
    private Chopstick left;
    private Chopstick right;
    private LinkedBlockingQueue<Chopstick> bloking;
    private final int id;
    private final int ponderFactor;
    private Random rand = new Random(47);
    private void pause() throws InterruptedException {
        if(ponderFactor == 0) return;
        TimeUnit.MILLISECONDS.sleep(
                rand.nextInt(ponderFactor * 250));
    }
    public Philosopher(Chopstick left, Chopstick right,LinkedBlockingQueue<Chopstick> bloking, int ident, int ponder) {
        this.left = left;
        this.right = right;
        this.bloking = bloking;
        id = ident;
        ponderFactor = ponder;
    }
    public void run() {
        try {
            while(!Thread.interrupted()) {
                System.out.println(this + " " + "thinking");
                pause();
// Philosopher becomes hungry
                System.out.println(this + " " + "grabbing right");
                right = bloking.take();
                System.out.println(this + " " + "grabbing left");
                left = bloking.take();
                System.out.println(this + " " + "eating");
                pause();
                System.out.println(this + " " + "drop right and left");
                bloking.put(right);
                bloking.put(left);
            }
        } catch(InterruptedException e) {
            System.out.println(this + " " + "exiting via interrupt");
        }

    }
    public String toString() { return "Philosopher " + id; }
}