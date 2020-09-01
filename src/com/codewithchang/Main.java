package com.codewithchang;

public class Main {

    public static void main(String[] args) {
	var vehicle = new Car();
	vehicle.make = "Honda";
	vehicle.model = "Accord";
	vehicle.year = 2019;

	System.out.println("This car is a " + vehicle.year + " " + vehicle.make + " " + vehicle.model);
    }
}

class Car
{
    public String make;
    public String model;
    public int year;
}
