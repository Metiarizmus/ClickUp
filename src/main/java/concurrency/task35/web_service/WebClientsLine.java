package concurrency.task35.web_service;

import java.util.concurrent.ArrayBlockingQueue;

public class WebClientsLine extends ArrayBlockingQueue<WebClients> {

    public WebClientsLine(int maxLineSize) {
        super(maxLineSize);
    }

    public String toString() {
        if (this.size() == 0)
            return "[Empty]";
        StringBuilder result = new StringBuilder();
        for (WebClients clients : this)
            result.append(clients);
        return result.toString();
    }
}
