package EPAM_LECTURE_6.COFFEE_POINT.service;

import EPAM_LECTURE_6.COFFEE_POINT.model.Client;

import java.util.LinkedList;

public class ClientManager {
    private static LinkedList<Client> clients = new LinkedList<>();

    public static Client getClient(String fullName){
        for (Client client : clients) {
            if(client.getFullName().equals(fullName)){
                return client;
            }
        }
        Client newClient = new Client(fullName);
        clients.add(newClient);
        return newClient;
    }

    public static LinkedList<Client> getClients() {
        return clients;
    }
}
