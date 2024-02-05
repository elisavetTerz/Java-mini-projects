package gr.aueb.cf.ch17.clone;

import java.io.Serializable;
import java.util.Objects;

public class Trainee implements Cloneable, Serializable {
    private static final long serialVersionUID = 123456L;
    private String name; //Immutable
    private City city; //Not immutable

    private transient int hashCode; //

    public Trainee() {
    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    //Create a `Copy Constructor`
    public Trainee(Trainee trainee) {
        this.name = trainee.getName();
//        this.city = trainee.getCity() , we copy only the reference bc City is mutable
        this.city = new City(trainee.getCity()); //this is the city of Trainee class and uses the Copy Constructor of city to create a deep copy of city
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return new City(getCity());
    }

    public void setCity(City city) {
        this.city = new City(city.getDescription());
    }

    @Override
    //Deep copy creation
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee = (Trainee) super.clone(); //Typecast
        City city1 = new City(getCity().getDescription()); //City is mutable so clone() returns a shallow copy, but we want a deep, so we create a city1
        trainee.setCity(city1);
        return trainee;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trainee trainee = (Trainee) o;

//        if (!Objects.equals(name, trainee.name)) return false;
//        return Objects.equals(city, trainee.city);
        return Objects.equals(city, trainee.city) && Objects.equals(name, trainee.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
