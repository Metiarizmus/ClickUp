package concurrency.task35.web_service;

import java.util.Random;

public class ClientsGenerator implements Runnable {
    private WebClientsLine clients;
    ServerManager serverManager;
    private static Random rand = new Random(47);

    public ClientsGenerator(WebClientsLine cq, ServerManager s) {
        serverManager = s;
        clients = cq;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                //TimeUnit.MILLISECONDS.sleep(rand.nextInt(300));
                if(serverManager.getWorkingServers().size() > 1 &&
                        clients.size() / serverManager.getWorkingServers().size() < 2) {

                    clients.put(new WebClients(rand.nextInt(1000), generateRequest(1)[0]));
                }
            }
        } catch (InterruptedException e) {
            System.out.println("CustomerGenerator interrupted");
        }
        System.out.println("CustomerGenerator terminating");
    }

    private static String[] generateRequest(int numberOfWords) {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for (int i = 0; i < numberOfWords; i++) {
            char[] word = new char[random.nextInt(8) + 3];
            for (int j = 0; j < word.length; j++) {
                word[j] = (char) ('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }
}
