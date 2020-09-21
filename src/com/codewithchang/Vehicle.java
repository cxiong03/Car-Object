package com.codewithchang;

public class Vehicle {
    private String color;
    private boolean is4x4;
    private int tires;

    /**
     * This is our default constructor
     */
//    public Vehicle() {
//
//    }
    public Vehicle (String color, boolean is4x4){
        this.color = color;
        this.is4x4 = is4x4;
        this.tires = 4;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public boolean getIs4x4() {
        return is4x4;
    }

    public void setIs4x4(boolean is4x4) {
        this.is4x4 = is4x4;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", is4x4=" + is4x4 +
                ", tires=" + tires +
                '}';
    }
}
