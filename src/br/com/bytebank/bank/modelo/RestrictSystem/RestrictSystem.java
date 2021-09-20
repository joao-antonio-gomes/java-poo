package br.com.bytebank.bank.modelo.RestrictSystem;

import br.com.bytebank.bank.modelo.Employee.AuthPerson;

public class RestrictSystem {
    private int password = 2222;

    public void authenticate (AuthPerson authPerson) {
        boolean isAuthenticated = authPerson.authenticate(this.password);
        String message = isAuthenticated ? "Pode entrar no sistema" : "Não pode entrar no sistema";
        System.out.println(message);
    }
}
