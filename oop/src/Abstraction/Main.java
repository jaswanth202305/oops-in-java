/**
 * Day 12-Jun-2025 of DSA Journey in Java Author: Jaswanth Date: 12-Jun-2025
 */
package Abstraction;

public class Main {
    public static void main() {
        doCal(new myCalculation1());
        doCal(new myCalculation2());

    }

    public static void doCal(Calculation cal) {
        cal.add();
        cal.subtraction();
        cal.multiplication();
        cal.division();
    }
}

