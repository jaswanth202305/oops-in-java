/**
 * Day 28-May-2025 of DSA Journey in Java Author: Jaswanth Date: 28-May-2025
 */
package oop;

//
// public class singleInheritence {
// public static void main(String[] args) {
// Professor professor = new Professor();
// professor.name = "Jaswanth";
// professor.department = "Computer Science";
//
// professor.introduction();
// professor.condeuctLecture();
//
// }
//
// }
//
//
// class Person {
// String name;
//
// void introduction() {
// System.out.println("Hello my name is " + name);
// }
// }
//
//
// class Professor extends Person {
// String department;
//
// void condeuctLecture() {
// System.out.println(name + " is conducting the lecture in " + department);
// }
// }
// by default the java while create the object class names Object
// class Object {
// Object()
// {
// in here nothing will be present
// }
class Parent {
    int x;

    void display1() {
        System.out.println("Inside the display 1");
        System.out.println(x);
        // by default compiler will create this constructer parent class
        // class Parent() {
        // super();
        // }

    }
}


class Child extends Parent {
    int y;

    void display2() {
        System.out.println("Inside the display 2");
        System.out.println(y);
        // java will create by default Child class constructer and class super()
        // Child(){
        // super in constructers means class the child parent class
        // super();
        // }
    }
}


public class InheritenceOfIngerit {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display1();
        ch.display2();
        // java will create the main class by default decause we not creating and we don't even
        // execute this because we not even creating object for main class
        // main(){

        // super();
        // }
    }
}

