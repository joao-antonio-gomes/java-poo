package br.com.bytebank.bank.tests;

import br.com.bytebank.bank.modelo.Account.CurrentAccount;
import br.com.bytebank.bank.modelo.Account.DepositAccount;

public class TestAccount {
    public static void main(String[] args) {
        try {
            CurrentAccount ca = new CurrentAccount(111, 111);
            ca.deposit(100);

            DepositAccount da = new DepositAccount(222, 222);
            da.deposit(200);

            ca.transfer(da, 200);

            System.out.println(da.getFunds());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
