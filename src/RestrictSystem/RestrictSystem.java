package RestrictSystem;

import Employee.AuthPerson;

public class RestrictSystem {
    private int senha = 2222;

    public void authenticate (AuthPerson authPerson) {
        boolean isAuthenticated = authPerson.authenticate(this.senha);
        String message = isAuthenticated ? "Pode entrar no sistema" : "Não pode entrar no sistema";
        System.out.println(message);
    }
}
