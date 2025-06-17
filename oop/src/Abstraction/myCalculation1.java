/**
 * Day 12-Jun-2025 of DSA Journey in Java Author: Jaswanth Date: 12-Jun-2025
 */
package Abstraction;

public class myCalculation1 implements Calculation {
    public void add() {
        int a = 10;
        int b = 10;
        System.out.println("Addition: " + a + b);
    }

    @Override
    public void subtraction() {
        int a = 10;
        int b = 10;
        System.out.println("Subtraction: " + (a - b));
    }

    @Override
    public void multiplication() {
        int a = 10;
        int b = 10;
        System.out.println("Multiplaction: " + (a * b));
    }

    @Override
    public void division() {
        int a = 10;
        int b = 10;
        System.out.println("Division: " + (a / b));
    }
}

