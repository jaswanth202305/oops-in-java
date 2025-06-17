/**
 * Day 02-Jun-2025 of DSA Journey in Java Author: Jaswanth Date: 02-Jun-2025
 */
package oop;

public class super_keyword {
    public static void main(String[] args) {
        Car myCar = new Car("toyota", "corolla", 2015, 5);
        Truck myTruck = new Truck("Ford", "F-150", 2019, 12.58);

        myCar.displayDetails();
        System.out.println();
        myTruck.displayDeatils();
    }
}


class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}


class Car extends Vehicle {
    int seatingCapacity;

    public Car(String make, String model, int year, int seatingCapacity) {
        super(make, model, year);
        this.seatingCapacity = seatingCapacity;
    }

    public void displayDetails() {
        System.out.println("Car make: " + make);
        System.out.println("Car model: " + model);
        System.out.println("Manufacture year: " + year);
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}


class Truck extends Vehicle {
    double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public void displayDeatils() {
        System.out.println("Truck make: " + make);
        System.out.println("Truck model: " + model);
        System.out.println("Manufacturing year: " + year);
        System.out.println("Payload Capacity: " + payloadCapacity);
    }
}
