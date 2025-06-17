/**
 * Day 09-Jun-2025 of DSA Journey in Java Author: Jaswanth Date: 09-Jun-2025
 */
package oop;

//
//// polymorphism using both upcasting and overridden mothods
////
// class School {
// void attend() {
// System.out.println("Attended to school.");
// }
// }
//
//
// class Teacher extends School {
// @Override
// void attend() {
// System.out.println("Teacher is attended to the school.");
// }
// }
//
//
// class Students1 extends School {
// @Override
// void attend() {
// System.out.println("Student is attended to the school.");
// }
// }
//
//
// public class polymorphism {
// public static void main(String[] args) {
// // upcasting
// School Tsh = new Teacher();
// Tsh.attend();
// School Ssh = new Students1();
// Ssh.attend();
// }
// }


class Robot {

    void learn() {
        System.out.println("Robo is learning.");
    }

    void charge() {
        System.out.println("Robo is charging.");
    }

    void tasks() {
        System.out.println("Robo is dowing the daily tsaks.");
    }
}


public class polymorphism {
    public static void main(String[] args) {
        System.out.println("Robot 1 is completed");
        Robot robo1 = new Robot();
        operateRobo(robo1);
        System.out.println("Robot 2 is completed");
        Robot robo2 = new Robot();
        operateRobo(robo2);
    }

    public static void operateRobo(Robot robo) {
        robo.learn();
        robo.charge();
        robo.tasks();
    }
}
//
// import java.util.Scanner;
//
//
// public class polymorphism {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
//
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// System.out.print("this are repeted numbers:");
//
// for (int i = 0; i < arr.length - 1; i++) {
// if (arr[i] == arr[i + 1]) {
// System.out.print(arr[i] + ",");
// int count = 0;
// for (int j = 1; j <= arr[i]; j++) {
// if (arr[i] % j == 0) {
// count++;
// }
// if (count == 2) {
// System.out.println("\n p " + arr[i]);
// }
//
// }
// }
// }
// }
// }
