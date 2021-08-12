package concurrency.task35.web_service;

import java.util.concurrent.TimeUnit;

public class Server implements Runnable, Comparable<Server>{
    private static int counter = 0;
    private final int id = counter++;
    // Customers served during this shift:
    private int webClientsServed = 0;
    private WebClientsLine clientsLine;
    private boolean servingClientsLine = true;

    public Server(WebClientsLine cq) {
        clientsLine = cq;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                WebClients webClients = clientsLine.take();
                TimeUnit.MILLISECONDS.sleep(webClients.getServiceTime());

                synchronized (this) {
                    webClientsServed++;
                    while (!servingClientsLine)
                        wait();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(this + "interrupted");
        }
        System.out.println(this + "terminating");
    }

    public synchronized void doSomethingElse() {
        webClientsServed = 0;
        servingClientsLine = false;
    }

    public synchronized void serveWebClientsLine() {
        assert !servingClientsLine : "already serving: " + this;
        servingClientsLine = true;
        notifyAll();
    }


    public String toString() {
        return "WebClient " + id + " ";
    }

    public String shortString() {
        return "T" + id;
    }

    // Used by priority queue:
    public synchronized int compareTo(Server other) {
        return webClientsServed < other.webClientsServed ? -1 :
                (webClientsServed == other.webClientsServed ? 0 : 1);
    }
}
