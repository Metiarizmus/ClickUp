package concurrency.task26;

public class BusBoy implements Runnable{
    private Restaurant restaurant;

    public BusBoy(Restaurant r) {
        this.restaurant = r;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()){
            synchronized (this){
                while (restaurant.meal==null){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("busBoy interrupted");
                    }
                }
            }
        }
    }

}
