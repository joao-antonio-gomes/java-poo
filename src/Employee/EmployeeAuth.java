package Employee;

public abstract class EmployeeAuth extends Employee {
    private int password;

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean authenticate(int senha) {
        return this.password == senha;
    }

}
