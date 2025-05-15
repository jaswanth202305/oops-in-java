/**
 * Day 14-May-2025 of DSA Journey in Java Author: Jaswanth
 */

package numberSystem;

public class NumberManipulationSystem {

    public static void main(String[] args) {
        // Call the methods here to test them
        reverseNumber(1234);
        countDigits(1234);
        checkPrime(13);
        printPrimesInRange(4, 15);
        factorialForLoop(5);
        factorialDoWhile(5);
        fibonacciUptoN(5);
        fibonacciFromStartToEnd(5, 10);
        sumOfDigits(1234);
        printSquares(5);
        printCubes(5);
    }

    // 1. Reverse a number
    public static void reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number /= 10;
        }
        System.out.println("Reversed Number: " + reverse);
    }

    // 2. Count digits in a number
    public static void countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Digit Count: " + count);
    }

    // 3. Check if a number is prime
    public static void checkPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }

    // 4. Print all prime numbers in a given range
    public static void printPrimesInRange(int start, int end) {
        System.out.println("Prime numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // 5. Factorial using for loop
    public static void factorialForLoop(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial (for loop): " + fact);
    }

    // 6. Factorial using do-while
    public static void factorialDoWhile(int n) {
        int fact = 1;
        int i = n;
        do {
            fact *= i;
            i--;
        } while (i >= 1);
        System.out.println("Factorial (do-while): " + fact);
    }

    // 7. Fibonacci sequence up to n terms
    public static void fibonacciUptoN(int n) {
        int first = 0, second = 1;
        System.out.println("Fibonacci up to " + n + " terms:");
        if (n >= 1)
            System.out.println(first);
        if (n >= 2)
            System.out.println(second);

        for (int i = 3; i <= n; i++) {
            int fib = first + second;
            System.out.println(fib);
            first = second;
            second = fib;
        }
    }

    // 8. Fibonacci sequence from start to end index
    public static void fibonacciFromStartToEnd(int start, int end) {
        int first = 0, second = 1;
        System.out.println("Fibonacci from index " + start + " to " + end + ":");

        for (int i = 0; i <= end; i++) {
            if (i >= start) {
                System.out.println(i + " = " + first);
            }
            int fib = first + second;
            first = second;
            second = fib;
        }
    }

    // 9. Sum of digits
    public static void sumOfDigits(int n) {
        int sum = 0;
        do {
            sum += n % 10;
            n /= 10;
        } while (n != 0);
        System.out.println("Sum of digits: " + sum);
    }

    // 10. Print squares from 1 to n
    public static void printSquares(int n) {
        System.out.println("Squares from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "^2 = " + (i * i));
        }
    }

    // 11. Print cubes from 1 to k
    public static void printCubes(int k) {
        System.out.println("Cubes from 1 to " + k + ":");
        for (int i = 1; i <= k; i++) {
            System.out.println(i + "^3 = " + (i * i * i));
        }
    }
}
