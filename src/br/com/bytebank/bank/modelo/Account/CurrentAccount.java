package br.com.bytebank.bank.modelo.Account;

import br.com.bytebank.bank.modelo.Employee.Dutiable;

public class CurrentAccount extends Account implements Dutiable {
    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("You must enter a valid number!");
            return;
        }
        double accountAmount = this.getFunds();
        this.setFunds(accountAmount += amount);
    }

    @Override
    public boolean withdraw(double amount) {
        double amountWithTax = amount + 0.2;
        return super.withdraw(amountWithTax);
    }

    @Override
    public double getDutyValue() {
        return super.getFunds() * 0.01;
    }
}
