/**
 * Day 05-Jun-2025 of DSA Journey in Java Author: Jaswanth Date: 05-Jun-2025
 */
package oop;

// public class inherited_super_this_final {

// public static void main(String[] args) {
// // creating the object for child inherited class
// Second ch = new Second();
// // calling the display method in child class
// A2 std = new A2();
// std.stdDisplay();
// // we can't change value of 'x' variable because we used final keyword while we are initilizing
// the variable
// //std.x = 99;--error
//
// }
// }
//
//
// class First {
// int x = 10;
//
// void display() {
// System.out.println("Inside the parent class");
// System.out.println(x);
// }
// }
//
//
// class Second extends First {
// int x = 99;
//
// void display() {
// System.out.println("Inside the child class");
// System.out.println(x);
// // calling the parent variable x
// System.out.println(super.x);
// // calling this class variable
// System.out.println(this.x);
// // calling parent class display
// super.display();
// }
// }
//
//
//// class using final
// class A1 {
// final int x = 100;
//
// final void displayStd() {
// System.out.println("Totla exam marks for: " + x);
// }
// }
//
//
// class A2 extends A1 {
// int stdMarks = 55;
//
//
//
// void stdDisplay() {
// // calling parent displaystd method
// super.displayStd();
// System.out.println("student marks obtained :" + stdMarks);
//
// }
// }
import java.util.Scanner;

public class inherited_super_this_final {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.takeInput();
        r1.calculateArea();
        r1.dipslay();
        Circle c1 = new Circle();
        c1.takeInput();
        c1.calculateArea();
        c1.dipslay();

    }
}


class shap {
    double area;

    void takeInput() {
        System.out.println("Take user input");
    }

    void calculateArea() {
        System.out.println("Calculating the area");
    }

    final void dipslay() {
        System.out.println("Area is: " + area);
    }
}


final class Rectangle extends shap {
    double length;
    double width;

    @Override
    void takeInput() {
        System.out.println("Enter length and breath: ");
        Scanner sc1 = new Scanner(System.in);
        length = sc1.nextDouble();
        width = sc1.nextDouble();
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Rectangle: ");
        area = length * width;
    }
}


final class Circle extends shap {
    double radius;

    @Override
    void takeInput() {
        System.out.println("Enter a radius: ");
        Scanner sc2 = new Scanner(System.in);
        radius = sc2.nextDouble();
    }

    @Override
    void calculateArea() {
        System.out.println("Area od circle: ");
        area = Math.PI * (radius * radius);
    }
}
