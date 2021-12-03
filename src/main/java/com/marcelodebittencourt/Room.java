package com.marcelodebittencourt;

public class Room {

    int id;
    String name;
    double pricePerDay;

    public Room(int id, String name, double pricePerDay) {
        setId(id);
        setName(name);
        setPricePerDay(pricePerDay);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String toString() {
        return "ID: " + getId() + " NAME: " + getName() + " PRICE PER DAY: " + getPricePerDay() + "\n";
    }

}
