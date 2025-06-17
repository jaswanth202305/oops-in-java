/**
 * Day 03-Jun-2025 of DSA Journey in Java Author: Jaswanth Date: 03-Jun-2025
 */
package oop;

//
// public class inherit_this_constructer_and_super_consturcter {
//
// public static void main(String[] args) {
// // TODO Auto-generated method stub
// Programmer2 prg = new Programmer2(10, 15);
// prg.display1();
// prg.display2();
// Programmer2 pgg2 = new Programmer2(16);
// pgg2.display1();
// pgg2.display2();
//
// }
//
// }
//
//
// class Programmer1 {
// int a;
// int b;
//
// public Programmer1() {
// this(11, 22);
// a = 10;
// b = 20;
// }
//
// public Programmer1(int a, int b) {
// super();
// this.a = a;
// this.b = b;
// }
//
// public void display1() {
// System.out.println("Inside display 1");
// System.out.println(a);
// System.out.println(b);
// }
// }
//
//
// class Programmer2 extends Programmer1 {
// int x;
// int y;
//
// public Programmer2() {
// super(14, 15);
// x = 17;
// y = 19;
// }
//
// public Programmer2(int x, int y) {
// this(20);
// this.x = x;
// this.y = y;
// }
//
// public Programmer2(int x) {
// this.x = x;
// y = 20;
// }
//
// public void display2() {
// System.out.println("Inside Display 2");
// System.out.println(x);
// System.out.println(y);
// System.out.println(a);
// System.out.println(b);
// }
// }
//
public class inherit_this_constructer_and_super_consturcter {
    public static void main(String[] args) {
        Prg2 p = new Prg2(11, 12);
        p.display1();
        p.display2();
        Prg2 p1 = new Prg2(5, 8);
        p1.display1();
        p1.display2();

    }
}


class Prg1 {
    int x;
    int y;

    // Constructer with zero parameters
    public Prg1() {
        // calling constructer using this()keyword with 1 parameter but with in the same class prg1
        this(0);
        x = 1;
        y = 2;
    }

    // Constructe with 1 parameters
    public Prg1(int x) {
        // calling the constructer With 2 parameters and sending them 3,4 as a values in the same
        // prg1
        this(3, 4);
    }

    // Constructer with 2 parameters
    public Prg1(int x, int y) {
        // now this will go to it childs parent class with it will be object
        super();
        this.x = x;
        this.y = y;
    }

    // displaying the details
    public void display1() {
        System.out.println("Inside the Display 1");
        System.out.println(x);
        System.out.println(y);
    }
}


class Prg2 extends Prg1 {
    int a;
    int b;

    public Prg2() {
        super();
        a = 5;
        b = 6;
    }

    public Prg2(int x, int y) {
        super(8, 9);
        this.x = x;
        this.y = y;
    }

    public Prg2(int x) {
        this.x = x;
        y = 9;
    }

    public void display2() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
