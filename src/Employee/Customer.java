package Employee;

public class Customer implements AuthPerson {
    private String name;
    private int password;

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean authenticate(int senha) {
        return this.password == senha;
    }
}
