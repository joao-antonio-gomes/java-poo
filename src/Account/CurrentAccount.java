package Account;

import Employee.Dutiable;

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
    public void withdraw(double amount) {
        double amountWithTax = amount + 0.2;
        super.withdraw(amountWithTax);
    }

    @Override
    public double getDutyValue() {
        return super.getFunds() * 0.01;
    }
}
