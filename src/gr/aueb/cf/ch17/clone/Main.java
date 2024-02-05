package gr.aueb.cf.ch17.clone;

import java.io.*;


public class Main {

    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/elisavet/IdeaProjects/trainee.ser"))) {
            Trainee alice = new Trainee("Alice", new City("Athens"));
            oos.writeObject(alice);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

