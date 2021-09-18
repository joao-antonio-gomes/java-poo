public class Account {
    private double funds;
    private int agency;
    private int number;
    private String owner;
    private static int accountAmount;

    public Account(int agency, int number) {
        this.agency = agency;
        this.number = number;
        Account.accountAmount++;
    }

    public double getFunds() {
        return funds;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static int getAccountAmount() {
        return accountAmount;
    }

    public boolean validateTransaction(double amount) {
        if (amount <= 0) {
            System.out.println("You must enter a valid number!");
            return false;
        }
        if (this.funds < amount) {
            System.out.println("You didn't has this amount in your bank account!");
            return false;
        }
        return true;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("You must enter a valid number!");
            return;
        }
        this.funds += amount;
    }

    public void withdraw(double amount) {
        if (!validateTransaction(amount)) {
            return;
        }
        this.funds -= amount;
    }

    public void transfer(Account account, double amount) {
        if (!validateTransaction(amount)) {
            return;
        }
        this.withdraw(amount);
        account.deposit(amount);
    }
}
