/**
 * Day 05-May-2025 of DSA Journey in Java Author: Jaswanth Date: 05-May-2025
 */
package demo;

import java.util.ArrayList;

public class GitDemo {

    public static void main(String[] args) {

        // for (int i = 1; i <= n; i--) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= n; j++) {
        // System.out.print(" ");
        // }
        // System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i <= 5; i++) {
        // System.out.println(i);
        // if (i % 2 == 0) {
        // continue;
        // }
        //
        // }
        // int i = 1;
        // while (i <= 5) {
        // if (i == 3) {
        // continue;
        // }
        // System.out.print(i);
        // i++;
        // }


        // outer: while (i <= 4) {
        // inner: while (j <= 3) {
        //
        // if (i == 2) {
        // break outer;
        // }
        // System.out.println("i: " + i + " j: " + j);
        // j++;
        // }
        // i++;
        // }

        // outer: do {
        // inner: do {
        // if (i == 2) {
        // break outer;
        // }
        // System.out.println("i: " + i + " j: " + j);
        // j++;
        // } while (j <= 3);
        // i++;
        // } while (i <= 4);

        int count = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {

                if (i >= 3) {
                    System.out.print(count);
                    count++;
                } else {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("----------------");
        int lo = 12;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {

                if (i == 1) {
                    System.out.print(lo);

                    lo--;
                } else {
                    System.out.print(lo + " ");
                    lo--;
                }
            }
            System.out.println();
        }

        int[] arr = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }
        for (int i : arr2) {
            list.add(i);
        }
        System.out.println(list);

    }
}
