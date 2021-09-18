package Employee;

import Account.CurrentAccount;

public class TestDutiable {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount(111, 111);
        currentAccount.deposit(100);

        LifeInsurance lifeInsurance = new LifeInsurance();

        DutyCalculator dutyCalculator = new DutyCalculator();
        dutyCalculator.register(lifeInsurance);
        dutyCalculator.register(currentAccount);

        System.out.println(dutyCalculator.getDuty());
    }
}
