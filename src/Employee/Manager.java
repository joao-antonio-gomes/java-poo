package Employee;

public class Manager extends Employee {
    private int password;

    public boolean authenticate(int senha) {
        return this.password == senha;
    }

    public double getBonus() {
        return 150;
    }
}
