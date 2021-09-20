package br.com.bytebank.bank.tests;

import br.com.bytebank.bank.modelo.Employee.Admin;
import br.com.bytebank.bank.modelo.Employee.Manager;
import br.com.bytebank.bank.modelo.RestrictSystem.RestrictSystem;

public class TestSystem {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setPassword(2222);

        Admin admin = new Admin();
        admin.setPassword(2223);

        RestrictSystem system = new RestrictSystem();
        system.authenticate(manager);
        system.authenticate(admin);
    }
}
