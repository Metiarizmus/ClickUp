package concurrency.task35.web_service;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ServerManager implements Runnable{
    private int countServer; //количество серверов
    private ExecutorService exec;
    private WebClientsLine clientsLine;
    private PriorityQueue<Server> workingServers = new PriorityQueue<>();
    private Queue<Server> restingServers = new LinkedList<>();
    private int adjustmentPeriod;
    private static Random rand = new Random(47);

    public ServerManager(ExecutorService e, WebClientsLine customers, int adjustmentPeriod, int c) {
        exec = e;
        this.clientsLine = customers;
        this.adjustmentPeriod = adjustmentPeriod;
        countServer = c;
        // Start with a single teller:
        for (int i = 0; i < countServer; i++) {
            Server server = new Server(clientsLine);
            exec.execute(server);
            workingServers.add(server);
        }
    }


    public void adjustServerNumber() {

        if ((clientsLine.size() / (workingServers.size()*3)) > 2) {

            if(restingServers.size() > 0) {
                Server server = restingServers.remove();
                server.serveWebClientsLine();
                workingServers.offer(server);
                return;
            }
        }


        if (workingServers.size() > 1 && clientsLine.size()/ workingServers.size()*3<1){
            reassignOneServer();
        }

    }

    // Give a teller a different job or a break:
    private void reassignOneServer() {
        Server server = workingServers.poll();
        server.doSomethingElse();
        restingServers.offer(server);
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(adjustmentPeriod);
                adjustServerNumber();
                System.out.print(clientsLine + " { ");
                for (Server teller : workingServers)
                    System.out.print(teller.shortString() + " ");
                System.out.println("} \n");
            }
        } catch (InterruptedException e) {
            System.out.println(this + "interrupted");
        }
        System.out.println(this + "terminating");
    }

    public String toString() {
        return "ServerManager ";
    }

    public PriorityQueue<Server> getWorkingServers() {
        return workingServers;
    }
}
