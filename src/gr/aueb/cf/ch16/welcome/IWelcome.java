package gr.aueb.cf.ch16.welcome;

public interface IWelcome {
    // The abstract method should be overridden in the class which implements the interface, but not the default or static
    void saySomething(String message);

    default void sayHelloCodingFactory() {
        System.out.println("Hello ");
        sayCodingFactory();
    }
    private void sayCodingFactory() {
        System.out.println("Coding Factory");
    }

    static void sayHelloCoding() {
        System.out.println("Hello ");
        sayCoding();
    }

    private static void sayCoding() {
        System.out.println("Coding");
    }
}
