package com.codewithchang;

public class Main {

    public static void main(String[] args) {
//        Vehicle toyota = new Vehicle("white", "Toyota", false);
//        System.out.println(toyota);
//        toyota.setColor("blue");
//        System.out.println(toyota);
//        System.out.println(toyota.getColor());
//        Vehicle honda = new Vehicle("red", "Honda", true);
//        System.out.println(honda);
        Toyota myCar = new Toyota("Green", true, "Camry", "XSE", "V6", true, false);
        System.out.println(myCar);
        myCar.setColor("purple");
        System.out.println(myCar.getColor());
    }
}
