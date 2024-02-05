package gr.aueb.cf.ch7;

import java.util.Scanner;

public class IOApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s; //null
        int num;

        System.out.println("*".repeat(10));
        System.out.println("Please insert a strings that ends with whitespace (return/tab/spaces): ");
        s = in.next(); //next reads until the first whitespace and stops
        in.nextLine();
//        num = Integer.parseInt(s); //takes a string and converts it to primitive value
        System.out.println(s);

        System.out.println("Please insert a strings that ends with return: ");
        s = in.nextLine(); //nextLine reads the whitespaces and adds a line
        System.out.println(s);

        //s.isEmpty(); checks if s.length()==0; NOT if the value is NULL
    }
}
