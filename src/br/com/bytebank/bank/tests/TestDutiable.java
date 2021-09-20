package br.com.bytebank.bank.tests;

import br.com.bytebank.bank.modelo.Account.CurrentAccount;
import br.com.bytebank.bank.modelo.Employee.DutyCalculator;
import br.com.bytebank.bank.modelo.Employee.LifeInsurance;

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
