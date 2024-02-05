package gr.aueb.cf.ch15.accounts.exceptions;

public class NegativeAmountException extends Exception {
    private static final long serialVersionUID = 15467L;

    public NegativeAmountException() {
        super("Amount insufficient");
    }

    public NegativeAmountException(double amount) {

    }
}
