package gr.aueb.cf.ch16.abstractclasses;

public class Cat  extends Animal {

    //It is necessary to override the abstract methods of an abstract class which is extended.
    @Override
    public void speak() {
        System.out.println("Niaou");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("... cat ate all her food");
    }
}
