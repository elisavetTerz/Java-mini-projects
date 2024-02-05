package gr.aueb.cf.ch11;

/**
 * Driver class
 */
public class Main {

    public static void main(String[] args) {
        //create an instance of class Student
        //new Student() is the constructor, is a method with same name as class
        //Default constructor: Student()
        //alice is an instance of constructor Student()
        Student alice = new Student(); //we use the default constructor
        Student mark = new Student(4, "Mark", "Z."); //overloaded constructor
        mark.setId(5);

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W");

        System.out.println("ID: " + alice.getId());
        System.out.println("FIRSTNAME: " + alice.getFirstname());
        System.out.println("LASTNAME: " + alice.getLastname());

        System.out.println("Instances Count: " + Student.getInstancesCount());

    }
}
