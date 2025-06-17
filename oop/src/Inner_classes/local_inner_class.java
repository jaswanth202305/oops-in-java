/**
 * Day 16-Jun-2025 of DSA Journey in Java Author: Jaswanth Date: 16-Jun-2025
 */
package Inner_classes;

// member inner class

class School {
    String schoolName = "Narayana";

    class Student {
        void introduce() {
            System.out.println("i have studied at " + schoolName);
        }
    }

    void showStudentDetails() {
        Student s1 = new Student();
        s1.introduce();
    }
}


public class local_inner_class {
    public static void main(String[] args) {
        School sh = new School();
        sh.showStudentDetails();
        sh.showStudentDetails();
        School.Student ss = sh.new Student();
    }
}

