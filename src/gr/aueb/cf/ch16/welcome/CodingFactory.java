package gr.aueb.cf.ch16.welcome;

public class CodingFactory implements IWelcome {
    @Override
    public void saySomething(String message) {
        System.out.println("Please write the message: " + message);
    }

    //default method of Interface. NOT necessary to do Override that method
    @Override
    public void sayHelloCodingFactory() {
        IWelcome.super.sayHelloCodingFactory(); //we need super to call the default method of interface
        System.out.println("\u2764".repeat(5));
    }

}
