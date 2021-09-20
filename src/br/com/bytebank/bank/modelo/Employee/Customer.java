package br.com.bytebank.bank.modelo.Employee;

public class Customer implements AuthPerson {
    private String name;
    private AuthenticatorUtil authenticator;


    public Customer() {
        this.authenticator = new AuthenticatorUtil();
    }

    @Override
    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }

    @Override
    public boolean authenticate(int password) {
        return this.authenticator.authenticate(password);
    }
}
