package com.marcelodebittencourt;

import java.util.ArrayList;

public class Rooms {

    static ArrayList<Room> roomArrayList = new ArrayList<Room>();

    static int maxId = 0;

    public static void add(Room room) {
        roomArrayList.add(room);
    }

    static boolean isEmpty() {
        return roomArrayList.isEmpty();
    }

    public static void addRooms() {
        Room roomStandard = new Room(++maxId, "Standard Suite Double", 500);
        roomArrayList.add(roomStandard);
        Room roomLuxo = new Room(++maxId, "Luxo Suite Double", 1000);
        roomArrayList.add(roomLuxo);
    }

    static Room getRoom(int arrayIndexPosition) {
        return roomArrayList.get(arrayIndexPosition);
    }

    public static int getNumberOfRegisteredRooms() {
        if (roomArrayList.isEmpty())
            return 0;
        else
            return roomArrayList.size();
    }

    public static String listAllRegisteredRooms() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Room room : roomArrayList) {
            stringBuilder.append(room.toString());
        }
        return stringBuilder.toString();
    }

    public static void deleteAllRegisteredRooms() {
        roomArrayList.clear();
    }

    public static int getNextId() {
        return ++maxId;
    }
}