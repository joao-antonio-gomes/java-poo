package RestrictSystem;

import Employee.EmployeeAuth;
import Employee.Manager;

public class RestrictSystem {
    private int senha = 2222;

    public void authenticate (EmployeeAuth employeeAuth) {
        boolean isAuthenticated = employeeAuth.authenticate(this.senha);
        String message = isAuthenticated ? "Pode entrar no sistema" : "Não pode entrar no sistema";
        System.out.println(message);
    }
}
