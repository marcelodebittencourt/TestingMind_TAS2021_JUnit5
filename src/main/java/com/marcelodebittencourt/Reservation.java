package com.marcelodebittencourt;

import java.util.Calendar;

public class Reservation {

    int id;
    Room room;
    Client client;
    Calendar checkin;
    Calendar checkout;

    public Reservation(int id, Room room, Client client, Calendar checkin, Calendar checkout) {
        if(checkout.before(checkin))
            throw new IllegalArgumentException("Checkout must be after checkin");
        setId(id);
        setRoom(room);
        setClient(client);
        setCheckin(checkin);
        setCheckout(checkout);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Calendar getCheckin() {
        return checkin;
    }

    public void setCheckin(Calendar checkin) {
        this.checkin = checkin;
    }

    public Calendar getCheckout() {
        return checkout;
    }

    public void setCheckout(Calendar checkout) {
        this.checkout = checkout;
    }

    public String toString() {
        return "ID: " + getId() +
                " ROOM NAME: " + room.getName() +
                " CLIENT NAME: " + client.getName() +
                " CHECK-IN: " + checkin.get(Calendar.DAY_OF_MONTH) + "/" +
                checkin.get(Calendar.MONTH) + "/" +
                checkin.get(Calendar.YEAR) +
                " CHECK-OUT: " + checkout.get(Calendar.DAY_OF_MONTH) + "/" +
                checkout.get(Calendar.MONTH) + "/" +
                checkout.get(Calendar.YEAR) +
                "\n";
    }

}
