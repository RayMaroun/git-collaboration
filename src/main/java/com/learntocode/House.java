package com.learntocode;

public class House {
    private int size;
    private String location;

    public House(int size, String location) {
        this.size = size;
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
