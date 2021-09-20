package br.com.bytebank.bank.modelo.Account;

public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String msg) {
        super(msg);
    }
}
