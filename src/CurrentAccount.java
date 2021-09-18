public class CurrentAccount extends Account {
    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void withdraw(double amount) {
        double amountWithTax = amount + 0.2;
        super.withdraw(amountWithTax);
    }
}
