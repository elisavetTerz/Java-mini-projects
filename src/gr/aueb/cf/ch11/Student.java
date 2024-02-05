package gr.aueb.cf.ch11;

import java.util.Scanner;

/**
 * simple class definition, default modifier is package private
 * access modifier for fields (variables): public, private, protected, default (package private)
 * This is a data class with private fields + default constructor + setters / getters: JavaBean
 */
public class Student {
    //Encapsulation: private fields
    private static int instancesCount; //static members: belong to class not instances
    private int id;
    private String firstname;
    private String lastname;
    private static Scanner in;
    //static block gia archicopoihsh
    static {
        in = new Scanner(System.in);
        int num = in.nextInt();
        instancesCount = (num == 1) ? 1 : 0;
    }
    // Default Constructor: NO return, is called default bc has NO parameters
    //JVM provides this default constructor even if we do not write it
    public Student() {
        instancesCount++;
        id = 0;
        firstname = null;
        lastname = null;
    }
    //Overloaded: constructor is a method with the same name and different params
    public Student (int id, String firstname, String lastname) {
        instancesCount++; //Student.instancesCount++
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //we need special methods: setters and getters
    public void setId(int id) {this.id = id;}
    public int getId() {return id;}
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public String getFirstname() {return firstname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
    public String getLastname() {return  lastname;}

    //static methods give access only to static fields
    public static int getInstancesCount() {
        return instancesCount;
    }
}

