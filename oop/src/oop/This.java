/**
 * Day 08-Jun-2025 of DSA Journey in Java Author: Jaswanth Date: 08-Jun-2025
 */
package oop;

// creating the class Course contains name,code,limit of courses
class Course {
    String courseName;
    String courseCode;
    int enrollmentLimit;

    // creating the constructer with one parameters and remining will be pre-determined using this
    // keyword
    public Course(String courseName) {
        this(courseName, "Java2028", 100);
    }
    // creating the constructer with two parameters and remining will be pre-determined using this
    // keyword

    public Course(String courseName, String courseCode) {
        this(courseName, courseCode, 100);
    }
    // creating the constructer with three parameters

    public Course(String courseName, String courseCode, int enrollmentLimit) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.enrollmentLimit = enrollmentLimit;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Enrollment Limit: " + enrollmentLimit);
    }
}


public class This {

    public static void main(String[] args) {


        Course course1 = new Course("Introduction to Java");
        Course course2 = new Course("Advanced Java", "ADVJAV2018");
        Course course3 = new Course("Data Strucutures", "DSA2019", 100);
        course1.displayCourseInfo();
        course2.displayCourseInfo();
        course3.displayCourseInfo();
    }

}
