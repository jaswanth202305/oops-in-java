/**
 * Day 26-May-2025 of DSA Journey in Java Author: Jaswanth Date: 26-May-2025
 */
package oop;

class Students {
    int id;
    String name;
    // this is wrong because we are not following the name constrain because x has no meaning
    // Student(int x,String y){
    // id = x;
    // name = y;
    // }
    // this in here we are following the name constrain but they is problem the method local values
    // and instance values if they reference then they must have same names
    // Student(int stdId,String stdName){
    // id = stdId;
    // name = stdName;
    // }

    Students(int id, String name) {
        // in here both are local variables j v m does not know which local and which is globle so
        // we use this key word in order to over come this problem 'this' keyword problem is called
        // as shadowing problem
        // local,local
        // id = id;
        // name = name;
        // instance,local
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Id is: " + id);
        System.out.println("Name is: " + name);
    }
}


public class shadowig_problem {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Students s1 = new Students(101, "jaswanth");
        s1.display();

        Students s2 = new Students(102, "ganesh");
        s2.display();

    }

}

