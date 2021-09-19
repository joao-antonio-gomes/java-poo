package Account;

public class InsufficientAmountException extends RuntimeException {

    public InsufficientAmountException(String msg) {
        super(msg);
    }

}
