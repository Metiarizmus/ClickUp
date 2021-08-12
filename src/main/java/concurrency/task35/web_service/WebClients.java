package concurrency.task35.web_service;

import java.util.Arrays;

public class WebClients {
    private final int serviceTime;
    private final String request;

    public WebClients(int serviceTime, String request) {
        this.serviceTime = serviceTime;
        this.request = request;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public String toString() {
        return "[" + serviceTime + " request = " + request + "]";
    }
}
