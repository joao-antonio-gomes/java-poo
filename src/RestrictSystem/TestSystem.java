package RestrictSystem;

import Employee.Admin;
import Employee.Manager;

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
