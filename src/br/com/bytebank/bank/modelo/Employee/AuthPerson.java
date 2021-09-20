package br.com.bytebank.bank.modelo.Employee;

public abstract interface AuthPerson {
    public abstract void setPassword(int password);

    public abstract boolean authenticate(int senha);
}
