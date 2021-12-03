package com.marcelodebittencourt;

import java.util.ArrayList;
import java.util.Calendar;

public class Reservations {

    static ArrayList<Reservation> reservationArrayList = new ArrayList<Reservation>();

    static int maxId = 0;

    static void add(Reservation reservation) {
        reservationArrayList.add(reservation);
    }

    static boolean isEmpty() {
        return reservationArrayList.isEmpty();
    }

    public static void addReservations() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2021, 12, 8);
        Calendar c2 = Calendar.getInstance();
        c2.set(2021, 12, 15);
        Reservation reservation1 = new Reservation(++maxId, Rooms.getRoom(0), Clients.getClient(0), c1, c2);
        reservationArrayList.add(reservation1);
    }

    static Reservation getReservation(int arrayIndexPosition) {
        return reservationArrayList.get(arrayIndexPosition);
    }    

    public static int getNumberOfReservations() {
        if (reservationArrayList.isEmpty())
            return 0;
        else
            return reservationArrayList.size();
    }

    public static String list() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Reservation reservation : reservationArrayList) {
            stringBuilder.append(reservation.toString());
        }
        return stringBuilder.toString();
    }

    public static void deleteAllRegisteredReservations() {
        reservationArrayList.clear();
    }

    public static int getNextId() {
        return ++maxId;
    }

}
