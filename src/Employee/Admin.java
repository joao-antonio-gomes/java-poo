package Employee;

public class Admin extends Employee implements AuthPerson {
    private int password;

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean authenticate(int senha) {
        return this.password == senha;
    }

    @Override
    public double getBonus() {
        return 50;
    }
}
