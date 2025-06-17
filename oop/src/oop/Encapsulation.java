/**
 * Day 23-May-2025 of DSA Journey in Java Author: Jaswanth Date: 23-May-2025
 */
package oop;
//
// import java.util.Scanner;
//
// class Calculater {
// private int num1;
// private int num2;
// private int result;
//
// public int add(int a, int b) {
// num1 = a;
// num2 = b;
// result = num1 + num2;
// return num1 + num2;
// }
//
// public int subtract(int a, int b) {
// num1 = a;
// num2 = b;
// result = num1 - num2;
// return result;
// }
//
// public int multiply(int a, int b) {
//
// num1 = a;
// num2 = b;
// result = num1 * num2;
// return result;
// }
//
// public int divide(int a, int b) {
// num1 = a;
// num2 = b;
// if (num2 != 0) {
// result = num1 / num2;
// return result;
// } else {
// return 0;
// }
// }
// }
//
//
// public class Encapsulation {
// public static void main(String[] args) {
// Calculater cal = new Calculater();
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a and b values:");
// int num1 = sc.nextInt();
// int num2 = sc.nextInt();
// System.out.println("Addition: " + cal.add(num1, num2));
// System.out.println("Subtraction: " + cal.subtract(num1, num2));
// System.out.println("Multiplay: " + cal.multiply(num1, num2));
// System.out.println("Divison: " + cal.divide(num1, num2));
//
// }
//
// }

// Constructer
// -->it is a special setter method
// -->it will have same name as a class name, and within the same class
// -->it does mot have any return type
// -->it will be created while we are creating the object

// class Student {
// private int rollNumber;
// private String name;
// private String batch;
// private int totalmarks;
//
// Student(int a, String b, String c, int d) {
// rollNumber = a;
// name = b;
// batch = c;
// totalmarks = d;
// }
//
// void display() {
// System.out.println("Roll Number: " + rollNumber);
// System.out.println("Name: " + name);
// System.out.println("Btach: " + batch);
// System.out.println("Total marks: " + totalmarks);
// System.out.println();
// }
// }
//
//
// public class Encapsulation {
// public static void main(String[] args) {
// // becasue we are using constructer so we can pass the values while we are creating the
// // object
// Student s1 = new Student(101, "jaswanth", "Btach-A", 150);
// s1.display();
// Student s2 = new Student(102, "Ganesh", "Btach-B", 189);
// s1.display();
// Student s3 = new Student(103, "Varms", "Btach-C", 176);
// s1.display();
// }
// }


// student and teacher attendance system
// public class Encapsulation {
// // this is teachers class
// public static void main(String[] args) {
// // Creating student object with parameters
// Student s1 = new Student(101);
// s1.setName("jaswanth");
// s1.setRollNumber(102);
// s1.setStudentAttendence(true);
// s1.gettingStudnetAttedeance();
// }
// }
//
//
// class Student {
// int rollNumber;
//
// public int getRollNumber() {
// return rollNumber;
// }
//
// public void setRollNumber(int rollNumber) {
// this.rollNumber = rollNumber;
// }
//
// public String getName() {
// return name;
// }
//
// public void setName(String name) {
// this.name = name;
// }
//
// String name;
// private boolean isAttended;
//
// // Student Constructor
// public Student(int rollNumber) {
// // we use this because the variable name is same in this class to make this we use this in
// // java so we can achieve this in java
// this.rollNumber = rollNumber;
// }
//
// // setting the attendance
// public void setStudentAttendence(boolean flag) {
// if (!isAttended)
// isAttended = true;
// System.out.println("Teacher assigned the attendednc to studnet Roll Number " + rollNumber
// + " and Name is " + name);
// }
//
// // getting attendance
// public boolean gettingStudnetAttedeance() {
// return isAttended;
// }
//
// }

// student and library system
class Student {
    private int StudentId;
    private String StudentName;
    private int BookId;
    private String BookName;
    private boolean isreturn;

    // setting Student id
    public void StudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    // getting Student Id
    public int StudentId() {
        return StudentId;
    }

    // setting Student Name
    public void StudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    // getting student name
    public String StudentName() {
        return StudentName;
    }

    // getting book id
    public int getBookId() {
        return BookId;
    }

    // setting book id
    public void setBookId(int bookId) {
        BookId = bookId;
    }

    // getting book name
    public String getBookName() {
        return BookName;
    }

    // setting book name
    public void setBookName(String bookName) {
        BookName = bookName;
    }


    public boolean isIsreturn() {
        return isreturn;
    }

    public void setIsreturn(boolean isreturn) {
        this.isreturn = true;
        if (!isreturn) {
            this.isreturn = isreturn;
            System.out.println("You have not return the book ");
        } else {
            System.out.println("You have return the book");
        }
    }

    public void displayDetails() {
        System.out.println("Student Name is: " + StudentName);
        System.out.println("Student Roll number is: " + StudentId);
        System.out.println("Book Id is: " + BookId);
        System.out.println("Book Name is: " + BookName);


    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.StudentName("Ravi");
        s1.StudentId(101);
        s1.setBookId(4712);
        s1.setBookName("Physis 101");
        s1.setIsreturn(true);

        s1.displayDetails();
    }
}
