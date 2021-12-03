package com.marcelodebittencourt;

public class Client {
    int id;
    String name;

    public Client(int id, String name) {
        setId(id);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id <= 0)
            throw new IllegalArgumentException("Id must not greater than zero");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
            throw new IllegalArgumentException("Name must have at least 1 letter");
        this.name = name;
    }

    public String toString() {
        return "ID: " + getId() + " NAME: " + getName();
    }

}

