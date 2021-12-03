package com.marcelodebittencourt;

import java.util.ArrayList;

public class Clients {
    static ArrayList<Client> clientArrayList = new ArrayList<Client>();

    static int maxId = 0;

    static void add(Client client) {
        clientArrayList.add(client);
    }

    static boolean isEmpty() {
        return clientArrayList.isEmpty();
    }

    public static void addClients() {
        Client c1 = new Client(++maxId, "Joao");
        clientArrayList.add(c1);
        Client c2 = new Client(++maxId, "Maria");
        clientArrayList.add(c2);
    }

    static Client getClient(int arrayIndexPosition) {
        return clientArrayList.get(arrayIndexPosition);
    }

    public static int getNumberOfRegisteredClients() {
        if (clientArrayList.isEmpty())
            return 0;
        else
            return clientArrayList.size();
    }

    public static String list() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Client client : clientArrayList) {
            stringBuilder.append(client.toString());
        }
        return stringBuilder.toString();
    }

    public static void deleteAllRegisteredClients() {
        clientArrayList.clear();
    }

    public static int getNextId() {
        return ++maxId;
    }

}
