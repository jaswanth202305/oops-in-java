/**
 * Day 11-Jun-2025 of DSA Journey in Java Author: Jaswanth Date: 11-Jun-2025
 */
package oop;
//
// public class Abstraction {
//
// public static void main(String[] args) {
// // TODO Auto-generated method stub
//
// Engine ch = new Car1();
// ch.ride();
// ch.start();
// ch.stop();
//
// }
//
// }
//
//
//// in here we have engine any way are chinging int child class we are not using so
//// unnessary it is there. now our hero will come abstraction will paly the major role
//// we can use abstract class and method which we are using or overriding in child class
//// we can use abstract class it will just remove unsessary things in here just we not have return
//// any thing
// abstract class Engine {
// abstract void start();
// // {
// // System.out.println("Engine start.");
// // }
//
// abstract void ride();
// // {
// // System.out.println("Started riding.");
// // }
//
// abstract void stop();
// // {
// // System.out.println("Engine stop.");
// // }
// }
//
//
// class Car1 extends Engine {
// @Override
// void start() {
// System.out.println("Car has started.");
// }
//
// @Override
// void ride() {
// System.out.println("Car is riding.");
// }
//
// @Override
// void stop() {
// System.out.println("Car is stoped.");
// }
// }

public class Abstraction {

    public static void main(String[] args) {
        Abs abs = new Noabs();
        abs.attend();
        abs.ended();
        abs.name();
    }
}


abstract class Abs {
    abstract void name();

    abstract void attend();

    abstract void ended();
}


class Noabs extends Abs {

    void name() {
        System.out.println("my name is: 🚗");
    }

    void attend() {
        System.out.println("Attend the class 🚗");
    }

    void ended() {
        System.out.println("Ended the class  🚗");
    }
}


abstract class BothOf extends Abs {

    abstract void name();

    void attend() {
        System.out.println("Attend the class 🚗");
    }

    void ended() {
        System.out.println("Ended the class  🚗");
    }

}

