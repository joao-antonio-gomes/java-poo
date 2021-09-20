package br.com.bytebank.bank.modelo.Account;

public class DepositAccount extends Account {
    public DepositAccount(int agency, int number) {
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
}
