package gr.aueb.cf.ch19.cfcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Unmodifiable list: List<String> cities = List.of("Athens", "Paris", "London");
        List<String> cities = new ArrayList<>(List.of("Athens", "Paris", "London")); //populate the List with List.of
        Iterator<String> itr = cities.iterator();

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        cities.removeIf(c -> c.equals("London"));
// traverse the list with iterator
        while (itr.hasNext()) {
            String s = itr.next();
            if (s.equals("London")) itr.remove(); //cities.remove(s);
            System.out.println(s);

        }

        // Enhanced for is based in iterator
        for (String s : cities) {
            System.out.println(s);
        }

        // forEach() is a method which takes a consumer
        // cities.forEach(city -> System.out.println(city));
        cities.forEach(System.out::println); //method reference replaces the Lambda expression
     }
}
