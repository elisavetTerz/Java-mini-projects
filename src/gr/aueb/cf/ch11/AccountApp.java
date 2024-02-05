package gr.aueb.cf.ch11;

public class AccountApp {

    public static void main(String[] args) {
        Account alice = new Account(1, "GR1233", "Alice", "W.", "A103", 1000);
        Account bob = new Account(2, "GR1234", "Bob", "D.", "B100", 500);

        try {
            alice.deposit(400.50);
            System.out.println("Successful deposit");
            bob.withdraw(100, "B100");
            System.out.println("Successful withdraw");
            alice.accountToString();
            bob.accountToString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
