package br.com.bytebank.bank.modelo.Employee;

public class AuthenticatorUtil {
    private int password;

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean authenticate(int senha) {
        return this.password == senha;
    }
}
