package concurrency.task35.web_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
Exercise 35: (8) Modify BankTellerSimulation.java so that it represents Web clients making requests of a fixed
number of servers.
The goal is to determine the load that the group of servers can handle.
 */
public class WebServiceSimulation {
    static final int MAX_LINE_SIZE = 50;
    static final int ADJUSTMENT_PERIOD = 1000;
    static final int COUNT_SERVERS = 3;

    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();

        WebClientsLine customers = new WebClientsLine(MAX_LINE_SIZE);

        ServerManager serverManager = new ServerManager(exec, customers, ADJUSTMENT_PERIOD, COUNT_SERVERS);
        exec.execute(new ClientsGenerator(customers,serverManager));
        exec.execute(serverManager);

        if (args.length > 0) // Optional argument
            TimeUnit.SECONDS.sleep(new Integer(args[0]));
        else {
            System.out.println("Press ‘Enter’ to quit");
            System.in.read();
        }
        exec.shutdownNow();
    }
}
