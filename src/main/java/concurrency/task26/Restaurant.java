package concurrency.task26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Exercise 26: (8) Add a BusBoy class to Restaurant.java.
After the meal is delivered, the WaitPerson should notify the BusBoy to clean up.
*/
public class Restaurant {
    Meal meal;
    ExecutorService exec = Executors.newCachedThreadPool();
    WaitPerson waitPerson = new WaitPerson(this);
    Chef chef = new Chef(this);
    BusBoy busBoy = new BusBoy(this);

    public Restaurant() {
        exec.execute(chef);
        exec.execute(waitPerson);
        exec.execute(busBoy);
    }

    public static void main(String[] args) {
        new Restaurant();
    }
}