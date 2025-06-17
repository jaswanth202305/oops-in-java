/**
 * Day 09-Jun-2025 of DSA Journey in Java Author: Jaswanth Date: 09-Jun-2025
 */
// upcasting overriding both combine we can do polymorpism(1:many)
// upcasting the object of child class is refering the varble of the parant class
package oop;

class Developer {
    void work() {
        System.out.println("Developer is working.");
    }

    void project() {
        System.out.println("Developer is dowing the project.");
    }
}


class JavaDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("Java Developer is workling.");
    }

    @Override
    void project() {
        System.out.println("Java Developer is dowing the java project.");
    }
}


class PythonDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("Python Deveoper is working.");
    }

    @Override
    void project() {
        System.out.println("Python Developer is dowing the Python project.");
    }
}


public class upcasting {
    public static void main(String[] args) {
        Developer JavDev = new JavaDeveloper();
        Developer PayDev = new PythonDeveloper();
        JavDev.work();
        JavDev.project();
        PayDev.work();
        PayDev.project();
    }
}

