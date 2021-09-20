package br.com.bytebank.bank.modelo.Employee;

public class Manager extends Employee implements AuthPerson {
    private AuthenticatorUtil authenticator;

    public Manager() {
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

    @Override
    public double getBonus() {
        return 150;
    }
}
